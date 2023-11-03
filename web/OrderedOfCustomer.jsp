<%-- 
    Document   : OrderedOfCustomer
    Created on : Oct 31, 2023, 10:06:42 AM
    Author     : Duy Hai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.User" %>
<%@page import="model.ShipObject" %>
<%@page import="model.Ship" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap1.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/cssOrderAuto.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="header_page">
            <%@include file="header.jsp" %>
        </div>
        <% User user = (User) request.getSession().getAttribute("USER");
        if(user!=null){
        %>
        <div class="all_order container">

            <div class="row body">
                <div class="col-12">
                    <div class="white_card card_height_100 mb_30">
                        <div class="white_card_header">
                            <div class="box_header m-0">
                                <div class="main-title" style="width: 100%;">
                                    <h3 class="m-0" style="font-size: 30px;font-style: italic;text-align: center;">List Order Of Your Account</h3>
                                </div>
                            </div>
                        </div>
                        <%ShipObject ship = (ShipObject) request.getSession().getAttribute("LISTORDERED");
                            double total = 0;
                        %>
                        <% List<List<Ship>> listorder = ship.getListShipOfCus(); %>
                        <% if(listorder!=null){ %>
                        <% for(int i=0; i < listorder.size();i++){ %>

                        <div class="white_card_body" >
                            <div class="row" style="border: grey 2px solid;padding:3%;border-radius: 2%;">
                                <!-- vong lap for se o day de display cart -->
                                <% int shipID =0; %>

                                <%for(int j=0;j < listorder.get(i).size();j++){%>
                                <div class="col-lg-12">
                                    <div class="common_input mb_15">
                                        <div class="col-md-12">
                                            <div class="IMGPRODUCT col-sm-2">
                                                <img class="img-fluid" 
                                                     width="200" height="200" src="<%=listorder.get(i).get(j).getImage()%>" alt="">
                                            </div>
                                            <div class="col-sm-4">
                                                <p style="font-size: 18px;font-style: italic;">Product Name: <%=listorder.get(i).get(j).getProductName()%> <sup>x<%= (int)listorder.get(i).get(j).getQuantityBuy()%></sup></p>
                                                <p>create by account: <%=user.getUsername()%> </p>
                                                <p>Ship to: <%=listorder.get(i).get(j).getAddress()%> </p>
                                                <p>Time: <%=listorder.get(i).get(j).getRequireDate()%> <%=listorder.get(i).get(j).getRequireTime()%> </p>
                                            </div>
                                            <div class="col-sm-4">
                                                <p style="font-size: 18px;font-style: italic;">Info</p>
                                                <p>Name: <%=listorder.get(i).get(j).getCusName()%> </p>
                                                <p>phone: <%=listorder.get(i).get(j).getPhone()%> </p>

                                            </div>

                                            <div class="col-sm-2">
                                                <!--<p>Cost Product: <%=listorder.get(i).get(j).getTotalCost()%></p>-->
                                                <p>Cost Product: <%=listorder.get(i).get(j).getProductPrice()%></p>
                                                <% total = listorder.get(i).get(j).getTotalCost(); %>

                                                <% shipID = listorder.get(i).get(j).getShipID();%>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <%}%>

                                <div class="col-lg-12">
                                    <div class="col-sm-9"></div>
                                    <div class="create_report_btn mt_30 col-sm-3">
                                        <h4>Total Cost: <%= total %></h4>
                                        <h4>Ordered</h4>
                                        <form action="requestcancellation" method="POST">
                                            <input type ="hidden" name="request" value="<%=shipID%>" />
                                            <input style="font-size: 15px;font-style: italic;" class="btn_1 button_order" type="submit" value="request cancellation">
                                        </form>
                                    </div>
                                </div>

                            </div>
                        </div>

                        <%}%>
                        <%}%>
                    </div>
                </div>
            </div>
        </section>

    </div>
    <% } %>
</body>
</html>
