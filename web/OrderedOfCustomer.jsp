<%-- 
    Document   : OrderedOfCustomer
    Created on : Oct 31, 2023, 10:06:42 AM
    Author     : Duy Hai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <c:set var="acc" value="${sessionScope.acc}"></c:set>
        <c:if test="${not empty acc}">
            <div class="all_order container">
                <form>
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
                                <div class="white_card_body">
                                    <div class="row">
                                        <!-- vong lap for se o day de display cart -->
                                        <div class="col-lg-12">
                                            <div class="common_input mb_15">
                                                <div class="col-md-12">
                                                    <div class="IMGPRODUCT col-sm-2">
                                                        <img class="img-fluid" 
                                                             width="100" height="100" src="https://scontent.fhan19-1.fna.fbcdn.net/v/t39.30808-6/395615368_1430423234173912_8606768457890717166_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=5f2048&_nc_ohc=blJoIInXZvcAX_BLS16&_nc_ht=scontent.fhan19-1.fna&oh=00_AfBFotukQ7EHbqMOcOeqUTCIfayLdx3a0lBGa9EejtDnTA&oe=654613AA" alt="">
                                                    </div>
                                                    <div class="col-sm-8">
                                                        <p style="font-size: 18px;font-style: italic;">Product Name</p>
                                                        <p>Quantity: </p>
                                                    </div>

                                                    <div class="col-sm-2">
                                                        <p>Cost Product</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-12">
                                            <div class="col-sm-9"></div>
                                            <div class="create_report_btn mt_30 col-sm-3">
                                                <h4>Ordered</h4>
                                                <input style="font-size: 15px;font-style: italic;" class="btn_1 button_order" type="submit" value="request cancellation">
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
