/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
function ShipQues() {
    $.ajax({
        url: "/PRJDOTCAKE/Ship_ques",
        type: "get", //send it through get method
        success: function (data) {
            var content = document.getElementById("content");
            content.innerHTML = data;
        },
        error: function (xhr) {

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

