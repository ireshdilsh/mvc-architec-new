/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.ijse.controller;

import com.edu.ijse.dto.OrdersDto;
import com.edu.ijse.model.OrdersModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class OrdersController {
    
    private final OrdersModel model;
    
    public OrdersController(){
       this.model = new OrdersModel();
    }

    public ArrayList<OrdersDto> getAllOrders() throws ClassNotFoundException, SQLException {
        ArrayList<OrdersDto>dtos = model.getAllOrders();
        return dtos;
    }

    public OrdersDto searchOrder(String orderID) throws ClassNotFoundException, SQLException {
        OrdersDto dto = model.searchOrder(orderID);
        return dto;
    }
    
    
    
}
