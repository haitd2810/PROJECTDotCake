/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDAO extends MyDAO {

    public User getUser(String Username, String Password) {
        User user;
        xSql = "select * from [User] where username = '" + Username + "' and [password] = '" + Password + "'";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            int userid;
            String name, usern, pass, phone, address, email, avatar;
            int roleID;
            while (rs.next()) {
                userid = rs.getInt("UserID");
                name = rs.getString("Name");
                usern = rs.getString("Username");
                pass = rs.getString("Password");
                phone = rs.getString("phone");
                address = rs.getString("address");
                email = rs.getString("mail");
                avatar = rs.getString("avatar");
                roleID = rs.getInt("roleid");
                user = new User(userid, name, usern, pass, phone, address, email, avatar, roleID);
                return user;
            }
            rs.close();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public User getPhoneAccountByUser(String phonenumber){
        xSql = "Select * from [User] where phone = '" + phonenumber + "'";
        try{
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            int userid;
            String name, usern, pass, phone, address, email, avatar;
            int roleID;
            while(rs.next()){
                User user1 = new User();
                userid = rs.getInt("UserID");
                name = rs.getString("Name");
                usern = rs.getString("Username");
                pass = rs.getString("Password");
                phone = rs.getString("phone");
                address = rs.getString("address");
                email = rs.getString("mail");
                avatar = rs.getString("avatar");
                roleID = rs.getInt("roleid");
                user1 = new User(userid, name, usern, pass, phone, address, email, avatar, roleID);
                return user1;
            }
            ps.close();
            rs.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public User getEmailAccountByUser(String mail1){
        xSql = "Select * from [User] where mail = '" + mail1 + "'";
        try{
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            int userid;
            String name, usern, pass, phone, address, email, avatar;
            int roleID;
            while(rs.next()){
                User user1 = new User();
                userid = rs.getInt("UserID");
                name = rs.getString("Name");
                usern = rs.getString("Username");
                pass = rs.getString("Password");
                phone = rs.getString("phone");
                address = rs.getString("address");
                email = rs.getString("mail");
                avatar = rs.getString("avatar");
                roleID = rs.getInt("roleid");
                user1 = new User(userid, name, usern, pass, phone, address, email, avatar, roleID);
                return user1;
            }
            ps.close();
            rs.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
//    public int getMaxID(){
//        xSql = "select top 1 UserID from User1 order by UserID desc";
//        try{
//            ps = con.prepareStatement(xSql);
//            rs = ps.executeQuery();
//            int id;
//            while(rs.next()){
//                User user = new User();
//                id = rs.getInt("UserID");
//                return id;
//            }
//            rs.close();
//            ps.close();
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//        return 0;
//    }
    public void createNewAccountUser(String Name, String Username, String Password, String Phone, String Email) {
//        int id = getMaxID() + 1;
        xSql = "insert into [User] ([name],username,[password],phone,address,mail,avatar,roleID)"
                + "values (?,?,?,?,null,?,null,0)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, Name);
            ps.setString(2, Username);
            ps.setString(3, Password);
            ps.setString(4, Phone);
            ps.setString(5, Email);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public User getAccountByUser(String user) {
        xSql = "Select * from [User] where username = '" + user + "'";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            int userid;
            String name, usern, pass, phone, address, email, avatar;
            int roleID;
            while (rs.next()) {
                User user1 = new User();
                userid = rs.getInt("UserID");
                name = rs.getString("Name");
                usern = rs.getString("Username");
                pass = rs.getString("Password");
                phone = rs.getString("phone");
                address = rs.getString("address");
                email = rs.getString("mail");
                avatar = rs.getString("avatar");
                roleID = rs.getInt("roleid");
                user1 = new User(userid, name, usern, pass, phone, address, email, avatar, roleID);
                return user1;
            }
            ps.close();
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        UserDAO userdao = new UserDAO();
//        userdao.createNewAccountUser("Hoàng","Nguyen", "123456", "0904240146", "anhhoangthu1463@gmail.com");
//        userdao.getAccountByUser("NguyenHoang");
    }

    public boolean UpdateUser(String name, String email, String phone, String address, String username)
            throws SQLException, ClassNotFoundException {
        PreparedStatement stm = null;
        try {
            //1. Connect DB
            if (con != null) {
                //2. Create SQL String
                String sql = "Update [User] "
                        + "SET name = ?, mail = ?, phone = ?, address = ? "
                        + "WHERE username = ?";
                //3. Create Statement
                stm = con.prepareStatement(sql);
                stm.setString(1, name);
                stm.setString(2, email);
                stm.setString(3, phone);
                stm.setString(4, address);
                stm.setString(5, username);
                //4. Excute Query
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    List<Product> product = new ArrayList<>();

    public List<Product> getProduct() throws SQLException {
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            if (con != null) {
                String sql = "select * from Product";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    String productID = rs.getString("productID");
                    String productName = rs.getString("productName");
                    int productPrice = rs.getInt("productPrice");
                    String detail = rs.getString("detail");
                    Date createDate = rs.getDate("CreateDate");
                    int quantity = rs.getInt("quantity");
                    String categoryID = rs.getString("categoryID");
                    String status = rs.getString("status");
                    Product pro = new Product(productID, productName, productPrice, detail, createDate, quantity, categoryID, status);
                    product.add(pro);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return product;
    }
    List<User> admin = new ArrayList<>();
    public List<User> getAdmin() throws SQLException {
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "select * from [User] where [roleID]=2";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                int userID = rs.getInt("userID");
                String name = rs.getString("name");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String email = rs.getString("mail");
                String avatar = rs.getString("avatar");
                int roleID = rs.getInt("roleID");
                User user = new User(userID, name, username, password, phone, address, email, avatar, roleID);
                admin.add(user);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return admin;
    }
    
    List<User> account = new ArrayList<>();
    public List<User> getAccountList() throws SQLException {
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "select * from [User] where [roleID]=1 or [roleID]=0";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                int userID = rs.getInt("userID");
                String name = rs.getString("name");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String email = rs.getString("mail");
                String avatar = rs.getString("avatar");
                int roleID = rs.getInt("roleID");
                User user = new User(userID, name, username, password, phone, address, email, avatar, roleID);
                admin.add(user);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return admin;
    }
    
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
    
    List<Bill> bill = new ArrayList<>();
    public List<Bill> getBillList() throws SQLException {
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "select * from [Bill]";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String billID = rs.getString("BillID");
                int shipfee = rs.getInt("shipp_fee");
                Date shipDate = rs.getDate("ShipmentDate");
                String status = rs.getString("status");
                String orderID = rs.getString("orderID");
                Bill Bill = new Bill(billID, shipfee, shipDate, status, orderID);
                bill.add(Bill);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bill;
    }
    
    List<Ship> ship = new ArrayList<>();
    public List<Ship> getShipList() throws SQLException {
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "select * from [Ship]";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String shipID = rs.getString("shipID");
                String billID = rs.getString("billID");
                String inforShipper = rs.getString("inforShipper");
                Date shipDate = rs.getDate("shipDate");
                Ship shipInfo = new Ship(shipID, billID, inforShipper, shipDate);
                ship.add(shipInfo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ship;
    }
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
