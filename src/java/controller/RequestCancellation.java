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
import dal.*;
import model.User;
/**
 *
 * @author DELL
 */
@WebServlet(name="RequestCancellation", urlPatterns={"/requestcancellation"})
public class RequestCancellation extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    } 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String Cancell = request.getParameter("request");
        OrderItemDAO order = new OrderItemDAO();
        order.deleteOrder(Cancell);
   //     request.getRequestDispatcher("ListOrderForCustomer").forward(request, response);
       response.sendRedirect("ListOrderForCustomer");
//        out.print(Cancell);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
