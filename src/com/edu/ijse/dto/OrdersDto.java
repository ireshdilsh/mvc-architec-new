/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.ijse.dto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class OrdersDto {
    private String o_Id;
    private Date date;
    private String custId;

    public OrdersDto() {
    }

    public OrdersDto(String o_Id, Date date, String custId) {
        this.o_Id = o_Id;
        this.date = date;
        this.custId = custId;
    }

    public String getO_Id() {
        return o_Id;
    }

    public void setO_Id(String o_Id) {
        this.o_Id = o_Id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "OrdersDto{" + "o_Id=" + o_Id + ", date=" + date + ", custId=" + custId + ", detailDtos="  + '}';
    }
    
}
