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
public class Bill {
    private String BillID;
    private String shippingID;
    private String status;

    public Bill() {
    }

    public Bill(String BillID, String shippingID, String status) {
        this.BillID = BillID;
        this.shippingID = shippingID;
        this.status = status;
    }

    public String getBillID() {
        return BillID;
    }

    public void setBillID(String BillID) {
        this.BillID = BillID;
    }

    public String getShippingID() {
        return shippingID;
    }

    public void setShippingID(String shippingID) {
        this.shippingID = shippingID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bill{" + "BillID=" + BillID + ", shippingID=" + shippingID + ", status=" + status + '}';
    }
    
}