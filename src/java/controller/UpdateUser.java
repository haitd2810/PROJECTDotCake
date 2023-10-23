/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
import dal.UserDAO;

/**
 *
 * @author Duy Hai
 */
public class UpdateUser extends HttpServlet {

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
        RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
        rd.forward(request, response);
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
        String url = "profileUpdate.jsp";
        try {
            String name = request.getParameter("ten");
            String mail = request.getParameter("mail");
            String phone = request.getParameter("sdt");
            String address = request.getParameter("diachi");
            String username = (String) request.getSession().getAttribute("acc");
            //check format of name
            if (name.matches(".+[0-9]+.+") || name.matches("[0-9]+.+") || name.matches(".+[0-9]+")) {
                request.setAttribute("SMSUPDATEUSER", "name is not contains number!");
                
            } else {
                //check format of mail
                if ((mail.matches("[a-zA-Z0-9]+[@][a-zA-Z]+[.][a-z]+") || mail.matches("[a-zA-Z0-9]+[@][a-zA-Z]+[.][a-z]+[.][a-z]+"))) {
                    //check format of phone
                    if (phone.length() == 10 || phone.matches("[0]{1}[0-9]{9}") || phone.length() == 0) {
                        UserDAO dao = new UserDAO();
                        boolean result = dao.UpdateUser(name, mail, phone, address, username);
                        //check update is success or not
                        if (result) {
                            UserDAO userdao = new UserDAO();
                            User user = (User) request.getSession().getAttribute("USER");
                            User customer = userdao.getUser(username, user.getPassword());
                            request.getSession().setAttribute("USER", customer);
                            url="profile.jsp";
                        }
                        
                    } else {
                        request.setAttribute("SMSUPDATEUSER", "Phone number must be exactly 10 digits and start by 0");
                    }
                } else {
                    request.setAttribute("SMSUPDATEUSER", "mail is wrong format");
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
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
