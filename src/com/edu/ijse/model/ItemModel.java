package com.edu.ijse.model;

import com.edu.ijse.db.DBConnection;
import com.edu.ijse.dto.ItemDto;
import java.sql.*;
import java.util.ArrayList;
public class ItemModel {


    public String saveItem(ItemDto itemDto) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String querry = "insert into item values(?,?,?,?,?)";
        
        PreparedStatement preparedStatement = connection.prepareStatement(querry);
        
        preparedStatement.setString(1, itemDto.getItemCode());
        preparedStatement.setString(2, itemDto.getDiscription());
        preparedStatement.setString(3, itemDto.getPackSize());
        preparedStatement.setDouble(4, itemDto.getUnitPrice());
        preparedStatement.setInt(5, itemDto.getQuantityOnHand());
        
        int resp = preparedStatement.executeUpdate();
        
        return resp > 0 ? "Success !":"Fail";
    }

    public ArrayList<ItemDto> getAllItems() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        
        String querry = "select * from item";
        
        PreparedStatement preparedStatement = connection.prepareStatement(querry);
        ResultSet set = preparedStatement.executeQuery();
        ArrayList<ItemDto>itemDtos = new ArrayList<>();
        
        while (set.next()) {            
            ItemDto dto = new ItemDto();
            dto.setItemCode(set.getString(1));
            dto.setDiscription(set.getString(2));
            dto.setPackSize(set.getString(3));
            dto.setUnitPrice(set.getDouble(4));
            dto.setQuantityOnHand(set.getInt(5));
            
            itemDtos.add(dto);
        }
        return itemDtos;
    }

    public ItemDto searchItem(String itemCode) throws SQLException, ClassNotFoundException {
        
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select * from item where ItemCode = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, itemCode);
        
        ResultSet resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()) {            
            ItemDto itemDto = new ItemDto();
            itemDto.setItemCode(resultSet.getString(1));
            itemDto.setDiscription(resultSet.getString(2));
            itemDto.setPackSize(resultSet.getString(3));
            itemDto.setUnitPrice(resultSet.getDouble(4));
            itemDto.setQuantityOnHand(resultSet.getInt(5));
            
            return itemDto;
        }
        return null;
    }


    public String deleteItem(String itemCode) throws ClassNotFoundException, SQLException {
       
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "delete from item where ItemCode = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, itemCode);
        int resp = preparedStatement.executeUpdate();
        
        return resp > 0 ? "Delete Success":"Something Went Wrong";
    }

    public String updaeItem(ItemDto itemDto) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String querry = "update item set Description = ?, PackSize = ?, UnitPrice = ?, QtyOnHand = ? where ItemCode = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(querry);
        
        preparedStatement.setString(1, itemDto.getItemCode());
        preparedStatement.setString(2, itemDto.getDiscription());
        preparedStatement.setString(3, itemDto.getPackSize());
        preparedStatement.setDouble(4, itemDto.getUnitPrice());
        preparedStatement.setInt(5, itemDto.getQuantityOnHand());
        
        int resp = preparedStatement.executeUpdate();
        
        return resp > 0 ?"Update Success !":"Something went Wrong";
    }
    
}
