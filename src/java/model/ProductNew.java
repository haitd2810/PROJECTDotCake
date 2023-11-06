/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.Date;

/**
 *
 * @author quynhh
 */
public class ProductNew {
    private String productID;
    private String ProductName;
    private int ProductPrice;
    private String ProductDetail;
    private Date CreateDate;
    private int quantity;
    private String categoryID;
    private String status;
    private String created_by;

    public ProductNew() {
    }

    public ProductNew(String productID, String ProductName, int ProductPrice, String ProductDetail, Date CreateDate, int quantity, String categoryID, String status, String created_by) {
        this.productID = productID;
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
        this.ProductDetail = ProductDetail;
        this.CreateDate = CreateDate;
        this.quantity = quantity;
        this.categoryID = categoryID;
        this.status = status;
        this.created_by = created_by;
    }

    
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getProductDetail() {
        return ProductDetail;
    }

    public void setProductDetail(String ProductDetail) {
        this.ProductDetail = ProductDetail;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date CreateDate) {
        this.CreateDate = CreateDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }
   
    
}
