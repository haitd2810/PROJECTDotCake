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
@WebServlet(name = "ProductQues", urlPatterns = {"/ProductQues"})
public class ProductQues extends HttpServlet {

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
                    + "                <button onclick=\"OrderQues()\">VỀ ĐẶT HÀNG</button>\n"
                    + "                <button id=\"giaohang\" onclick=\"ProductQues()\">VỀ SẢN PHẨM</button>\n"
                    + "        </div>"
                    + "<div class=\"q1\" onclick=\"toggleAns_q1(document.querySelector('.arrow1'))\">\n"
                    + "            <p> Cách bảo quản của các loại bánh thế nào? Thời gian sử dụng là bao lâu\n"
                    + "            </p>\n"
                    + "            <div class=\"arrow1\"></div>\n"
                    + "        </div>\n"
                    + "\n"
                    + "\n"
                    + "        <div id=\"ans_q1\" >\n"
                    + "            Tất cả các loại bánh của chúng tôi hoàn toàn sử dụng nguyên liệu tươi và \n"
                    + "            không sử dụng chất bảo quản, vì vậy vui lòng giữ bánh trong hộp kín & bảo\n"
                    + "             quản ngăn mát tủ lạnh ngay khi bạn nhận bánh (không để bánh vào ngăn đông).\n"
                    + "              Bạn không nên để bánh ở nhiệt độ phòng quá 30 phút (bánh sẽ bị chảy), \n"
                    + "              chỉ lấy bánh ra khỏi ngăn mát tủ lạnh ngay trước khi ăn. Bánh được bảo\n"
                    + "               quản đúng cách có thể sử dụng trong vòng 3 ngày.        \n"
                    + "        </div>"
                    + "<hr />\n"
                    + "\n"
                    + "        <div class=\"q2\" onclick=\"toggleAnswer_q2(this)\">\n"
                    + "            <p> Tôi có thể đặt bánh theo mẫu riêng mà tôi muốn được không?  </p>\n"
                    + "            <div class=\"arrow2\"></div>\n"
                    + "        </div>\n"
                    + "        <div id=\"ans_q2\" style=\"display: none;\">\n"
                    + "            Rất tiếc, chúng tôi chỉ sản xuất các mẫu có sẵn và không nhận đặt theo mẫu riêng.\n"
                    + "        </div>"
                    + "<hr />\n"
                    + "\n"
                    + "\n"
                    + "        <div class=\"q3\" onclick=\"toggleAns_q3(document.querySelector('.arrow3'))\">\n"
                    + "            <p> Tôi muốn di chuyển bánh từ nơi này đến nơi khác bằng xe máy / ô tô thì có sợ bánh bị chảy không?\n"
                    + "            </p>\n"
                    + "            <div class=\"arrow3\"></div>\n"
                    + "        </div>\n"
                    + "\n"
                    + "\n"
                    + "        <div id=\"ans_q3\">\n"
                    + "            Bạn có thể di chuyển bánh bằng ô tô trong thời gian dưới 45 phút (với điều kiện máy lạnh trên xe mở ở mức lạnh sâu).\n"
                    + "             Nếu bạn di chuyển bằng xe máy thì quãng đường không nên dài quá 30 phút và thời tiết ngoài trời không vượt mức 30 độ C\n"
                    + "              (quá nóng bánh sẽ bị chảy), tốt nhất nên di chuyển kèm đá lạnh/ đá khô. Vì vậy chúng tôi khuyến khích bạn đặt giao hàng\n"
                    + "               đến trực tiếp địa chỉ bạn sẽ ăn bánh để không phải tự di chuyển bánh nhiều lần.\n"
                    + "        </div>");
            request.getSession().setAttribute("ProductQues", "id");
            request.getSession().removeAttribute("ShipQues");
            request.getSession().removeAttribute("OrderQues");

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
