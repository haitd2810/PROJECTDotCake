/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DBContext;
import model.Ship;

/**
 *
 * @author Duy Hai
 */
public class ShipDAO extends DBContext {

    public boolean insertShip(String userID, String CusName, String phone, String address, String RequireDate, String RequireTime, String totalCost) {
        PreparedStatement stm = null;
        if (connection != null) {
            try {
                String sql = " insert into Shipping (userID,[name],phone,[address],RequireDate,RequireTime,totalcost,status) "
                        + " values ( ? , ? , ? , ? , ? , ? , ? , 'preparing')";
                stm = connection.prepareStatement(sql);
                stm.setString(1, userID);
                stm.setString(2, CusName);
                stm.setString(3, phone);
                stm.setString(4, address);
                stm.setString(5, RequireDate);
                stm.setString(6, RequireTime);
                stm.setString(7, totalCost);
                stm.executeUpdate();
                return true;
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }

        return false;
    }

    public String getNewShip() {
        String ShipID = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        if (connection != null) {
            try {
                String sql = "select top (1) * FROM Shipping order by shippingID desc";
                stm = connection.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    ShipID = rs.getString("shippingID");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return ShipID;
    }

    boolean deleteShip(String ShipID) {
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

    List<Ship> listShipOfCus = new ArrayList<>();

    public List<Ship> getShipOfCus(String userID) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        if (connection != null) {
            try {
                String sql = "  select Shipping.*,Order_Items.productID,Order_Items.quantity from Shipping join Order_Items on Order_Items.shippingID=Shipping.shippingID and userID = ?";
                stm = connection.prepareStatement(sql);
                stm.setString(1, userID);
                rs = stm.executeQuery();
                while (rs.next()) {
                    listShipOfCus.add(new Ship(rs.getInt("shippingID"), rs.getInt("userID"), rs.getString("name"),
                            rs.getString("phone"), rs.getString("address"), rs.getDate("RequireDate"),
                            rs.getString("RequireTime"), rs.getDouble("totalcost"), rs.getString("status"), rs.getDouble("quantity"), rs.getString("productID")));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return listShipOfCus;
    }
}
