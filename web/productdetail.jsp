<%-- 
    Document   : productdetail
    Created on : Oct 17, 2023, 8:16:31 PM
    Author     : Duy Hai
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>product detail</title>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/stylemenu.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Embed css here-->
        <link rel="stylesheet" href="css/styleproductdetail.css">
    </head>
    <body>
        <div class="header_page">
            <%@include file="header.jsp" %>
        </div>
        <div class="container-fluid product">

            <div class="product__detail">
                <div class="row">
                    <div class="col-md-6 product__img">
                        <img src="${product.getImage()}"
                             alt="">
                    </div>
                    <div class="col-md-6 product_info">
                        <h3 class="category">${product.getCname()}</h3>
                        <h1 class="name">${product.getProductName()}</h1>
                        <div class="price">
                            <p>Price:<span>${product.getProductPrice()}</span>VND</p>   
                        </div>
                        <h4 class="title">Cà phê & Cốt dừa</h4>
                        <div class="description">
                            <p>
                                ${product.getProductDetail()}
                            </p>
                        </div>
                        <div class="structure">
                            ${product.getCreateDate()}
                            <!--                        <ul>
                                                        <h4>CẤU TRÚC VỊ BÁNH</h4>
                                                        <li>Lớp 01: Phun phủ bơ cacao</li>
                                                        <li>Lớp 02: Kem mousse cà phê</li>
                                                        <li>Lớp 03: Bạt bánh cà phê mềm</li>
                                                        <li>Lớp 04: Kem ngậy dừa non</li>
                                                        <li>Lớp 05: Bạt bánh cà phê mềm</li>
                                                    </ul>-->
                        </div>
                        <div class="size">
                            ${product.getQuantity()}
                            <!--                        <h4>KÍCH THƯỚC</h4>
                                                    <p>Đường kính:<span></span>cm | Chiều cao:<span></span>cm</p>
                                                    <p>Dành cho <span></span> người ăn</p>-->
                        </div>
                        <div class="accessory">
                            ${product.getStatus()}
                            <!--                        <ul>
                                                        <h4>PHỤ KIỆN TẶNG KÈM</h4>
                                                        <li>01 Chiếc nến sinh nhật</li>
                                                        <li>01 Bộ đĩa và dĩa dành cho 10 người</li>
                                                        <li>01 Dao cắt bánh</li>
                                                    </ul>-->
                        </div>
                        <div class="seller__btn">
                            <button class="cart"><a href="">Cart</a></button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer">
            <%@include file="footer.html" %>
        </div>
    </body>
</html>
