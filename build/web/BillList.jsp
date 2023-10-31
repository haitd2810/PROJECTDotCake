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
                                    <c:if test="${user.getRoleID()==0 || user.getRoleID()==1 }">
                                        <h2 style="text-align: center">Access Denied</h2>
                                    </c:if>
                                    <c:if test="${user.getRoleID()==2}">
                                        <h3 class="m-0"> Bill List </h3>
                                    </div>
                                </div>
                            </div>
                            <form>
                            <div class="white_card_body">
                                <div class="row">
                                    <c:set var="bill" value="${sessionScope.BILLIST}"></c:set>
                                        <table border="1">
                                                <tr>
                                                    <th>BillID</th>
                                                    <th>ShippingID</th>
                                                    <th>Status</th>
                                                </tr>
                                                <c:forEach var="dto" items="${msg}" varStatus = "counter">
                                                    <tr>
                                                        <td style="border: grey 1px solid;">${dto.getBillID()}</td>
                                                        <td style="border: grey 1px solid;">${dto.getShippingID()}</td>
                                                        <td style="border: grey 1px solid;">${dto.getStatus()}</td>
                                                    </tr>
                                            </c:forEach>
                                        </table>
                                    
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
