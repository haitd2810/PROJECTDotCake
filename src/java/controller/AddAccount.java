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
import dal.*;
import jakarta.servlet.annotation.WebServlet;
import model.*;
/**
 *
 * @author DELL
 */
@WebServlet(name = "AddAccount", urlPatterns = {"/addaccount"})
public class AddAccount extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    } 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("Username");
        String pass = request.getParameter("Password");
        String fullnam = request.getParameter("FullName");
        String address = request.getParameter("Address");
        String phone = request.getParameter("MobileNo");
        String email = request.getParameter("Email");
        int role = Integer.parseInt(request.getParameter("role"));
        UserDAO userdao = new UserDAO();
        String[] word = fullnam.split(" ");
        StringBuilder wordUp = new StringBuilder();
        
        for(String w : word){
            if (w.length() > 0){
                wordUp.append(Character.toUpperCase(w.charAt(0)));
                if(w.length() > 1){
                    wordUp.append(w.substring(1).toLowerCase());
                }
                wordUp.append(" ");
          }
        }
        fullnam = wordUp.toString().trim();
        if (user.contains(" ")) {
            request.setAttribute("msg1", "Username is invalid!");
        } else if (pass.contains(" ")) {
            request.setAttribute("msg2", "Password is invalid!");
        } else if (phone.contains(" ")) {
            request.setAttribute("msg3", "Mobile No is invalid!");
        } else if (email.contains(" ")) {
            request.setAttribute("msg4", "Email is invalid!");
        } else if (pass.length() < 4){
            request.setAttribute("msg2", "Password is too weak!");
        } else if (user.equals(pass)){
            request.setAttribute("msg1", "Username and Password do not orverlap!");
        } else if (phone == null || !phone.matches("\\d{10}")){
            request.setAttribute("msg3", "Phone No number must be exactly 10 digits");
        } else if (!email.matches("[a-zA-Z0-9]+[@][a-zA-Z]+[.][a-z]+") && !email.matches("[a-zA-Z0-9]+[@][a-zA-Z]+[.][a-z]+[.][a-z]+")){
            request.setAttribute("msg4", "Email is invalid!");
        }
        else{
            User acc1 = userdao.getAccountByUser(user);
            User acc2 = userdao.getPhoneAccountByUser(phone);
            User acc3 = userdao.getEmailAccountByUser(email);
            if(acc1 != null){
                request.setAttribute("msg1", "Username is exist");
            }
            else if(acc2 != null){
                request.setAttribute("msg3", "Mobile No number is exist");
            }
            else if(acc3 != null){
                request.setAttribute("msg4", "Email is exist");
            }
            else {
                User acc = new User();
                acc = new User(0, fullnam, user, pass, phone, address, email, role);
                userdao.isertNewAccount(acc);
                request.setAttribute("msg", "Insert successfully!");
            }
        }
        request.getRequestDispatcher("AddAccount.jsp").forward(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
