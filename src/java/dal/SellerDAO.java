/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import model.DBContext;
import model.Product;
import model.ProductNew;

/**
 *
 * @author quynhh
 */
public class SellerDAO extends DBContext {

    public void insertProductNew(ProductNew p) {
        String sql = "INSERT INTO [dbo].[Product]\n"
                + "           ([productID]\n"
                + "           ,[productName]\n"
                + "           ,[productPrice]\n"
                + "           ,[detail]\n"
                + "           ,[CreateDate]\n"
                + "           ,[quantity]\n"
                + "           ,[categoryID]\n"
                + "           ,[status]\n"
                + "           ,[created_By])\n"
                + "     VALUES (?,?,?,?,?,?,?, ?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getProductID());
            st.setString(2, p.getProductName());
            st.setInt(3, p.getProductPrice());
            st.setString(4, p.getProductDetail());
            st.setDate(5, (Date) p.getCreateDate());
            st.setInt(6, p.getQuantity());
            st.setString(7, p.getCategoryID());
            st.setString(8, p.getStatus());
            st.setString(9, p.getCreated_by());

            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Product getProductByProductID(String pid) {
        String sql = " SELECT [productID]\n"
                + "      ,[productName]\n"
                + "      ,[productPrice]\n"
                + "      ,[detail]\n"
                + "      ,[CreateDate]\n"
                + "      ,[quantity]\n"
                + "      ,[categoryID]\n"
                + "      ,[status]\n"
                + "  FROM [dbo].[Product]\n"
                + "  Where productID= ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, pid);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Product p = new Product(rs.getString("productID"),
                        rs.getString("productName"),
                        rs.getInt("productPrice"),
                        rs.getString("detail"),
                        rs.getDate("CreateDate"),
                        rs.getInt("quantity"),
                        rs.getString("categoryID"),
                        rs.getString("status"));
                return p;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String sql = "SELECT [categoryID]\n"
                + "      ,[categoryName]\n"
                + "  FROM [dbo].[Category]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Category c = new Category(rs.getString("categoryName"),
                        rs.getString("categoryID"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);

        }
        return list;
    }

    //update a products
    public void updateProduct(Product p) {
        String sql = "UPDATE [dbo].[Product]\n"
                + "   SET [productName] = ?\n"
                + "      ,[productPrice] = ?\n"
                + "      ,[detail] = ? \n"
                + "      ,[CreateDate] = ?\n"
                + "      ,[quantity] = ?\n"
                + "      ,[categoryID] = ?\n"
                + "      ,[status] = ?\n"
                + " WHERE productID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getProductName());
            st.setInt(2, p.getProductPrice());
            st.setString(3, p.getProductDetail());
            st.setDate(4, (Date) p.getCreateDate());
            st.setInt(5, p.getQuantity());
            st.setString(6, p.getCategoryID());
            st.setString(7, p.getStatus());
            st.setString(8, p.getProductID());

            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //xóa category bằng id
    public void delProductNew(String productID) {
        String sql = "DELETE FROM [dbo].[Product]\n"
                + "      WHERE  productID = ? ";
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            st.setString(1, productID);
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }

}
