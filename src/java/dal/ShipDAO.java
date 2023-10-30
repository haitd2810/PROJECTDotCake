/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.DBContext;

/**
 *
 * @author Duy Hai
 */
public class ShipDAO extends DBContext {

    boolean insertShip(String orderID, String userID, String CusName, String phone, String address, String RequireDate, String RequireTime, String totalCost, String status, String productID, String quantity) {
        PreparedStatement stm = null;
        if (connection != null) {
            try {
                String sql = " insert into Shipping (orderID,userID,[name],phone,[address],RequireDate,RequireTime,totalcost,status) "
                        + " values (?  ? , ? , ? , ? , ? , ? , ? , 'preparing')";
                stm = connection.prepareStatement(sql);
                stm.setString(1, orderID);
                stm.setString(2, userID);
                stm.setString(3, CusName);
                stm.setString(4, phone);
                stm.setString(5, address);
                stm.setString(6, RequireDate);
                stm.setString(7, RequireTime);
                stm.setString(8, totalCost);
                stm.executeUpdate();
                return true;
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }

        return false;
    }
    
    boolean deleteShip(String ShipID){
        PreparedStatement stm = null;
        if (connection != null) {
            try {
                String sql = " delete Shipping where shippingID = ? ";
                stm = connection.prepareStatement(sql);
                stm.setString(1, ShipID);
                stm.executeUpdate();
                return true;
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }

        return false;
    }
}
