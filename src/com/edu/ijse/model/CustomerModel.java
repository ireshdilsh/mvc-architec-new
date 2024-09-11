package com.edu.ijse.model;

import com.edu.ijse.db.DBConnection;
import com.edu.ijse.dto.CustomerDto;
import java.sql.*;
import java.util.ArrayList;
public class CustomerModel {

    public String saveCustomer(CustomerDto dto) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String querry = "insert into customer values(?,?,?,?,?,?,?,?,?) ";
        PreparedStatement statement = connection.prepareStatement(querry);
        
        statement.setString(1, dto.getCustID());
        statement.setString(2, dto.getCustTitle());
        statement.setString(3, dto.getCustName());
        statement.setDate(4, new Date(dto.getDob().getTime()));
        statement.setDouble(5, dto.getSalary());
        statement.setString(6, dto.getAddress());
        statement.setString(7, dto.getCity());
        statement.setString(8, dto.getProvince());
        statement.setString(9, dto.getZipCode());
        
        int resp = statement.executeUpdate();
        
        return resp > 0 ? "Success !":"Something went Wrong";
        
    }

    public ArrayList<CustomerDto> getAllCustomer() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String querry = "select * from customer";
        PreparedStatement statement = connection.prepareStatement(querry);
        
        ResultSet set = statement.executeQuery();
        
        ArrayList<CustomerDto>dtos = new ArrayList<>();
        
        while (set.next()) {            
            
           CustomerDto dto = new CustomerDto();
            
           dto.setCustID(set.getString(1));
           dto.setCustTitle(set.getString(2));
           dto.setCustName(set.getString(3));
           dto.setDob(set.getDate(4));
           dto.setSalary(set.getDouble(5));
           dto.setAddress(set.getString(6));
           dto.setCity(set.getString(7));
           dto.setProvince(set.getString(8));
           dto.setZipCode(set.getString(9));
           
           dtos.add(dto);
        }
        return dtos;
    }

    public CustomerDto searchCustomer(String code) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        String querry = "select * from customer where CustID = ?";
        PreparedStatement statement = connection.prepareStatement(querry);
        statement.setString(1, code);
        ResultSet set = statement.executeQuery();
        
        while(set.next()){
           
            CustomerDto dto = new CustomerDto();
            
           dto.setCustID(set.getString(1));
           dto.setCustTitle(set.getString(2));
           dto.setCustName(set.getString(3));
           dto.setDob(set.getDate(4));
           dto.setSalary(set.getDouble(5));
           dto.setAddress(set.getString(6));
           dto.setCity(set.getString(7));
           dto.setProvince(set.getString(8));
           dto.setZipCode(set.getString(9));
           
           return dto;
        }
        
        return null;
    }

    public String deleteCustomer(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String querry = "delete from customer where CustID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(querry);
        preparedStatement.setString(1, id);
        
        int resp = preparedStatement.executeUpdate();
       
        return resp > 0 ?"Delete Success !":"Something Went Wrong";
    }
    
}
