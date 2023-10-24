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
            <button id="giaohang" onclick="first()">VỀ GIAO HÀNG</button>
            <button ><a href="order_ques.jsp" style="color:black;">VỀ ĐẶT HÀNG</a> </button>
            <button><a href="product_ques.jsp" style="color:black;">VỀ SẢN PHẨM</a></button>
        </div>

        <div id = "content" class="ques">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
            <script>
                function first() {
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
            </script>


            <script>
                var clickCount_q2 = 0;

                function toggleAnswer(element) {
                    clickCount_q2++;

                    var answer = document.getElementById('ans');
                    var arrow = element.querySelector('.arrow');

                    if (clickCount_q2 % 2 === 1) {
                        answer.style.display = 'block';
                        arrow.classList.add('down');
                    } else {
                        answer.style.display = 'none';
                        arrow.classList.remove('down');
                    }
                }

                // Đặt lại trạng thái hiển thị của câu trả lời khi trang tải
                window.onload = function () {
                    var answer = document.getElementById('ans');
                    answer.style.display = 'none';
                };
            </script>
            <hr />
            <div class="q3" onclick="toggleAns_q3(this)">
                <p> Tôi có thể chọn giờ giao hàng chính xác tuyệt đối (ví dụ 12h15) thay vì chọn khung giờ như trên không?
                </p>
                <div class="arrow2"></div>
            </div>


            <div id="ans_q3">
                Xin lỗi, hiện tại chúng tôi chỉ có thể giao theo khung giờ mà không thể hẹn bạn chính xác đến từng phút,
                .
            </div>

            <script>
                var clickCount = 0;

                function toggleAns_q3(element) {
                    clickCount++;

                    var answer = document.getElementById('ans_q3');
                    var arrow = element.querySelector('.arrow2');
                    if (clickCount % 2 === 1) {
                        answer.style.display = 'block';
                        arrow.classList.add('down');
                    } else {
                        answer.style.display = 'none';
                        arrow.classList.remove('down');
                    }
                }

                // Đặt lại trạng thái hiển thị của câu trả lời khi trang tải
                window.onload = function () {
                var answer = document.getElementById('ans_q3');
                answer.style.display = 'none';
            });
            </script>

            <hr />


            <div class="q4" onclick="toggleAns_q4(document.querySelector('.arrow3'))">
                <p>Tôi có thể thay đổi khung thời gian/ địa chỉ giao hàng sau khi đã đặt không?</p>
                <div class="arrow3"></div>
            </div>
            <div id="ans_q4">
                Để thay đổi thông tin giao hàng, vui lòng liên hệ với chúng tôi trước ít nhất 24h để chúng tôi có thể sắp
                xếp lại tuyến đường giao hàng cho bạn. Nếu bạn liên hệ quá gấp, chúng tôi sẽ không thể thay đổi điều này
            </div>
            <script>
                var clickCount = 0;

                function toggleAns_q4(element) {
                    clickCount++;

                    var answer = document.getElementById('ans_q4');

                    if (clickCount % 2 === 1) {
                        answer.style.display = 'block';
                        element.classList.add('down');
                    } else {
                        answer.style.display = 'none';
                        element.classList.remove('down');
                    }
                }
                // Đặt lại trạng thái hiển thị của câu trả lời khi trang tải
                window.onload = function () {
                    var answer = document.getElementById('ans_q4');
                    answer.style.display = 'none';
                };
            </script>
            <hr />

        </div>
    </body>

</html>