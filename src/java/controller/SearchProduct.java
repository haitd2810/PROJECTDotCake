/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import model.image;

/**
 *
 * @author admin
 */
@WebServlet(name = "SearchProduct", urlPatterns = {"/search"})
public class SearchProduct extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        String search = request.getParameter("search");
        UserDAO dao = new UserDAO();
        List<image> listP = dao.searchByName(search);
        PrintWriter out = response.getWriter();
        for (image o : listP) {
            out.print("<div class=\"col-md-3 seller__item\" style=\"padding: 0; border-bottom: 1px solid #000; height: 450px\">\n"
                    + "                                    <a  href=\"ProductDetail?pid="+o.getProductID()+"\">\n"
                    + "                                        <img src=\""+o.getImage()+"\" alt=\"\">\n"
                    + "                                        <h1>"+o.getProductName()+"</h1>\n"
                    + "                                        <p><span>"+o.getProductPrice()+"</span>VND</p>\n"
                    + "                                        <div class=\"seller__btn\">\n"
                    + "                                            <button class=\"order\"><a href=\"\">Order</a></button>\n"
                    + "                                            <button class=\"cart\"><a href=\"\">Cart</a></button>\n"
                    + "                                        </div>\n"
                    + "                                    </a>\n"
                    + "                                </div>");
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
