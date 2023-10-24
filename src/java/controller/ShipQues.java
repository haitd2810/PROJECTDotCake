/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Duy Hai
 */
@WebServlet(name = "ShipQues", urlPatterns = {"/ShipQues"})
public class ShipQues extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<div class=\"chon\">\n"
                    + "                <button id=\"giaohang\" onclick=\"ShipQues()\">VỀ GIAO HÀNG</button>\n"
                    + "                <button onclick=\"OrderQues()\">VỀ ĐẶT HÀNG</button>\n"
                    + "                <button onclick=\"ProductQues()\">VỀ SẢN PHẨM</button>\n"
                    + "        </div>"
                    + "<div class=\"q1\" onclick=\"toggleFeesTable(document.querySelector('.arrow'))\">\n"
                    + "            <p> Phí giao hàng của LaFuong được tính như thế nào?</p>\n"
                    + "            <div class=\"arrow\"></div>\n"
                    + "        </div>\n"
                    + "        <table id=\"feesTable\" class=\"fees-table\">\n"
                    + "            <thead>\n"
                    + "                <th class=\"kc\">KHOẢNG CÁCH</th>\n"
                    + "                <th class=\"fee\">PHÍ GIAO HÀNG</th>\n"
                    + "            </thead>\n"
                    + "            <tbody id=\"feesBody\">\n"
                    + "                <!-- Dữ liệu sẽ được thêm vào đây bằng JavaScript -->\n"
                    + "            </tbody>\n"
                    + "        </table>\n"
                    + "        <hr />"
                    + "<div class=\"q2\" onclick=\"toggleAnswer_q2(this)\">\n"
                    + "                <p> Tôi có thể chọn giờ giao hàng không?</p>\n"
                    + "                <div class=\"arrow2\"></div>\n"
                    + "            </div>\n"
                    + "            <div id=\"ans_q2\" style=\"display: none;\">\n"
                    + "                Bạn có thể đến một trong các khung giờ sau: 11h-15h, 15h-16h, 17h-18h, 18h-21h.\n"
                    + "            </div>"
                    + "<hr />\n"
                    + "            <div class=\"q3\" onclick=\"toggleAns_q3(this)\">\n"
                    + "            <p> Tôi có thể chọn giờ giao hàng chính xác tuyệt đối (ví dụ 12h15) thay vì chọn khung giờ như trên không?\n"
                    + "            </p>\n"
                    + "            <div class=\"arrow3\"></div>\n"
                    + "        </div>\n"
                    + "\n"
                    + "\n"
                    + "        <div id=\"ans_q3\">\n"
                    + "            Xin lỗi, hiện tại chúng tôi chỉ có thể giao theo khung giờ mà không thể hẹn bạn chính xác đến từng phút,\n"
                    + "            .\n"
                    + "        </div><hr />"
                    + "<div class=\"q4\" onclick=\"toggleAns_q4(document.querySelector('.arrow4'))\">\n"
                    + "                <p>Tôi có thể thay đổi khung thời gian/ địa chỉ giao hàng sau khi đã đặt không?</p>\n"
                    + "                <div class=\"arrow4\"></div>\n"
                    + "            </div>\n"
                    + "            <div id=\"ans_q4\">\n"
                    + "                Để thay đổi thông tin giao hàng, vui lòng liên hệ với chúng tôi trước ít nhất 24h để chúng tôi có thể sắp\n"
                    + "                xếp lại tuyến đường giao hàng cho bạn. Nếu bạn liên hệ quá gấp, chúng tôi sẽ không thể thay đổi điều này\n"
                    + "            </div>");
            request.getSession().setAttribute("ShipQues", "id");
            request.getSession().removeAttribute("ProductQues");
            request.getSession().removeAttribute("ProductQues");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
