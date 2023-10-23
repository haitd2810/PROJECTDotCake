<%-- 
    Document   : CreateProduct
    Created on : Oct 18, 2023, 8:08:38 PM
    Author     : Duy Hai
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
                                        <h3 class="m-0">Add Product </h3>
                                    </div>
                                </div>
                            </div>
                            <div class="white_card_body">
                                <div class="row">
                                    <div class="">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="ProductID">
                                        </div>
                                    </div>
                                    <div class="">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="ProductName">
                                        </div>
                                    </div>
                                    <div class="">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="ProductPrice">
                                        </div>
                                    </div>
                                    <div class="">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="Detail">
                                        </div>
                                    </div>
                                    <div class="">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="CreateDate">
                                        </div>
                                    </div>
                                    <div class="">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="Quatity">
                                        </div>
                                    </div>
                                    <div class="">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="Status">
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <div class="common_input mb_15">
                                            <select placeholder="Categories" class="category">
                                                <option value="">--Choose Categorite ID--</option>
                                                <option value="">B</option>
                                                <option value="">A</option>
                                                <option value="">D</option>
                                                <option value="">PK</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <div class="create_report_btn mt_30">
                                            <input class="btn_1 radius_btn d-block text-center" type="submit" value="Add Product">
                                        </div>
                                    </div>
                                </div>
                            </div>
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
