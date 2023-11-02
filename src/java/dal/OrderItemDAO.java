/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Bill;
import model.Category;
import model.Categoryimg;
import model.OrderItem;
import model.Product;
import model.Ship;
import model.User;
import model.image;
import model.Ship;
public class OrderItemDAO extends MyDAO {

    public boolean InsertOrderItem(String shippingID, String productID, String quantity) {
        PreparedStatement stm = null;
        try {
            if (connection != null) {
                String sql = "insert into Order_Items (shippingID,productID,quantity) values (? , ? , ? )";
                stm = connection.prepareStatement(sql);
                stm.setString(1, shippingID);
                stm.setString(2, productID);
                stm.setString(3,quantity);
                stm.executeUpdate();
                return true;
            }
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }
    public void deleteOrder(String shipID){
        xSql = "delete from Order_Items where shippingID = ?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, shipID);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteOrder1(String shipID1){
        xSql = "delete from Shipping where shippingID = ?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, shipID1);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
