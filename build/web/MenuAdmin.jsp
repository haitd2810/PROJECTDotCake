<%-- 
    Document   : MenuAdmin
    Created on : Oct 18, 2023, 10:28:45 PM
    Author     : Duy Hai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Management Admin</title>

        <link href="css/bootstrap1.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/metisMenu.css" rel="stylesheet" type="text/css"/>
        <link href="css/style1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="crm_body_bg">

        <c:set var="user" value = "${sessionScope.USER}"></c:set>
        <c:if test="${user.getRoleID()==0}">
            <h2 style="text-align: center; color:red;">Access Denied<br>
            <a href="index.jsp" style="text-align: center;">Click here to go back DotCake</a>
            </h2>
        </c:if>
        <c:if test="${user.getRoleID()==1 || user.getRoleID()==2 }">
            <nav class="sidebar">
                <div class="logo d-flex justify-content-between" style="padding: 22px;">
                    <a class="large_logo" href="index.jsp" style="font-size: 24px;margin-left: 50px;">DotCake</a>
                    <div class="sidebar_close_icon d-lg-none">
                        <i class="ti-close"></i>
                    </div>
                </div>
                <ul id="sidebar_menu" class="metismenu">

                    <c:if test="${user.getRoleID()==2}">
                        <li class="">
                            <a class="has-arrow" href="#" aria-expanded="false">
                                <div class="nav_icon_small">
                                    <img src=".\photo\4.svg" alt="">
                                </div>
                                <div class="nav_title">
                                    <span>Admins</span>
                                </div>
                            </a>
                            <ul class="mm-collapse" style="height: 5px;">
                                <li><a href="AdminList">Admin List</a></li>
                                <li><a href="AddAccount.jsp" class="active">Add New Account</a></li>
                                <li><a href="AccountList" class="active">Account List</a></li>
                            </ul>
                        </li>
                        <li class="">
                            <a class="has-arrow" href="#" aria-expanded="false">
                                <div class="nav_icon_small">
                                    <img src=".\photo\6.svg" alt="">
                                </div>
                                <div class="nav_title">
                                    <span>Product</span>
                                </div>
                            </a>
                            <ul class="mm-collapse" style="height: 5px;">
                                <li><a href="listproduct">Product List</a></li>
                                <li><a href="CreateProduct.jsp" class="active">Add New Product</a></li>
                                <li><a href="#" class="active">Update Product</a></li>
                                <li><a href="#" class="active">Delete Product</a></li>
                            </ul>
                        </li>
                        <li class="">
                            <a class="has-arrow" href="#" aria-expanded="false">
                                <div class="nav_icon_small">
                                    <img src=".\photo\6.svg" alt="">
                                </div>
                                <div class="nav_title">
                                    <span>Order</span>
                                </div>
                            </a>
                            <ul class="mm-collapse" style="height: 5px;">
                                <li><a href="OrderList">Order List</a></li>
                            </ul>
                        </li>
                        <li class="">
                            <a class="has-arrow" href="#" aria-expanded="false">
                                <div class="nav_icon_small">
                                    <img src=".\photo\11.svg" alt="">
                                </div>
                                <div class="nav_title">
                                    <span>Bill</span>
                                </div>
                            </a>
                            <ul class="mm-collapse" style="height: 5px;">
                                <li><a href="BillList">Bill List</a></li>
                            </ul>
                        </li>
                        <li class="">
                            <a class="has-arrow" href="#" aria-expanded="false">
                                <div class="nav_icon_small">
                                    <img src=".\photo\15.svg" alt="">
                                </div>
                                <div class="nav_title">
                                    <span>Ship</span>
                                </div>
                            </a>
                            <ul class="mm-collapse" style="height: 5px;">
                                <li><a href="ShipList">Ship List</a></li>
                            </ul>
                        </li>
                        <li class="">
                            <a class="has-arrow" href="#" aria-expanded="false">
                                <div class="nav_icon_small">
                                    <img src=".\photo\20.svg" alt="">
                                </div>
                                <div class="nav_title">
                                    <span>ShoppingCart</span>
                                </div>
                            </a>
                            <ul class="mm-collapse" style="height: 5px;">
                                <li><a href="CartList">ShoppingCart List</a></li>
                            </ul>
                        </li>
                    </c:if>
                    <c:if test="${user.getRoleID()==1}">
                        <li class="">
                            <a class="has-arrow" href="#" aria-expanded="false">
                                <div class="nav_icon_small">
                                    <img src=".\photo\6.svg" alt="">
                                </div>
                                <div class="nav_title">
                                    <span>Product</span>
                                </div>
                            </a>
                            <ul class="mm-collapse" style="height: 5px;">
                                <li><a href="listproduct">Product List</a></li>
                                <li><a href="CreateProduct.jsp" class="active">Add New Product</a></li>
                                <li><a href="#" class="active">Update Product</a></li>
                                <li><a href="#" class="active">Delete Product</a></li>
                            </ul>
                        </li>
                    </c:if>
            </nav>

            <section class="main_content dashboard_part large_header_bg">

                <div class="container-fluid g-0">
                    <div class="row">
                        <div class="col-lg-12 p-0 ">
                            <div class="header_iner d-flex justify-content-between align-items-center">
                                <div class="sidebar_icon d-lg-none">
                                    <i class="ti-menu"></i>
                                </div>
                                <div class="line_icon open_miniSide d-none d-lg-block">
                                    <img src=".\photo\line_img.png" alt="">
                                </div>
                                <div class="serach_field-area d-flex align-items-center">
                                    <div class="search_inner">
                                        <form action="#">
                                            <div class="search_field">
                                                <input type="text" placeholder="Search">
                                            </div>
                                            <button type="submit"> <img src=".\photo\icon_search.svg" alt=""> </button>
                                        </form>
                                    </div>
                                </div>
                                <div class="profile_info">
                                    <img src="https://png.pngtree.com/png-vector/20190417/ourlarge/pngtree-vector-business-men-icon-png-image_947324.jpg" alt="#">
                                    <div class="profile_info_iner">
                                        <div class="profile_author_name">
                                            <p>Neurologist </p>
                                            <h5>Dr. Robar Smith</h5>
                                        </div>
                                        <div class="profile_info_details">
                                            <a href="profile.jsp">My Profile </a>
                                            <a href="logout">Log Out </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>    
                    </div>
                </div>
            </c:if> 

    </body>
</html>
