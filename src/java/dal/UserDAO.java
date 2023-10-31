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
import model.Category;
import model.Categoryimg;
import model.OrderItem;
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

    public User getPhoneAccountByUser(String phonenumber) {
        xSql = "Select * from [User] where phone = '" + phonenumber + "'";
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

    public User getEmailAccountByUser(String mail1) {
        xSql = "Select * from [User] where mail = '" + mail1 + "'";
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

    public List<image> getIamge() {
        List<image> image = new ArrayList<>();
        try {
            String sql = "select * from productimg join Product on ProductIMG.productID=Product.productID";
            PreparedStatement pr = connection.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                image.add(new image(rs.getString(2), rs.getString(1), rs.getString(6), rs.getString(8),
                        rs.getInt(9), rs.getString(10), rs.getDate(11), rs.getInt(12), rs.getString(13), rs.getString(14)));
            }
        } catch (Exception e) {
        }
        return image;
    }

    public List<image> searchByName(String name) {
        List<image> image = new ArrayList<>();
        try {
            String sql = "select * from productimg join Product on ProductIMG.productID=Product.productID where productName like ?  ";
            PreparedStatement pr = connection.prepareStatement(sql);
            pr.setString(1, "%" + name + "%");
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                image.add(new image(rs.getString(2), rs.getString(1), rs.getString(6), rs.getString(8),
                        rs.getInt(9), rs.getString(10), rs.getDate(11), rs.getInt(12), rs.getString(13), rs.getString(14)));
            }
        } catch (Exception e) {
        }
        return image;
    }

    public List<Categoryimg> loadProductByCate(String cid) {
        List<Categoryimg> image = new ArrayList<>();
        try {
            String sql = "select * from productimg join Product on ProductIMG.productID=Product.productID join "
                    + "Category on Category.categoryID=Product.categoryID where Product.categoryid = ? ";
            PreparedStatement pr = connection.prepareStatement(sql);
            pr.setString(1, cid);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                image.add(new Categoryimg(rs.getString(16), rs.getString(2), rs.getString(1), rs.getString(6), rs.getString(8),
                        rs.getInt(9), rs.getString(10), rs.getDate(11), rs.getInt(12), rs.getString(13), rs.getString(14)));
            }
        } catch (Exception e) {
        }
        return image;
    }

    public List<Categoryimg> searchByCate(String cname) {
        List<Categoryimg> image = new ArrayList<>();
        try {
            String sql = "select * from productimg join Product on ProductIMG.productID=Product.productID join \n"
                    + "                   Category on Category.categoryID=Product.categoryID where Product.categoryID = ? ";
            PreparedStatement pr = connection.prepareStatement(sql);
            pr.setString(1, cname);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                image.add(new Categoryimg(rs.getString(16), rs.getString(2), rs.getString(1), rs.getString(6), rs.getString(8),
                        rs.getInt(9), rs.getString(10), rs.getDate(11), rs.getInt(12), rs.getString(13), rs.getString(14)));
            }
        } catch (Exception e) {
        }
        return image;
    }

    /////////////////////////////////////////////////////
    public User getAccountByFullName(String name) {
        xSql = "Select * from [User] where  name = '" + name + "'";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            int userid;
            String name1, usern, pass, phone, address, email;
            int roleID;
            while (rs.next()) {
                User user1 = new User();
                userid = rs.getInt("UserID");
                name1 = rs.getString("Name");
                usern = rs.getString("Username");
                pass = rs.getString("Password");
                phone = rs.getString("phone");
                address = rs.getString("address");
                email = rs.getString("mail");
                roleID = rs.getInt("roleid");
                user1 = new User(userid, name1, usern, pass, phone, address, email, roleID);
                return user1;
            }
            ps.close();
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void isertNewAccount(User user) {
        xSql = "insert into [User] values(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getAddress());
            ps.setString(6, user.getMail());
            ps.setInt(7, user.getRoleID());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void getDeleteAcc(String aId) {
        xSql = "delete from [User] where userID =?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, aId);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean getUpdateSeller(String Id) {
        PreparedStatement stm = null;
        try {
            //1. Connect DB
            if (con != null) {
                //2. Create SQL String
                String sql = "Update [User] "
                        + "SET roleID = 1"
                        + "WHERE userID = ?";
                //3. Create Statement
                stm = con.prepareStatement(sql);
                stm.setString(1, Id);
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

    /////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        UserDAO userdao = new UserDAO();
        System.out.println(userdao.loadCategory());
    }

    public Categoryimg loadProduct(String id) {
        try {
            String sql = "select * from productimg join Product on ProductIMG.productID=Product.productID join "
                    + "Category on Category.categoryID=Product.categoryID where Product.productID = ? ";
            PreparedStatement pr = connection.prepareStatement(sql);
            pr.setString(1, id);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                return new Categoryimg(rs.getString(16), rs.getString(2), rs.getString(1), rs.getString(6), rs.getString(8),
                        rs.getInt(9), rs.getString(10), rs.getDate(11), rs.getInt(12), rs.getString(13), rs.getString(14));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Category> loadCategory() {
        List<Category> category = new ArrayList<>();
        try {
            String sql = "select * from Category ";
            PreparedStatement pr = connection.prepareStatement(sql);
//            pr.setString(1, id);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                category.add(new Category(rs.getString(2), rs.getString(1)));
            }
        } catch (Exception e) {
        }
        return category;
    }

    public int getTotalProduct() {
        String sql = "select count(*) from productimg join Product on ProductIMG.productID=Product.productID";
        try {
            PreparedStatement pr = connection.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
    public List<image> pagingProduct(int index) {
        List<image> image = new ArrayList<>();
        try {
            String sql = "select * from productimg join Product on ProductIMG.productID=Product.productID\n"
                    + "order by Product.productID OFFSET ? \n"
                    + "rows fetch next 12 rows only;";
            PreparedStatement pr = connection.prepareStatement(sql);
            pr.setInt(1, (index-1)*12);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                image.add(new image(rs.getString(2), rs.getString(1), rs.getString(6), rs.getString(8),
                        rs.getInt(9), rs.getString(10), rs.getDate(11), rs.getInt(12), rs.getString(13), rs.getString(14)));
            }
        } catch (Exception e) {
        }
        return image;
    }
    public boolean UpdatePassword(String username, String newpassword) throws SQLException {
        PreparedStatement stm = null;

        try {
            if (con != null) {
                String sql = "update [User] set password = ? where username = ? ";
                stm = con.prepareStatement(sql);
                stm.setString(1, newpassword);
                stm.setString(2, username);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (con != null) {
                con.close();
            }
            if (stm != null) {
                stm.close();
            }
        }
        return false;
    }
}
