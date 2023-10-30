/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.*;
import dal.*;

/**
 *
 * @author DELL
 */
public class DeleteAccount extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
//        String UpdateSell = request.getParameter("id");
//        UserDAO userdao = new UserDAO();
//        userdao.getUpdateSeller(UpdateSell);
//        response.sendRedirect("AccountList");
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String[] idArray = request.getParameterValues("iduser");
        String updateSeller = request.getParameter("button");
        UserDAO uDAO = new UserDAO();
        //update Seller
        uDAO.getUpdateSeller(updateSeller);
        //delete account
        if (idArray != null) {
            for (String id : idArray) {
                uDAO.getDeleteAcc(id);
            }
        }
            else{}
        response.sendRedirect("AccountList");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
