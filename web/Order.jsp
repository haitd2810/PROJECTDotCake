<%-- 
    Document   : Order
    Created on : Oct 25, 2023, 9:20:04 PM
    Author     : Duy Hai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>order</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap1.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/cssOrderAuto.css" rel="stylesheet" type="text/css"/>
        <link href="css/styleOrder.css" rel="stylesheet" type="text/css"/>
        <style>
            .header_page{
                position: fixed;
                z-index: 10;
                width: 100vw;
                background-color: white;
            }
            .all_order{
                padding-top: 103px;
                position: relative;
            }
        </style>
    </head>
    <body>
        <div class="header_page">
            <%@include file="header.jsp" %>
        </div>
        <c:set var="acc" value="${sessionScope.acc}"></c:set>
        <c:if test="${not empty acc}">
            <div class="all_order container">
                <form>
                    <div class="row body">
                        <div class="col-12">
                            <div class="white_card card_height_100 mb_30">
                                <div class="white_card_header">
                                    <div class="box_header m-0">
                                        <div class="main-title">
                                            <h3 class="m-0" style="font-size: 18px;font-style: italic;">Order</h3>
                                        </div>
                                    </div>
                                </div>
                                <div class="white_card_body">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <div class="common_input mb_15">
                                                <h5 style="font-size: 18px;font-style: italic;">Name:</h5>
                                                <input type="text" required name="NameOfCus">
                                            </div>
                                        </div>
                                        <div class="col-lg-12">
                                            <div class="common_input mb_15">
                                                <h5 style="font-size: 18px;font-style: italic;">Phone:</h5>
                                                <input type="text" required name="PhoneOfCus">
                                            </div>
                                        </div>
                                        <div class="col-lg-12">
                                            <div class="common_input mb_15">
                                                <h5 style="font-size: 18px;font-style: italic;">Address:</h5>
                                                <input type="text" required name="AddressOfCu">
                                            </div>
                                        </div>
                                        <div class="col-lg-12">
                                            <div class="common_input mb_15">
                                                <h5 style="font-size: 18px;font-style: italic;">Date Receipt</h5>
                                                <input type="date" required name="DateReceipt">
                                            </div>
                                        </div>
                                        <div class="col-lg-12">
                                            <div class="common_input mb_15">
                                                <h5 style="font-size: 18px;font-style: italic;">Time Receipt</h5>
                                                <select style="font-size: 15px;font-style: italic;width: 100%;padding: 5px;">
                                                    <option>--Please Choose--</option>
                                                    <option>11h15-13h</option>
                                                    <option>13h-15h</option>
                                                    <option>15h-17h</option>
                                                    <option>18h-20h</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-lg-12">
                                            <div class="common_input mb_15">
                                                <h5 style="font-size: 18px;font-style: italic;">Notes:</h5>
                                                <input type="text" name="NoteOfCus">
                                            </div>
                                        </div>
                                        <div class="col-lg-12">
                                            <div class="common_input mb_15">
                                                <h5 style="font-size: 18px;font-style: italic;">Order Detail</h5>
                                            </div>
                                        </div>
                                        <!-- vong lap for se o day de display cart -->
                                        <div class="col-lg-12">
                                            <div class="common_input mb_15">
                                                <div class="col-md-12">
                                                    <div class="IMGPRODUCT col-sm-2">
                                                        <img class="img-fluid" 
                                                             width="100" height="100" src="https://s.net.vn/Rx3w" alt="">
                                                    </div>
                                                    <div class="col-sm-8">
                                                        <p style="font-size: 18px;font-style: italic;">Product Name</p>
                                                    </div>
                                                    <div class="col-sm-2">
                                                        <p>Cost Product</p>
                                                        <p>Shipp fee</p><br>
                                                        <p>Total Cost</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-12">
                                            <div class="col-sm-8"></div>
                                            <div class="create_report_btn mt_30 col-sm-4">
                                                <input style="font-size: 18px;font-style: italic;" class="btn_1 button_order" type="submit" value="Order">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    </section>
                </form>
            </div>
        </c:if>
    </body>
</html>
