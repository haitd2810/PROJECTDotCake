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
import model.Cart;

/**
 *
 * @author Duy Hai
 */
public class CartDAO extends MyDAO{
    List<Cart> cart = new ArrayList<>();
    public List<Cart> getCartList() throws SQLException {
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "select * from [ShoppingCart]";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String cartID = rs.getString("CartID");
                int userID = rs.getInt("userID");
                Date CreateDate = rs.getDate("createDateCart");
                Cart cartInfo = new Cart(cartID, userID, CreateDate);
                cart.add(cartInfo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cart;
    }
}
