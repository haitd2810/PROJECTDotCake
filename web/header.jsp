
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/stylemenu.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Embed css here-->
        <link rel="stylesheet" href="css/styleindex.css">
    </head>
    <body>
        <div class="header_page">
            <div class="container-fluid">
                <div class="row header">
                    <div class="col-md-2 header_search" >
                        <form class="navbar-form navbar-right header_search-form" role="search">
                            <div style="display: flex;"> <input type="text" class="form-control" placeholder="Search" style="font-size: 15px">
                                <button type="submit" class="btn btn-default">
                                    <a title="search" href="#">
                                        <span class="glyphicon glyphicon-search" style="color: grey; font-size: 14px">
                                        </span></a>
                                </button>
                            </div>
                        </form>
                    </div>
                    <div class="col-md-7 header_title">
                        <a href="index.jsp">
                            <span>DotCake</span>
                        </a>
                    </div>
                    <div class="col-md-1 header_buy" style="padding-top: 15px">
                        <a title="Giỏ hàng" href="Hoang_Cart.html">
                            <span class="glyphicon glyphicon-lock" style="color: grey; font-size: 28px"></span>
                        </a>
                    </div>
                    <div class="col-md-1 header_order" style="padding-top: 15px">
                        <a title="order" href="Hoang_Cart.html">
                            <span>Order</span>
                        </a>
                    </div>
                    <c:set var="user" value="${sessionScope.acc}" ></c:set>
                    <c:if test="${empty user}">
                        <div class="col-md-1 header_login" style="padding-top: 15px">
                            <a href="Hoang_SignIn.jsp"><span>Login</span></a>
                        </div>
                    </c:if>
                    <c:if test="${ not empty user}">
                        <div class="col-md-1 header_login" style="padding-top: 15px">
                            <a href="profile.jsp"><span>${user}</span></a>
                        </div>
                    </c:if>

                </div>
            </div>

            <div class = "row header_menu">
                <div class = "navbar header_menu--items">
                    <a href="index.jsp">Home</a>
                    <a href="about.jsp">About</a>
                    <a href="product">Products</a>
                    <a href="ship_ques.jsp">Services</a>
                    <a href="contact.jsp">Contact</a> 
                    <c:set var="user" value = "${sessionScope.USER}"></c:set>
                    <c:if test="${user.getRoleID()==2}">
                        <a href="Admin.jsp">Manage</a>
                    </c:if>
                    <c:if test="${user.getRoleID()==1}">
                        <a href="Admin.jsp">Manage</a>
                    </c:if>
                </div>
            </div>
        </div>
    </body>
</html>
