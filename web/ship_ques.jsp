<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Service</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="./css/ship_ques.css">
    </head>

    <body>
        <%@include file="header.jsp" %>
        <%@include file="ship.jsp" %>
        <h1>Câu hỏi thường gặp</h1>
        <h3>Bạn có thể tìm câu trả lời cho những câu hỏi thường gặp ở dưới đây </h3>


        <div class="chon">
            <button id="giaohang" onclick="ShipQues()">VỀ GIAO HÀNG</button>
            <button id="giaohang" onclick="OrderQues()">VỀ ĐẶT HÀNG</button>
            <button id="giaohang" onclick="ProQues()">VỀ SẢN PHẨM</button>
        </div>
        <div id="content" class="ques">
            
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="js/ShipQuestion.js" type="text/javascript"></script>
        <script src="js/ProductQuestion.js" type="text/javascript"></script>
        <script src="js/OrderQuestion.js" type="text/javascript"></script>
    </body>

</html>
