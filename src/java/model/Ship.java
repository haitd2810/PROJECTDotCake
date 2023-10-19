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
public class Ship {
    private String shipID;
    private  String billID;
    private String inforShipper;
    private Date ShipDate;

    public Ship() {
    }

    public Ship(String shipID, String billID, String inforShipper, Date ShipDate) {
        this.shipID = shipID;
        this.billID = billID;
        this.inforShipper = inforShipper;
        this.ShipDate = ShipDate;
    }

    public String getShipID() {
        return shipID;
    }

    public void setShipID(String shipID) {
        this.shipID = shipID;
    }

    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    public String getInforShipper() {
        return inforShipper;
    }

    public void setInforShipper(String inforShipper) {
        this.inforShipper = inforShipper;
    }

    public Date getShipDate() {
        return ShipDate;
    }

    public void setShipDate(Date ShipDate) {
        this.ShipDate = ShipDate;
    }
    
}
