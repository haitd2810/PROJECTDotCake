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
import model.Product;
import model.ProductNew;

/**
 *
 * @author Duy Hai
 */
public class ProductDAO extends MyDAO {
    List<Product> product = new ArrayList<>();

    public List<Product> getProduct() {
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
    
    List<ProductNew> productNew = new ArrayList<>();
    public List<ProductNew> getProductNew() {
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
                    String created_by= rs.getString("created_By");
                    ProductNew pro = new ProductNew(productID, productName, productPrice, detail, 
                            createDate, quantity, categoryID, status, created_by);
                            
                    productNew.add(pro);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return productNew;
    }
    
    public static void main(String[] args) {
        ProductDAO product=new ProductDAO();
        System.out.println(product.getProduct());
    }
}
