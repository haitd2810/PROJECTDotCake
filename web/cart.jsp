<%-- 
    Document   : cart.jsp
    Created on : Oct 31, 2023, 10:53:17 AM
    Author     : kieup
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.util.List" %>
<%@page import="model.CartItem" %>
<%@page import="model.CartObject"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Shop On</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/cart.css">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/styleheader.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Embed css here-->
        <style>
            th{
                text-align: center;
            }
        </style>
    </head> 
    <body>
        <div style="width: 100%">
        <%@include file="header.jsp" %>
        </div>
        <div style="width: 100%; text-align: center;color: grey;margin: 30px 30px ">
            <h3 style="font-size: 32px;font-family: Lucida Handwriting;">YOUR CART</h3>
        </div>
    <div class="row itemcart">
         <table class="table table-hover"style="color: #787f85;">
             <thead>
                    <tr><th style="width: 10px;">No</th>
                    <th style="width: 20%;">Product</th>
                    <th style="width: 30%;">Name</th>
                    <th style="width: 15%;">Price</th>
                    <th style="width: 10%;">Quantity</th>
                    <th style="width: 15%;">UnitPrice</th>
                    <th>Action</th>
                    </tr>
                    </thead>
                    <c:if test="${not empty cart.getItem()}">
                    <c:set var="listcart" value="${cart.getItem()}"/>
                    <tbody>
                        <c:set var="t" value="0" /> 
                        <c:forEach items="${listcart}" var="i">
                            <c:set var="t" value="${t+1}"/>
                        <tbody>
                        <td>${t}</td>
                        <td><img src="${i.getImage()}" alt="khong co anh" style="width: 100px; height: 100px; object-fit:cover"/></td>
                        <td style="font-size:15px;"><p>${i.getProductName()}</p></td>
                        <td><fmt:formatNumber pattern="##.#" value="${i.getPrice()}" /></td>
                        <td >
                            <form action="change" method="">
                                <button style="border: 0;width: 27px;" ><a href = "change?num=dec&id=${i.getProductID()}&name=${i.getProductName()}" >-</a></button>
                                <input type="text" readonly  value="${i.getIquantity()}" style="font-size: 18px;width: 30px;"/>
                                <button style="border: 0;width: 27px;"><a href = "change?num=inc&id=${i.getProductID()}&name=${i.getProductName()}"  style="font-size: 18px;width: 30px;">+</a></button>
                            </form>
                        </td>
                        <td><fmt:formatNumber  pattern="##.#" value="${i.getIquantity()*i.getPrice()}" />
                        </td>
                        <td>
                            <form action="delete" method="">
                                <input type="hidden" name="name" value="${i.getProductName()}"/>
                                <input type="submit" value="Delete" />
                            </form>
                        </td>    
                        </tbody>
                    </c:forEach>
                    </c:if>
                </table>
    </div>
    <div class="row total_cart" style="margin-left: 15px;margin-right: 29px">
        <c:if test="${not empty cart.getItem()}">
        <c:set var="total" value="0" />
        <c:forEach items="${cart.getItem()}" var="item">
        <c:set var="subtotal" value="${item.getIquantity() * item.getPrice()}" />
        <c:set var="total" value="${total + subtotal}" />
        </c:forEach>
        <h4 style="font-size: 18px;margin: 15px 0px;margin-left: 30px">Total Money: <fmt:formatNumber pattern="##.#" value="${total}" /></h4>
        </c:if>
    </div>
        
        <div class = "row button_action">
             <c:if test="${not empty cart.getItem()}">
            <div class="order">
                <form action="order" method="post">
                    <input type="submit" value="Order"/>
                </form>
            </div>
            </c:if>
            <div class="continue">
                <form>
                    <a href="product"><span>Continue Shopping</span></a>
                </form>
            </div>
            
        </div>
    </body>
</html>

