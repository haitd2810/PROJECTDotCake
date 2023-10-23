<%-- 
    Document   : product_ques
    Created on : Oct 23, 2023, 7:04:07 PM
    Author     : Duy Hai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>Ship</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="./css/product_ques.css">
</head>

<body>
    <h1>Câu hỏi thường gặp</h1>
    <h3>Bạn có thể tìm câu trả lời cho những câu hỏi thường gặp ở dưới đây </h3>


    <div class="chon">
        <button>VỀ GIAO HÀNG</button>
        <button >VỀ ĐẶT HÀNG </button>
        <button id="giaohang">VỀ SẢN PHẨM</button>
    </div>

    <div class="ques">
        <div class="q1" onclick="toggleAns_q1(document.querySelector('.arrow'))">
            <p> Cách bảo quản của các loại bánh thế nào? Thời gian sử dụng là bao lâu
            </p>
            <div class="arrow"></div>
        </div>


        <div id="ans_q1" >
            Tất cả các loại bánh của chúng tôi hoàn toàn sử dụng nguyên liệu tươi và 
            không sử dụng chất bảo quản, vì vậy vui lòng giữ bánh trong hộp kín & bảo
             quản ngăn mát tủ lạnh ngay khi bạn nhận bánh (không để bánh vào ngăn đông).
              Bạn không nên để bánh ở nhiệt độ phòng quá 30 phút (bánh sẽ bị chảy), 
              chỉ lấy bánh ra khỏi ngăn mát tủ lạnh ngay trước khi ăn. Bánh được bảo
               quản đúng cách có thể sử dụng trong vòng 3 ngày.        
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
            <p> Tôi có thể đặt bánh theo mẫu riêng mà tôi muốn được không?  </p>
            <div class="arrow1"></div>
        </div>
        <div id="ans_q2" style="display: none;">
            Rất tiếc, chúng tôi chỉ sản xuất các mẫu có sẵn và không nhận đặt theo mẫu riêng.
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
            <p> Tôi muốn di chuyển bánh từ nơi này đến nơi khác bằng xe máy / ô tô thì có sợ bánh bị chảy không?
            </p>
            <div class="arrow2"></div>
        </div>


        <div id="ans_q3">
            Bạn có thể di chuyển bánh bằng ô tô trong thời gian dưới 45 phút (với điều kiện máy lạnh trên xe mở ở mức lạnh sâu).
             Nếu bạn di chuyển bằng xe máy thì quãng đường không nên dài quá 30 phút và thời tiết ngoài trời không vượt mức 30 độ C
              (quá nóng bánh sẽ bị chảy), tốt nhất nên di chuyển kèm đá lạnh/ đá khô. Vì vậy chúng tôi khuyến khích bạn đặt giao hàng
               đến trực tiếp địa chỉ bạn sẽ ăn bánh để không phải tự di chuyển bánh nhiều lần.
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


    </div>
    </div>
</body>

</html>