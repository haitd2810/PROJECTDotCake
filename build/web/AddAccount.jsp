<%-- 
    Document   : AddAccount
    Created on : Oct 18, 2023, 8:07:17 PM
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
        <c:if test="${empty user}">
            <h2>Access Denied. Please login</h2>
            <a href="index.jsp">Click here to go back home</a>
        </c:if>
        <c:if test="${not empty user}">
            <%@include file="MenuAdmin.jsp" %>
            <div class="row body">
                <div class="col-12">
                    <div class="white_card card_height_100 mb_30">
                        <div class="white_card_header">
                            <div class="box_header m-0">
                                <div class="main-title">
                                    <c:if test="${user.getRoleID()==0 || user.getRoleID()==1 }">
                                        <h2 style="text-align: center">Access Denied</h2>
                                    </c:if>
                                    <c:if test="${user.getRoleID()==2}">
                                        <h3 class="m-0">Add Account </h3>
                                    </div>
                                </div>
                            </div>
                                        <form action="addaccount" method="post">
                                              <div class="white_card_body">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="Username" name="Username" required>
                                            <div style="color: red">
                                            ${msg1}
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="Password" name="Password" required>
                                            <div style="color: red">
                                            ${msg2}
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="FullName" name="FullName" required>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="Address" name="Address" required>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="MobileNo" name="MobileNo" required>
                                            <div style="color: red">
                                            ${msg3}
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="common_input mb_15">
                                            <input type="text" placeholder="Email" name="Email" required>
                                            <div style="color: red">
                                            ${msg4}
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-12">
                                        <div> 
                                            <input type="radio" name="role" value="2">Admin
                                            <input type="radio" name="role" value="1">Seller
                                            <input type="radio" name="role" value="0" checked>Customer
                                        </div>
                                    </div>
                                    <center style="color: red">
                                        ${msg}
                                    <div class="col-12">
                                        <div class="create_report_btn mt_30">
                                            <input class="btn_1 radius_btn d-block text-center" type="submit" value="Add Account">
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
