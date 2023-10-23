/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Order;

/**
 *
 * @author Duy Hai
 */
public class OrderDAO extends MyDAO{
    List<Order> Order = new ArrayList<>();
    public List<Order> getOrderList() throws SQLException {
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "select * from [Order]";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String OrderID = rs.getString("orderID");
                Date createDate = rs.getDate("createDateOrder");
                int quantity = rs.getInt("quantity");
                String cartID = rs.getString("cartID");
                Order ord = new Order(OrderID, createDate, quantity, cartID);
                Order.add(ord);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Order;
    }
}
