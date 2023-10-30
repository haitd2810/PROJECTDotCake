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
        <style>
            .body{
                text-align: center;
            }

        </style>
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
                                    <c:if test="${user.getRoleID()==0 || user.getRoleID()==1}">
                                        <h2 style="text-align: center">Access Denied</h2>
                                    </c:if>
                                    <c:if test="${user.getRoleID()==2}">
                                        <h3 class="m-0"> Account </h3>
                                    </div>
                                </div>
                            </div>
                                        <form action="deleteaccount" method="post">
                            <div class="white_card_body">
                                <div class="row">
                                    <c:set var="account" value="${sessionScope.ACCOUNTLIST}"></c:set>
                                    <c:if test="${not empty account}">
                                        <table border="1">
                                            <thead>
                                                <tr>
                                                    <th>UserID</th>
                                                    <th>Name</th>
                                                    <th>Username</th>
                                                    <th>password</th>
                                                    <th>Phone</th>
                                                    <th>Address</th>
                                                    <th>Mail</th>
                                                    <th>role</th>
                                                    <th>Delete</th>
                                                    <th>Update Account</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach var="dto" items="${account}" varStatus = "counter">                                          
                                                    <tr>
                                                        <td style="border: grey 1px solid;">${dto.getUserID()}</td>
                                                        <td style="border: grey 1px solid;">${dto.getName()}</td>
                                                        <td style="border: grey 1px solid;">${dto.getUsername()}</td>
                                                        <td style="border: grey 1px solid;"><input type="password" value="${dto.getPassword()}"></td>
                                                        <td style="border: grey 1px solid;">${dto.getPhone()}</td>
                                                        <td style="border: grey 1px solid;">${dto.getAddress()}</td>
                                                        <td style="border: grey 1px solid;">${dto.getMail()}</td>
                                                        <c:if test="${dto.getRoleID()==0}">
                                                            <td style="border: grey 1px solid;">Customer</td> 
                                                        </c:if>
                                                        <c:if test="${dto.getRoleID()==1}">
                                                            <td style="border: grey 1px solid;">Seller</td> 
                                                        </c:if>
                                                            <td style="border: grey 1px solid">
                                                                <input type="checkbox" id="myCheckbox" name="iduser" value="${dto.userID}">
                                                            <label for="myCheckbox"></label>
                                                            </td>
                                                        <c:if test="${dto.roleID == 0}">
                                                            <td style="border: grey 1px solid">
                                                <!--<a href="updateaccountseller?id=${dto.userID}" style="border: grey 2px solid"> Update Seller </a>-->
                                                                <button type="Submit" name="button" value="${dto.userID}">Update Seller</button>
                                                            </td>
                                                        </c:if>
                                                        <c:if test="${dto.roleID == 1}">
                                                            <td style="border: grey 1px solid"></td>
                                                        </c:if>
                                                    </tr>
                                                </form>
                                            </c:forEach>
                                            </tbody>
                                            <td></td><td></td><td></td><td></td>
                                            <td></td><td></td><td></td><td></td>
                                            <td>
                                        <div class="delete">
                                        <input type="submit" value="Submit"/>
                                        </div>
                                            </td>
                                        </table>
                                    </c:if>
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
