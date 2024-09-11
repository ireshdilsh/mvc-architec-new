/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.ijse.dto;

/**
 *
 * @author Admin
 */
public class ItemDto {
    private String itemCode;
    private String discription;
    private String packSize;
    private double unitPrice;
    private int QuantityOnHand;

    public ItemDto() {
    }

    public ItemDto(String itemCode, String discription, String packSize, double unitPrice, int QuantityOnHand) {
        this.itemCode = itemCode;
        this.discription = discription;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.QuantityOnHand = QuantityOnHand;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the discription
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * @param discription the discription to set
     */
    public void setDiscription(String discription) {
        this.discription = discription;
    }

    /**
     * @return the packSize
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * @param packSize the packSize to set
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the QuantityOnHand
     */
    public int getQuantityOnHand() {
        return QuantityOnHand;
    }

    /**
     * @param QuantityOnHand the QuantityOnHand to set
     */
    public void setQuantityOnHand(int QuantityOnHand) {
        this.QuantityOnHand = QuantityOnHand;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "itemCode=" + itemCode + ", discription=" + discription + ", packSize=" + packSize + ", unitPrice=" + unitPrice + ", QuantityOnHand=" + QuantityOnHand + '}';
    }

    
}
