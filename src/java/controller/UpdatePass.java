/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.UserDAO;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author Duy Hai
 */
@WebServlet(name="UpdatePass", urlPatterns={"/UpdatePass"})
public class UpdatePass extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("UpdatePassword.jsp");
        rd.forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String oldpassword = request.getParameter("oldPass");
        User user = (User) request.getSession().getAttribute("USER");
        if(!oldpassword.equals(user.getPassword())){
            request.getSession().setAttribute("UPDATEFAILED", "Wrong oldpassword");
            response.sendRedirect("UpdatePassword.jsp");
        }else{
            String newpassword = request.getParameter("newPass");
            String repeatnewPass = request.getParameter("repeatNewPass");
            if(!newpassword.equals(repeatnewPass)){
                request.getSession().setAttribute("UPDATEFAILED", "new password and repeat new password have to be same");
                response.sendRedirect("UpdatePassword.jsp");
            }else{
                UserDAO dao = new UserDAO();
                try {
                    boolean result = dao.UpdatePassword(user.getUsername(), newpassword);
                    if(result){
                        request.setAttribute("success","success");
                        request.setAttribute("msg", "Update success. Please Login again");
                        request.getSession().removeAttribute("USER");
                        request.getRequestDispatcher("Hoang_SignIn.jsp").forward(request, response);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
//        RequestDispatcher rd = request.getRequestDispatcher("signin");
//        rd.forward(request, response);
          
        
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
