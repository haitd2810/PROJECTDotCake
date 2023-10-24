/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
function OrderQues() {
    $.ajax({
        url: "/PRJDOTCAKE/Order_ques",
        type: "get", //send it through get method
        success: function (data) {
            var content = document.getElementById("content");
            content.innerHTML = data;
        },
        error: function (xhr) {

        }
    });
}
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

