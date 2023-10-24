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
@WebServlet(name = "OrderQues", urlPatterns = {"/OrderQues"})
public class OrderQues extends HttpServlet {

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
                    + "                <button onclick=\"ShipQues()\">VỀ GIAO HÀNG</button>\n"
                    + "                <button id=\"giaohang\" onclick=\"OrderQues()\">VỀ ĐẶT HÀNG</button>\n"
                    + "                <button onclick=\"ProductQues()\">VỀ SẢN PHẨM</button>\n"
                    + "        </div>"
                    + "<div class=\"q1\" onclick=\"toggleAns_q1(document.querySelector('.arrow1'))\">\n"
                    + "            <p> Thời gian đặt bánh tối thiểu là bao lâu?\n"
                    + "            </p>\n"
                    + "            <div class=\"arrow1\"></div>\n"
                    + "        </div>\n"
                    + "\n"
                    + "\n"
                    + "        <div id=\"ans_q1\" >\n"
                    + "            Bạn nên đặt trước 1 ngày để có thể lựa chọn tất cả các mẫu bánh.\n"
                    + "       <br/>\n"
                    + "        Nếu bạn cần đặt gấp trong ngày, vui lòng liên hệ hotline 090 786 0330 để được phục vụ ngay, tuy nhiên mẫu bánh có thể hạn chế và không đủ toàn bộ mẫu.\n"
                    + "        \n"
                    + "        </div><hr/>"
                    + "<div class=\"q2\" onclick=\"toggleAnswer_q2(this)\">\n"
                    + "            <p> DotCake có các hình thức thanh toán nào? </p>\n"
                    + "            <div class=\"arrow2\"></div>\n"
                    + "        </div>\n"
                    + "        <div id=\"ans_q2\" style=\"display: none;\">\n"
                    + "            Hiện tại đối với cách đặt hàng qua website, DotCake chỉ có hình thức thanh toán duy nhất là trả tiền mặt 100% giá trị đơn hàng ngay khi nhận hàng.\n"
                    + "        </div>"
                    + "<hr />\n"
                    + "        <div class=\"q3\" onclick=\"toggleAns_q3(document.querySelector('.arrow3'))\">\n"
                    + "            <p> Tôi có thể thay đổi loại bánh sau khi đã hoàn tất đặt hàng không?\n"
                    + "            </p>\n"
                    + "            <div class=\"arrow3\"></div>\n"
                    + "        </div>\n"
                    + "\n"
                    + "\n"
                    + "        <div id=\"ans_q3\">\n"
                    + "            Để thay đổi loại bánh, bạn vui lòng liên hệ với chúng tôi trước ít nhất 24h \n"
                    + "            để chúng tôi kiểm tra liệu nguyên liệu có sẵn để đáp ứng không. \n"
                    + "            Nếu nguyên liệu còn đủ chúng tôi sẽ đổi loại bánh theo yêu cầu của bạn,\n"
                    + "             tuy nhiên chúng tôi không đảm bảo chắc chắn về điều này, rất mong bạn thông cảm.\n"
                    + "        </div>"
                    + "<hr />\n"
                    + "\n"
                    + "\n"
                    + "        <div class=\"q4\" onclick=\"toggleAns_q4(document.querySelector('.arrow4'))\">\n"
                    + "            <p>Tôi có thể hủy đơn hàng sau khi đã đặt bánh không?</p>\n"
                    + "            <div class=\"arrow4\"></div>\n"
                    + "        </div>\n"
                    + "        <div id=\"ans_q4\">\n"
                    + "            Nếu bạn muốn huỷ đơn hàng, vui lòng liên hệ trước với chúng tôi ít nhất 24h. \n"
                    + "            Nếu bạn liên hệ với chúng tôi muộn hơn 24h, lúc này đơn hàng của bạn đã được sản xuất vì vậy rất tiếc chúng tôi sẽ không thể hỗ trợ bạn huỷ đơn hàng.\n"
                    + "        </div>");
            request.getSession().setAttribute("OrderQues", "id");
            request.getSession().removeAttribute("ShipQues");
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
