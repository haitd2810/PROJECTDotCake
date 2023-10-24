<%-- 
    Document   : order_ques
    Created on : Oct 23, 2023, 7:03:18 PM
    Author     : Duy Hai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>Order Ques</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="./css/order_ques.css">
</head>

<body>
    <%@include file="header.jsp" %>
    <%@include file="ship.jsp" %>
    <h1>Câu hỏi thường gặp</h1>
    <h3>Bạn có thể tìm câu trả lời cho những câu hỏi thường gặp ở dưới đây </h3>


    <div class="chon">
        <button ><a href="ship_ques.jsp" style="color:black;">VỀ GIAO HÀNG</a></button>
        <button id="giaohang"><a href="order_ques.jsp" style="color:black;">VỀ ĐẶT HÀNG</a> </button>
        <button><a href="product_ques.jsp" style="color:black;">VỀ SẢN PHẨM</a></button>
    </div>

    <div class="ques">
        <div class="q1" onclick="toggleAns_q1(document.querySelector('.arrow'))">
            <p> Thời gian đặt bánh tối thiểu là bao lâu?
            </p>
            <div class="arrow"></div>
        </div>


        <div id="ans_q1" >
            Bạn nên đặt trước 1 ngày để có thể lựa chọn tất cả các mẫu bánh.
       <br/>
        Nếu bạn cần đặt gấp trong ngày, vui lòng liên hệ hotline 090 786 0330 để được phục vụ ngay, tuy nhiên mẫu bánh có thể hạn chế và không đủ toàn bộ mẫu.
        
        </div>

        <script>
            var clickCount = 0;

            function toggleAns_q1(element) {
                clickCount++;

                var answer = document.getElementById('ans_q1');

                if (clickCount % 2 === 1) {
                    answer.style.display = 'block';
                    element.classList.add('down');
                } else {
                    answer.style.display = 'none';
                    element.classList.remove('down');
                }
            }

            // Đặt lại trạng thái hiển thị của câu trả lời khi trang tải
            window.addEventListener('load', function () {
                var answer = document.getElementById('ans_q1');
                answer.style.display = 'none';
            });
        </script>

        <hr />

        <div class="q2" onclick="toggleAnswer(this)">
            <p> DotCake có các hình thức thanh toán nào? </p>
            <div class="arrow1"></div>
        </div>
        <div id="ans_q2" style="display: none;">
            Hiện tại đối với cách đặt hàng qua website, DotCake chỉ có hình thức thanh toán duy nhất là trả tiền mặt 100% giá trị đơn hàng ngay khi nhận hàng.
        </div>

        <script>
            var clickCount_q2 = 0;

            function toggleAnswer(element) {
                clickCount_q2++;

                var answer = document.getElementById('ans_q2');
                var arrow = element.querySelector('.arrow1');

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
                var answer = document.getElementById('ans_q2');
                answer.style.display = 'none';
            };
        </script>
        <hr />
        <div class="q3" onclick="toggleAns_q3(document.querySelector('.arrow2'))">
            <p> Tôi có thể thay đổi loại bánh sau khi đã hoàn tất đặt hàng không?
            </p>
            <div class="arrow2"></div>
        </div>


        <div id="ans_q3">
            Để thay đổi loại bánh, bạn vui lòng liên hệ với chúng tôi trước ít nhất 24h 
            để chúng tôi kiểm tra liệu nguyên liệu có sẵn để đáp ứng không. 
            Nếu nguyên liệu còn đủ chúng tôi sẽ đổi loại bánh theo yêu cầu của bạn,
             tuy nhiên chúng tôi không đảm bảo chắc chắn về điều này, rất mong bạn thông cảm.
        </div>

        <script>
            var clickCount = 0;

            function toggleAns_q3(element) {
                clickCount++;

                var answer = document.getElementById('ans_q3');

                if (clickCount % 2 === 1) {
                    answer.style.display = 'block';
                    element.classList.add('down');
                } else {
                    answer.style.display = 'none';
                    element.classList.remove('down');
                }
            }

            // Đặt lại trạng thái hiển thị của câu trả lời khi trang tải
            window.addEventListener('load', function () {
                var answer = document.getElementById('ans_q3');
                answer.style.display = 'none';
            });
        </script>

        <hr />


        <div class="q4" onclick="toggleAns_q4(document.querySelector('.arrow3'))">
            <p>Tôi có thể hủy đơn hàng sau khi đã đặt bánh không?</p>
            <div class="arrow3"></div>
        </div>
        <div id="ans_q4">
            Nếu bạn muốn huỷ đơn hàng, vui lòng liên hệ trước với chúng tôi ít nhất 24h. 
            Nếu bạn liên hệ với chúng tôi muộn hơn 24h, lúc này đơn hàng của bạn đã được sản xuất vì vậy rất tiếc chúng tôi sẽ không thể hỗ trợ bạn huỷ đơn hàng.
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