<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <title>Service</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="./css/ship_ques.css">
        <style>
            #ans_q3{
                display: none;
            }
            #ans_q4{
                display: none;
            }
            #ans_q1{
                display: none;
            }
        </style>
    </head>

    <body>
        <%@include file="header.jsp" %>
        <%@include file="ship.jsp" %>
        <h1>Câu hỏi thường gặp</h1>
        <h3>Bạn có thể tìm câu trả lời cho những câu hỏi thường gặp ở dưới đây </h3>
        <div class="chon">
                <button onclick="ShipQues()">VỀ GIAO HÀNG</button>
                <button onclick="OrderQues()">VỀ ĐẶT HÀNG</button>
                <button onclick="ProductQues()">VỀ SẢN PHẨM</button>
        </div>

        <div id = "content" class="ques">
            <div class="q1" onclick="toggleFeesTable(document.querySelector('.arrow'))">
                <p> Phí giao hàng của LaFuong được tính như thế nào?</p>
                <div class="arrow"></div>
            </div>
            <table id="feesTable" class="fees-table">
                <thead>
                <th class="kc">KHOẢNG CÁCH</th>
                <th class="fee">PHÍ GIAO HÀNG</th>
                </thead>
                <tbody id="feesBody">
                    <!-- Dữ liệu sẽ được thêm vào đây bằng JavaScript -->
                </tbody>
            </table>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
            <script>
                function ShipQues() {
                    $.ajax({
                        url: "/PRJDOTCAKE/ShipQues",
                        type: "get", //send it through get method
                        success: function (data) {
                            var content = document.getElementById("content");
                            content.innerHTML = data;
                        },
                        error: function (xhr) {
                            //Do Something to handle error
                        }
                    });
                }
                function OrderQues() {
                    $.ajax({
                        url: "/PRJDOTCAKE/OrderQues",
                        type: "get", //send it through get method
                        success: function (data) {
                            var content = document.getElementById("content");
                            content.innerHTML = data;
                        },
                        error: function (xhr) {
                            //Do Something to handle error
                        }
                    });
                }
                function ProductQues() {
                    $.ajax({
                        url: "/PRJDOTCAKE/ProductQues",
                        type: "get", //send it through get method
                        success: function (data) {
                            var content = document.getElementById("content");
                            content.innerHTML = data;
                        },
                        error: function (xhr) {
                            //Do Something to handle error
                        }
                    });
                }
                var clickCount_q1 = 0;
                var data = [
                    {distance: 'Dưới 3km', fee: '25.000 VND'},
                    {distance: 'Từ 3-> 4.9km', fee: '30.000 VND'},
                    {distance: 'Từ 5-> 6.9km', fee: '35.000 VND'},
                    {distance: 'Từ 7-> 7.9km', fee: '40.000 VND'},
                    {distance: 'Từ 8-> 10km', fee: '50.000 VND'}
                ];

                function toggleFeesTable(element) {
                    clickCount_q1++;

                    var feesTable = document.getElementById('feesTable');
                    var feesBody = document.getElementById('feesBody');

                    if (clickCount_q1 % 2 === 1) {
                        feesTable.style.display = 'block';
                        element.classList.add('down');

                        for (var i = 0; i < data.length; i++) {
                            var row = document.createElement('tr');

                            var distanceCell = document.createElement('td');
                            distanceCell.textContent = data[i].distance;
                            row.appendChild(distanceCell);

                            var feeCell = document.createElement('td');
                            feeCell.textContent = data[i].fee;
                            row.appendChild(feeCell);

                            feesBody.appendChild(row);
                        }
                    } else {
                        feesTable.style.display = 'none';
                        feesBody.innerHTML = '';
                        element.classList.remove('down');
                    }
                }
                var clickCount_orderq1 = 0;

                function toggleAns_q1(element) {
                    clickCount_orderq1++;

                    var answer = document.getElementById('ans_q1');

                    if (clickCount_orderq1 % 2 === 1) {
                        answer.style.display = 'block';
                        element.classList.add('down');
                    } else {
                        answer.style.display = 'none';
                        element.classList.remove('down');
                    }
                }
            </script>
            <hr />

            <div class="q2" onclick="toggleAnswer_q2(this)">
                <p> Tôi có thể chọn giờ giao hàng không?</p>
                <div class="arrow2"></div>
            </div>
            <div id="ans_q2" style="display: none;">
                Bạn có thể đến một trong các khung giờ sau: 11h-15h, 15h-16h, 17h-18h, 18h-21h.
            </div>

            <script>
                var clickCount_q2 = 0;

                function toggleAnswer_q2(element) {
                    clickCount_q2++;

                    var answer = document.getElementById('ans_q2');
                    var arrow = element.querySelector('.arrow2');

                    if (clickCount_q2 % 2 === 1) {
                        answer.style.display = 'block';
                        arrow.classList.add('down');
                    } else {
                        answer.style.display = 'none';
                        arrow.classList.remove('down');
                    }
                }

                // Đặt lại trạng thái hiển thị của câu trả lời khi trang tải
//                window.onload = function () {
//                    var answer = document.getElementById('ans');
//                    answer.style.display = 'none';
//                };
            </script>
            <hr />


            <div class="q3" onclick="toggleAns_q3(document.querySelector('.arrow3'))">
                <p> Tôi có thể chọn giờ giao hàng chính xác tuyệt đối (ví dụ 12h15) thay vì chọn khung giờ như trên không?
                </p>
                <div class="arrow3"></div>
            </div>


            <div id="ans_q3">
                Xin lỗi, hiện tại chúng tôi chỉ có thể giao theo khung giờ mà không thể hẹn bạn chính xác đến từng phút,
                .
            </div>

            <script>
                var clickCount_q3 = 0;

                function toggleAns_q3(element) {
                    clickCount_q3++;

                    var answer = document.getElementById('ans_q3');
                    var arrow = element.querySelector('.arrow3');

                    if (clickCount_q3 % 2 === 1) {
                        answer.style.display = 'block';
                        arrow.classList.add('down');
                    } else {
                        answer.style.display = 'none';
                        arrow.classList.remove('down');
                    }
                }

                // Đặt lại trạng thái hiển thị của câu trả lời khi trang tải
//                window.onload = function () {
//                var answer = document.getElementById('ans_q3');
//                answer.style.display = 'none';
//            });
            </script>
            <hr />


            <div class="q4" onclick="toggleAns_q4(document.querySelector('.arrow4'))">
                <p>Tôi có thể thay đổi khung thời gian/ địa chỉ giao hàng sau khi đã đặt không?</p>
                <div class="arrow4"></div>
            </div>
            <div id="ans_q4">
                Để thay đổi thông tin giao hàng, vui lòng liên hệ với chúng tôi trước ít nhất 24h để chúng tôi có thể sắp
                xếp lại tuyến đường giao hàng cho bạn. Nếu bạn liên hệ quá gấp, chúng tôi sẽ không thể thay đổi điều này
            </div>

            <script>
                var clickCount_q4 = 0;

                function toggleAns_q4(element) {
                    clickCount_q4++;

                    var answer = document.getElementById('ans_q4');

                    if (clickCount_q4 % 2 === 1) {
                        answer.style.display = 'block';
                        element.classList.add('down');
                    } else {
                        answer.style.display = 'none';
                        element.classList.remove('down');
                    }
                }
                // Đặt lại trạng thái hiển thị của câu trả lời khi trang tải
//                window.onload = function () {
//                    var answer = document.getElementById('ans_q4');
//                    answer.style.display = 'none';
//                };
            </script>
            <hr />

        </div>
    </body>

</html>