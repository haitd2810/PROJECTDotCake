/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Duy Hai
 */
public class Ship extends OrderItem{
    private int shipID;
    private int userID;
    private String CusName;
    private String phone;
    private String address;
    private Date RequireDate;
    private String RequireTime;
    private Double totalCost;
    private String statusShip;

    public Ship(int shipID, int userID, String CusName, String phone, String address, Date RequireDate, String RequireTime, Double totalCost, String statusShip, double quantityBuy, String productID) {
        super(quantityBuy, productID);
        this.shipID = shipID;
        this.userID = userID;
        this.CusName = CusName;
        this.phone = phone;
        this.address = address;
        this.RequireDate = RequireDate;
        this.RequireTime = RequireTime;
        this.totalCost = totalCost;
        this.statusShip = statusShip;
    }

    

    
        
    public int getShipID() {
        return shipID;
    }

    public void setShipID(int shipID) {
        this.shipID = shipID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getCusName() {
        return CusName;
    }

    public void setCusName(String CusName) {
        this.CusName = CusName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRequireDate() {
        return RequireDate;
    }

    public void setRequireDate(Date RequireDate) {
        this.RequireDate = RequireDate;
    }

    public String getRequireTime() {
        return RequireTime;
    }

    public void setRequireTime(String RequireTime) {
        this.RequireTime = RequireTime;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public String getStatusShip() {
        return statusShip;
    }

    public void setStatusShip(String statusShip) {
        this.statusShip = statusShip;
    }

    @Override
    public String getProductID() {
        return super.getProductID(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    @Override
    public String getProductName() {
        return super.getProductName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getQuantityBuy() {
        return super.getQuantityBuy(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getImage() {
        return super.getImage(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getProductPrice() {
        return super.getProductPrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
