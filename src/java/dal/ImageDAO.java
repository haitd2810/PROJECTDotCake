/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.DBContext;
import model.image;

/**
 *
 * @author Duy Hai
 */
public class ImageDAO extends DBContext{
    List<image> listimageOfCus = new ArrayList<>();
    public  void getImageOfProOrder(String productID){
        PreparedStatement stm = null;
        ResultSet rs = null;
        if(connection!=null){
            try{
                String sql = "select Product.*,ProductIMG.IMGID, ProductIMG.url from Product join ProductIMG"
                        + " on Product.ProductID = ProductIMG.ProductID and ProductIMG.ProductID = ?";
                stm = connection.prepareStatement(sql);
                stm.setString(1, productID);
                rs = stm.executeQuery();
                while(rs.next()){
                    String img = rs.getString("url");
                    String imageID = rs.getString("IMGID");
                    String ProductID = rs.getString("productID");
                    String productName = rs.getString("productName");
                    int productPrice = rs.getInt("productPrice");
                    String productDetail = rs.getString("detail");
                    Date createDate = rs.getDate("CreateDate");
                    int quantity = rs.getInt("quantity");
                    String categoryID = rs.getString("categoryID");
                    String status = rs.getString("status");
                    image image = new image(img, imageID, ProductID, productName, productPrice, productDetail, createDate, quantity, categoryID, status);
                    listimageOfCus.add(image);
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public List<image> getListimageOfCus() {
        return listimageOfCus;
    }

    public void setListimageOfCus(List<image> listimageOfCus) {
        this.listimageOfCus = listimageOfCus;
    }

    public static void main(String[] args) {
        ImageDAO dao = new ImageDAO();
        System.out.println(dao.listimageOfCus.size());
    }
}
