
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
        <link href="css/styleheader.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="header_page">
            <div class="container-fluid">
                <div class="row header">
                    <div class="col-md-2 header_search" >
                        <form class="navbar-form navbar-right header_search-form" role="search" action="SearchByName" method="post">
                            <div style="display: flex;">
                                <input type="text" oninput="searchProduct(this)"  value="${search}" class="form-control" placeholder="Search" name="search" style="font-size: 15px">
                                <button type="submit" class="btn btn-default">
                                    <a title="search" href="#">
                                        <span class="glyphicon glyphicon-search" style="color: grey; font-size: 14px">
                                        </span></a>
                                </button>
                            </div>
                        </form>
                    </div>
                    <c:set var="user" value="${sessionScope.USER}" ></c:set>
                    <c:if test="${empty user}">
                        <div class="col-md-7 header_title">
                            <a href="GoHomePage">
                                <span>DotCake</span>
                            </a>
                        </div>
                        <div class="col-md-1 header_buy" style="padding-top: 15px">
                            <a title="Giỏ hàng" href="#">
                                <span class="glyphicon glyphicon-lock" style="color: grey; font-size: 28px"></span>
                            </a>
                        </div>
                        <div class="col-md-1 header_order" style="padding-top: 15px">
                            <a title="order" href="ListOrderForCustomer?userID=${user.getUserID()}">
                                <span>Ordered</span>
                            </a>
                        </div>
                        <div class="col-md-1 header_login" style="padding-top: 15px">
                            <a href="signin"><span>Login</span></a>
                        </div>
                    </c:if>
                    <c:if test="${ not empty user}">
                        <c:if test="${user.getName().length()<=7}">
                            <div class="col-md-7 header_title">
                                <a href="GoHomePage">
                                    <span>DotCake</span>
                                </a>
                            </div>
                            <div class="col-md-1 header_buy" style="padding-top: 15px">
                                <a title="Giỏ hàng" href="cart.jsp">
                                    <span class="glyphicon glyphicon-shopping-cart" style="color: grey; font-size: 28px"></span>
                                </a>
                            </div>
                            <div class="col-md-1 header_order" style="padding-top: 15px">
                                <a title="order" href="ListOrderForCustomer?userID=${user.getUserID()}">
                                    <span>Ordered</span>
                                </a>
                            </div>
                            <div class="col-md-1 header_login" style="padding-top: 15px">
                                <a href="GoProfilePage"><span>${user.getName()}</span></a>
                            </div>
                        </c:if>
                        <c:if test="${user.getName().length()>7}">
                            <div class="col-md-6 header_title">
                                <a href="GoHomePage">
                                    <span>DotCake</span>
                                </a>
                            </div>
                            <div class="col-md-1 header_buy" style="padding-top: 15px">
                                <a title="Giỏ hàng" href="cart.jsp">
                                    <span class="glyphicon glyphicon-shopping-cart" style="color: grey; font-size: 28px"></span>
                                </a>
                            </div>
                            <div class="col-md-1 header_order" style="padding-top: 15px">
                                <a title="order" href="ListOrderForCustomer?userID=${user.getUserID()}">
                                    <span>Ordered</span>
                                </a>
                            </div>
                            <div class="col-md-2 header_login" style="padding-top: 15px">
                                <a href="GoProfilePage"><span>${user.getName()}</span></a>
                            </div>
                        </c:if>
                    </c:if>

                </div>
            </div>

            <div class = "row header_menu">
                <div class = "navbar header_menu--items">
                    <a href="GoHomePage">Home</a>
                    <a href="GoAboutPage">About</a>
                    <a href="product">Products</a>
                    <a href="GoServicePage">Services</a>
                    <a href="GoContactPage">Contact</a> 
                    <c:set var="user" value = "${sessionScope.USER}"></c:set>
                    <c:if test="${user.getRoleID()==2}">
                        <a href="GoAdminPage">Manage</a>
                    </c:if>
                    <c:if test="${user.getRoleID()==1}">
                        <a href="GoAdminPage">Manage</a>
                    </c:if>
                </div>
            </div>
        </div>
    </body>
</html>
