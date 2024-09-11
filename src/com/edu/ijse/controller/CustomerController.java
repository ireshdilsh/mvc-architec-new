package com.edu.ijse.controller;

import com.edu.ijse.dto.CustomerDto;
import com.edu.ijse.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerController {
    
    private final CustomerModel customerModel;
    
    public CustomerController(){
        this.customerModel = new CustomerModel();
    }

   
     
    public String saveCustomer(CustomerDto dto) throws ClassNotFoundException, SQLException {
        String resp = customerModel.saveCustomer(dto);
        return resp;
    }

    public ArrayList<CustomerDto> getAllItems() throws ClassNotFoundException, SQLException {
        ArrayList<CustomerDto>customerDtos = customerModel.getAllCustomer();
        return customerDtos;
    }

    public CustomerDto serchCustomer(String code) throws SQLException, ClassNotFoundException {
        CustomerDto customerDto = customerModel.searchCustomer(code);
        return customerDto;
    }

    public String deleteCustomer(String id) throws ClassNotFoundException, SQLException {
        String resp = customerModel.deleteCustomer(id);
        return resp;
    }

    public String updateCustomer(CustomerDto dto) throws ClassNotFoundException, SQLException {
        String resp = customerModel.updateCustomer(dto);
        return resp;
    }

}
