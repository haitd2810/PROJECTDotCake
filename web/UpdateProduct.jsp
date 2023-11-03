<%-- 
    Document   : UpdateProduct
    Created on : Nov 3, 2023, 12:18:04 AM
    Author     : quynhh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Management Admin</title>

        <link href="css/bootstrap1.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/metisMenu.css" rel="stylesheet" type="text/css"/>
        <link href="css/style1.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

    </head>
    <body class="crm_body_bg">
        <c:set var="user" value = "${sessionScope.USER}"></c:set>
        <c:if test="${empty user}">
            <h2>Access Denied. Please login</h2>
            <a href="index.jsp">Click here to go back home</a>
        </c:if>
        <c:if test="${not empty user}">
            <%@include file="MenuAdmin.jsp" %>
            <div class="row">
                <div class="col-12">
                    <div class="white_card card_height_100 mb_30">
                        <div class="white_card_header">
                            <div class="box_header m-0">
                                <div class="main-title">
                                    <c:if test="${user.getRoleID()==0 }">
                                        <h2 style="text-align: center">Access Denied</h2>
                                    </c:if>
                                    <c:if test="${user.getRoleID()==2 || user.getRoleID()==1 }">
                                        <h2 class="m-0">Update Product </h2>
                                    </div>
                                </div>
                            </div>
                            <c:set var="p" value="${requestScope.productupdate}"/>
                            <form action="updateProduct" method="post" >

                                <div class="white_card_body">
                                    <div class="row">
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <h4> ProductID ( You can not update ProductID)</h4>
                                                <input type="text" readonly name="productid" value="${p.productID}" >
                                                
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <h4>Product Name</h4><input type="text"  name="productname" value="${p.productName}"> 
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <h4>Product Price</h4>
                                                <input type="number"  name="productprice" value="${p.productPrice}">
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <h4>Product Detail</h4>
                                                <input type="text"  name="detail" value="${p.productDetail}">
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <h4>Create Date</h4>
                                                <input type="date"  name="createdate" value="${p.createDate}">
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <h4>Quantity</h4>
                                                <input type="number" name="quantity" value="${p.quantity}">
                                            </div>
                                        </div>


                                        <div class="col-12">
                                            <h4>CategoryID ( You can not update CategoryID) </h4>
                                            <div class="common_input mb_15">
                                                <input  type="text" readonly name="categoryID" value="${p.categoryID}" >
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <h4>Status</h4>
                                                <input type="text"  name="status" value="${p.status}">
                                            </div>
                                        </div>
                                        <div class="col-12">
                                            <div class="create_report_btn mt_30">
                                                <input class="btn_1 radius_btn d-block text-center" type="submit" value="Update Product">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </c:if>
        </c:if>    
    </section>


    <script src=".\js\jquery1-3.4.1.min.js"></script>

    <script src=".\js\bootstrap1.min.js"></script>

    <script src=".\js\metisMenu.js"></script>

    <script src=".\js\custom.js"></script>


</body></html>

