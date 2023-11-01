/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author kieup
 */
public class CartItem extends image{
        private int iquantity;
    private double price;

    public CartItem() {
    }

    public CartItem(int iquantity, String imageId, String image, String productID, String ProductName, int ProductPrice, String ProductDetail, Date CreateDate, int quantity, String categoryID, String status) {
        super(imageId, image, productID, ProductName, ProductPrice, ProductDetail, CreateDate, quantity, categoryID, status);
        this.iquantity = iquantity;
    }

    public int getIquantity() {
        return iquantity;
    }

    public void setIquantity(int iquantity) {
        this.iquantity = iquantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
