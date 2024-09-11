/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.ijse.dto;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class CustomerDto {
    private String custID;
    private String custTitle;
    private String custName;
    private Date dob;
    private double salary;
    private String address;
    private String city;
    private String province;
    private String zipCode;

    public CustomerDto() {
    }

    public CustomerDto(String custID, String custTitle, String custName, Date dob, double salary, String address, String city, String province, String zipCode) {
        this.custID = custID;
        this.custTitle = custTitle;
        this.custName = custName;
        this.dob = dob;
        this.salary = salary;
        this.address = address;
        this.city = city;
        this.province = province;
        this.zipCode = zipCode;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustTitle() {
        return custTitle;
    }

    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "custID=" + custID + ", custTitle=" + custTitle + ", custName=" + custName + ", dob=" + dob + ", salary=" + salary + ", address=" + address + ", city=" + city + ", province=" + province + ", zipCode=" + zipCode + '}';
    }

    
 }
