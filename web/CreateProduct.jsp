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
                                        <h2 class="m-0">Add Product </h2>
                                    </div>
                                </div>
                            </div>
                    <h3 style="color: red; margin: auto; text-align: center">${requestScope.error}</h3>
                            <form action="addProduct" >               
                                
                                <div class="white_card_body">
                                    <div class="row">
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <input type="text" readonly value="${user.getName()}" name="username">
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <input type="text" placeholder="ProductID" name="productid">
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                               <input type="text" placeholder="ProductName" name="productname">
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <input type="number" placeholder="ProductPrice" name="productprice">
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <input type="text" placeholder="Detail" name="detail">
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <input type="date" placeholder="CreateDate" name="createdate">
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <input type="number" placeholder="Quantity" name="quantity">
                                            </div>
                                        </div>


                                        <div class="col-12">
                                            <div class="common_input mb_15">
                                                <select placeholder="Categories" class="category" name="categoryID" >
                                                    <option value="">--Choose Categories ID--</option>
                                                    <option value="B">B</option>
                                                    <option value="A">A</option>
                                                    <option value="D">D</option>
                                                    <option value="PK">PK</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="">
                                            <div class="common_input mb_15">
                                                <input type="text" placeholder="Status" name="status">
                                            </div>
                                        </div>
                                        <div class="col-12">
                                            <div class="create_report_btn mt_30">
                                                <input class="btn_1 radius_btn d-block text-center" type="submit" value="Add Product">
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
