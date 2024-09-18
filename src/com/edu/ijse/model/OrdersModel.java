/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.ijse.model;

import com.edu.ijse.db.DBConnection;
import com.edu.ijse.dto.CustomerDto;
import com.edu.ijse.dto.OrderDetailDto;
import com.edu.ijse.dto.OrdersDto;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class OrdersModel {

    public ArrayList<OrdersDto> getAllOrders() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String querry = "select * from orders";
        PreparedStatement preparedStatement = connection.prepareStatement(querry);
        ResultSet rst = preparedStatement.executeQuery();

        ArrayList<OrdersDto> dtos = new ArrayList<>();

        while (rst.next()) {
            OrdersDto dto = new OrdersDto();
            dto.setCustId(rst.getString(1));
            dto.setDate(rst.getDate(2));
            dto.setO_Id(rst.getString(3));

            dtos.add(dto);
        }
        return dtos;
    }

    public OrdersDto searchOrder(String orderID) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String querry = "select * from orders where OrderID = ?";
        PreparedStatement statement = connection.prepareStatement(querry);
        statement.setString(1, orderID);
        ResultSet rst = statement.executeQuery();

        while (rst.next()) {
            OrdersDto dto = new OrdersDto();

            dto.setO_Id(rst.getString(1));
            dto.setDate(rst.getDate(2));
            dto.setCustId(rst.getString(3));

            return dto;
        }

        return null;
    }

    public String saveOrders(OrdersDto dto, ArrayList<OrderDetailDto> orderDetailDtos) throws SQLException, ClassNotFoundException {

        Connection connection = DBConnection.getInstance().getConnection();

        try {
            connection.setAutoCommit(false);

            String orderQuery = "INSERT INTO orders VALUES (?,?,?)";

            PreparedStatement statementForOrder = connection.prepareStatement(orderQuery);
            statementForOrder.setString(1, dto.getO_Id());
            statementForOrder.setDate(2, new Date(dto.getDate().getTime()));
            statementForOrder.setString(3, dto.getCustId());

            if (statementForOrder.executeUpdate() > 0) {

                boolean isOrderDetailsSaved = true;
                String orderDetailQuery = "INSERT INTO orderdetail VALUES (?,?,?,?)";

                for (OrderDetailDto orderDetailModel : orderDetailDtos) {
                    PreparedStatement statementForOrderDetail = connection.prepareStatement(orderDetailQuery);
                    statementForOrderDetail.setString(1, dto.getO_Id());
                    statementForOrderDetail.setString(2, orderDetailModel.getItemCode());
                    statementForOrderDetail.setInt(3, orderDetailModel.getQty());
                    statementForOrderDetail.setDouble(4, orderDetailModel.getDiscount());

                    if (!(statementForOrderDetail.executeUpdate() > 0)) {
                        isOrderDetailsSaved = false;
                    }
                }

                if (isOrderDetailsSaved) {
                    boolean isItemUpdated = true;
                    String itemQuery = "UPDATE item SET QtyOnHand = QtyOnHand - ? WHERE ItemCode = ?";

                    for (OrderDetailDto detailDto : orderDetailDtos) {
                        PreparedStatement statementForItem = connection.prepareStatement(itemQuery);

                        statementForItem.setInt(1, detailDto.getQty());
                        statementForItem.setString(2, detailDto.getItemCode());

                        if (!(statementForItem.executeUpdate() > 0)) {
                            isItemUpdated = false;
                        }
                    }

                    if (isItemUpdated) {
                        connection.commit();
                        return "Success";
                    } else {
                        connection.rollback();
                        return "Item Save Error";
                    }

                } else {
                    connection.rollback();
                    return "Order Detail Save Error";
                }

            } else {
                connection.rollback();
                return "Order Save Error";
            }

        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return e.getMessage();
        } finally {
            connection.setAutoCommit(true);
        }

    }
}
