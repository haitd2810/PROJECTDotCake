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
public class OrderItemDAO extends DBContext {

    boolean InsertOrderItem( String productID, String quantity) {
        PreparedStatement stm = null;
        try {
            if (connection != null) {
                String sql = "insert into Order_Items productID,quantity) values ( ? , ? )";
                stm = connection.prepareStatement(sql);
                stm.setString(1, productID);
                stm.setString(2, quantity);
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
    boolean deleteOrder(String orderID){
        PreparedStatement stm = null;
        if (connection != null) {
            try {
                String sql = " delete Order_Items where orderID = ? ";
                stm = connection.prepareStatement(sql);
                stm.setString(1, orderID);
                stm.executeUpdate();
                return true;
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }

        return false;
    }
}
