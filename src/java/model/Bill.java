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
    private int shipfee;
    private Date shipDate;
    private String status;
    private String orderID;

    public Bill() {
    }

    public Bill(String BillID, int shipfee, Date shipDate, String status, String orderID) {
        this.BillID = BillID;
        this.shipfee = shipfee;
        this.shipDate = shipDate;
        this.status = status;
        this.orderID = orderID;
    }

    public String getBillID() {
        return BillID;
    }

    public void setBillID(String BillID) {
        this.BillID = BillID;
    }

    public int getShipfee() {
        return shipfee;
    }

    public void setShipfee(int shipfee) {
        this.shipfee = shipfee;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    
}
