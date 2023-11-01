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
public class OrderItem extends image{
    private double quantityBuy;
    private String productID;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public OrderItem(double quantityBuy, String productID) {
        this.quantityBuy = quantityBuy;
        this.productID = productID;
    }
    

    public double getQuantityBuy() {
        return quantityBuy;
    }

    public void setQuantityBuy(double quantityBuy) {
        this.quantityBuy = quantityBuy;
    }

    

    
    
    
}
