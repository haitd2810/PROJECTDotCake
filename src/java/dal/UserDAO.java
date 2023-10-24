/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Bill;
import model.Cart;
import model.Order;
import model.Product;
import model.Ship;
import model.User;
import model.image;

public class UserDAO extends MyDAO {

    public User getUser(String Username, String Password) {
        User user;
        xSql = "select * from [User] where username = '" + Username + "' and [password] = '" + Password + "'";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            int userid;
            String name, usern, pass, phone, address, email;
            int roleID;
            while (rs.next()) {
                userid = rs.getInt("UserID");
                name = rs.getString("Name");
                usern = rs.getString("Username");
                pass = rs.getString("Password");
                phone = rs.getString("phone");
                address = rs.getString("address");
                email = rs.getString("mail");
                roleID = rs.getInt("roleid");
                user = new User(userid, name, usern, pass, phone, address, email, roleID);
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
                roleID = rs.getInt("roleid");
                user1 = new User(userid, name, usern, pass, phone, address, email, roleID);
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
                roleID = rs.getInt("roleid");
                user1 = new User(userid, name, usern, pass, phone, address, email,  roleID);
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
        xSql = "insert into [User] ([name],username,[password],phone,address,mail,roleID)"
                + "values (?,?,?,?,null,?,0)";
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
                roleID = rs.getInt("roleid");
                user1 = new User(userid, name, usern, pass, phone, address, email, roleID);
                return user1;
            }
            ps.close();
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
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
                int roleID = rs.getInt("roleID");
                User user = new User(userID, name, username, password, phone, address, email, roleID);
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
                int roleID = rs.getInt("roleID");
                User user = new User(userID, name, username, password, phone, address, email, roleID);
                admin.add(user);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return admin;
    }
    
    public List<image> getIamge(String pid){
        List<image> image=new ArrayList<>();
        try {
            String sql="select * from productimg";
            PreparedStatement pr=connection.prepareStatement(sql);
            pr.setString(1, pid);
            ResultSet rs=pr.executeQuery();
            while(rs.next()){
                image.add(new image(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
        } catch (Exception e) {
        }
        return image;
    }
    
        public static void main(String[] args) {
        UserDAO userdao = new UserDAO();
    }
        
    public Product loadProduct(String id){
        try {
            String sql="select * from product where productid = ? ";
            PreparedStatement pr=connection.prepareStatement(sql);
            pr.setString(1, id);
            ResultSet rs=pr.executeQuery();
            while(rs.next()){
                return new Product(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getInt(6), rs.getString(7), rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }
}
