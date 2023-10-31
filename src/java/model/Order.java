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
public class Order extends Ship{
    private String productID;
    private double quantity;

    public Order(String productID, double quantity, int shipID, int userID, String CusName, String phone, String address, Date RequireDate, String RequireTime, Double totalCost, String status) {
        super(shipID, userID, CusName, phone, address, RequireDate, RequireTime, totalCost, status);
        this.productID = productID;
        this.quantity = quantity;
    }

    public Order(String productID, double quantity) {
        this.productID = productID;
        this.quantity = quantity;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    
    
}
