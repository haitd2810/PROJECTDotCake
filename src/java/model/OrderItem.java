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

    public OrderItem(double quantityBuy) {
        this.quantityBuy = quantityBuy;
    }

    public OrderItem(double quantityBuy, String image, String imageId, String productID, String ProductName, int ProductPrice, String ProductDetail, Date CreateDate, int quantity, String categoryID, String status) {
        super(image, imageId, productID, ProductName, ProductPrice, ProductDetail, CreateDate, quantity, categoryID, status);
        this.quantityBuy = quantityBuy;
    }

    public double getQuantityBuy() {
        return quantityBuy;
    }

    public void setQuantityBuy(double quantityBuy) {
        this.quantityBuy = quantityBuy;
    }

    

    
    
    
}
