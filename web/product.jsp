<%-- 
    Document   : Product
    Created on : Oct 17, 2023, 8:05:03 PM
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
        <title>Product</title>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/stylemenu.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Embed css here-->
        <link rel="stylesheet" href="css/product.css">
        <style>
            .cate{
                margin: 20px 0 20px 20px;
            }

            .cate button{
                border-radius: 30px;
                font-size: 20px;
                margin-right: 10px;
                padding: 5px;
            }

            .cate button a{
                padding: 10px;
                color: #000;
                text-decoration: none;
            }

            .cate button:hover{
                opacity: 0.7;
            }

            a.active{
                color: #fff;
                background: #000;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <div class="header_page">
            <%@include file="header.jsp" %>
        </div>
        <div class="container-fluid product_body">
            <div class="row">
            </div>
            <div class="body">
                <div class="body__bsn">
                    <div class="bsn__header">
                        <h1>PRODUCT</h1>
                        <p>Sản phẩm đặc trưng của DotCake là dòng bánh lạnh cao cấp nhất của Pháp,
                            với sự hài hoà của các tầng hương vị và kết cấu đặc biệt trong từng chiếc bánh.</p>
                    </div>
                    <div class="cate">
                        <c:forEach var="o" items="${category}">
                            <button value="${o.getCid()}" onclick="LoadProbyCate(this)">${o.getCname()}</button>
                        </c:forEach>
                    </div>
                    <div id="productlist" class="row product">
                        <c:forEach var="o" items="${image}">
                            <div class="product_load col-md-3 seller__item" style="padding: 0; border-bottom: 1px solid #000; height: 450px">
                                <a href="ProductDetail?pid=${o.getProductID()}">
                                    <img src="${o.getImage()}" alt="">
                                    <h1>${o.getProductName()}</h1>
                                    <p><span>${o.getProductPrice()}</span>VND</p>
                                    <div class="seller__btn">
                                        <button class="cart"><a href="">Cart</a></button>
                                    </div>
                                </a>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
            <div class="text-center">
                <ul class="pagination pagination-v2 ">
                    <c:if test="${tag>1}">
                        <li><a href="product?index=${tag-1}">Previous</a></li>
                        </c:if>
                        <c:forEach begin="1" end="${endP}" var="i">
                        <li onclick="pagingProduct()" class="${tag == i?"active":""}"><a  href="product?index=${i}">${i}</a></li>
                        </c:forEach>
                        <%--<c:if test="${tag}<${endP}">--%>
                        <li><a href="product?index=${tag+1}">Next</a></li>
                        <%--</c:if>--%> 
                </ul>
            </div>
        </div>

        <%@include file="footer.html" %>
        <script src="js/header.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
        <script>

                            function LoadProbyCate(param) {
                                var value=param.value;
                                $.ajax({
                                    url: "/PRJDOTCAKE/SearchByCate",
                                    type: "get",
                                    data:{
                                        cateid: value
                                    },
                                    success: function (data) {
                                        var product = document.getElementById("productlist");
                                        product.innerHTML = data;
                                    }
                                });
                            }

                            function pagingProduct() {
                                var amount = document.getElementsByClassName("product_load").length;
                                $.ajax({
                                    url: "/PRJDOTCAKE/ProductAjax",
                                    type: "get",
                                    data: {
                                        total: amount
                                    },
                                    success: function (data) {
                                        var product = document.getElementById("productlist");
                                        product.innerHTML = data;
                                    }
                                });
                            }

                            function searchProduct(param) {
                                var txt = param.value;
                                $.ajax({
                                    url: "/PRJDOTCAKE/search",
                                    type: "get",
                                    data: {
                                        search: txt
                                    },
                                    success: function (data) {
                                        var row = document.getElementById("productlist");
                                        row.innerHTML = data;
                                    }
                                });
                            }


        </script>

    </body>
</html>
