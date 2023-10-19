<%-- 
    Document   : productdetail
    Created on : Oct 17, 2023, 8:16:31 PM
    Author     : Duy Hai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>product detail</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/stylemenu.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Embed css here-->
    <link rel="stylesheet" href="css/styleproductdetail.css">
    </head>
    <body>
        <div class="header_page">
            <%@include file="header.jsp" %>
        </div>
        <div class="container-fluid product">

        <div class="product__detail">
            <div class="row">
                <div class="col-md-6 product__img">
                    <img src="https://lafuong.com/_next/image?url=%2Fapi%2Fassets%2Fpage%2F286619af-d74d-45df-82ed-b6228f0822e8%2FcoverImage%2F0%3Flast_edited_time%3D2023-10-04T15%253A00%253A00.000Z&w=1080&q=75"
                        alt="">
                </div>
                <div class="col-md-6 product_info">
                    <h3 class="category">category</h3>
                    <h1 class="name">NAME</h1>
                    <div class="price">
                        <p>Price:<span>123</span>$</p>   
                    </div>
                    <h4 class="title">Cà phê & Cốt dừa</h4>
                    <div class="description">
                        <p>
                            Nằm trong BST bánh dành cho dịp lễ 20.10, Enchanted được thiết kế như một hộp quà với những
                            chiếc nơ sô-cô-la trắng thật xinh xắn cùng lớp nền phủ từ bơ cacao nâu mịn như nhung. Là món
                            quà ý nghĩa dành tặng cho những người phụ nữ tinh tế và duyên dáng. Lớp mousse mềm mịn được
                            làm từ cà phê rang xay đậm đà, đi kèm với lớp kem dừa thơm ngậy. Ít ngọt và dễ hợp khẩu vị
                            với tất cả mọi người.
                        </p>
                        <p>Đây sẽ là một lựa chọn rất phù hợp cho ngày 20.10 này.</p>
                    </div>
                    <div class="structure">
                        <ul>
                            <h4>CẤU TRÚC VỊ BÁNH</h4>
                            <li>Lớp 01: Phun phủ bơ cacao</li>
                            <li>Lớp 02: Kem mousse cà phê</li>
                            <li>Lớp 03: Bạt bánh cà phê mềm</li>
                            <li>Lớp 04: Kem ngậy dừa non</li>
                            <li>Lớp 05: Bạt bánh cà phê mềm</li>
                        </ul>
                    </div>
                    <div class="size">
                        <h4>KÍCH THƯỚC</h4>
                        <p>Đường kính:<span></span>cm | Chiều cao:<span></span>cm</p>
                        <p>Dành cho <span></span> người ăn</p>
                    </div>
                    <div class="accessory">
                        <ul>
                            <h4>PHỤ KIỆN TẶNG KÈM</h4>
                            <li>01 Chiếc nến sinh nhật</li>
                            <li>01 Bộ đĩa và dĩa dành cho 10 người</li>
                            <li>01 Dao cắt bánh</li>
                        </ul>
                    </div>
                    <div class="manual">
                        <ul>
                            <h4>HƯỚNG DẪN SỬ DỤNG</h4>
                            <li>Luôn giữ bánh trong hộp kín & bảo quản trong ngăn mát tủ lạnh</li>
                            <li>Không nên để bánh ở nhiệt độ phòng quá 30 phút (Bánh sẽ bị chảy)</li>
                            <li>Sử dụng trong vòng 03 ngày</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="footer">
        <%@include file="footer.html" %>
    </div>
    </body>
</html>
