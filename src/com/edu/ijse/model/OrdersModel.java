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
        
        ArrayList<OrdersDto>dtos = new ArrayList<>();
        
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

    public String searchCustomer(String id) {
        CustomerDto dto = new CustomerDto();
        String custID = dto.getCustID();
        
        if (custID == id) {
            return custID;
        }
        
        return "fail";
    }

    public String placeOrder(OrdersDto dto, ArrayList<OrderDetailDto> orderDetailDtos) throws ClassNotFoundException, SQLException {
        
        Connection connection = DBConnection.getInstance().getConnection();
        
        String querryForOrders = "insert into orders values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(querryForOrders);
        preparedStatement.setString(1, dto.getO_Id());
        preparedStatement.setDate(2,new Date(dto.getDate().getTime()));
        preparedStatement.setString(3, dto.getCustId());
        
        if (preparedStatement.executeUpdate() > 0) {
            
            // insert data in orderdetail table
            boolean isOrderDetailsSaved = true;
            
            String querryForOrderDeatil = "insert into orderdetail values(?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(querryForOrderDeatil);
              
            for (OrderDetailDto orderDetailDto : orderDetailDtos) {
                statement.setString(1, dto.getO_Id());
                statement.setString(2, orderDetailDto.getItemCode());
                statement.setInt(3, orderDetailDto.getQty());
                statement.setDouble(4,orderDetailDto.getDiscount());
          
            }
            return "Sucess";
        }
        return "Fail";                
    }
    
}
