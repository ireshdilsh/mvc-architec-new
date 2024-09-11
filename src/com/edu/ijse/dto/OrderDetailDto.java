/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.ijse.dto;

/**
 *
 * @author Admin
 */

public class OrderDetailDto {
    private String orderId;  
    private String itemCode;
    private Integer qty; 
    private Double discount;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String orderId, String itemCode, Integer qty, Double discount) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.discount = discount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailModel{" + "orderId=" + orderId + ", itemCode=" + itemCode + ", qty=" + qty + ", discount=" + discount + '}';
    }
    
    
}


