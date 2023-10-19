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
public class Cart {
    private String CartID;
    private int userID;
    private Date createDate;

    public Cart() {
    }

    public Cart(String CartID, int userID, Date createDate) {
        this.CartID = CartID;
        this.userID = userID;
        this.createDate = createDate;
    }

    public String getCartID() {
        return CartID;
    }

    public void setCartID(String CartID) {
        this.CartID = CartID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
}
