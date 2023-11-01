/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.OrderItemDAO;
import dal.ShipDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import model.CartItem;
import model.CartObject;
import model.User;

/**
 *
 * @author Duy Hai
 */
@WebServlet(name="Order", urlPatterns={"/Order"})
public class Order extends HttpServlet {
   
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Order</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Order at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        processRequest(request, response);
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
        String name = request.getParameter("NameOfCus");
        String phone = request.getParameter("PhoneOfCus");
        String address = request.getParameter("AddressOfCus");
        String date = request.getParameter("DateReceipt");
        String time = request.getParameter("select");
        CartObject cart = (CartObject) request.getSession().getAttribute("cart");
        
        int total =0;
        for(int i=0; i < cart.getItem().size();i++){
            int cost = (int) ((int) cart.getItem().get(i).getIquantity()*cart.getItem().get(i).getPrice());
            total += cost;
        }
        User user = (User) request.getSession().getAttribute("USER");
        String userID = Integer.toString(user.getUserID());
        String totalCost = Integer.toString(total);
        ShipDAO ship = new ShipDAO();
        //check length and format of phone
        //[0]{1}: exactly number 0 in first
        //[0-9]{9}: exactly 9 number is before the first number
        if(phone.length()!=10 || !phone.matches("[0]{1}[0-9]{9}")){
            request.getSession().setAttribute("OrderMSG", "Phone have to be exactly 10 digit and start by 0");
            request.getRequestDispatcher("Order.jsp").forward(request, response);
        }else{
            Boolean resultShip = ship.insertShip(userID, name, phone, address, date, time, totalCost);
            if(resultShip){
                String ShipID = ship.getNewShip();
                boolean resultOrder=true;
                OrderItemDAO orderdao = new OrderItemDAO();
                for(int i=0; i < cart.getItem().size();i++){
                    resultOrder = orderdao.InsertOrderItem(ShipID, cart.getItem().get(i).getProductID(),Integer.toString(cart.getItem().get(i).getIquantity()));
                }
                if(resultOrder){
                    List<CartItem> items = new ArrayList<>();
                    cart.setItem(items);
                    request.getSession().setAttribute("cart", cart);
                    request.getSession().setAttribute("size", cart.getItem().size());
                    request.getSession().removeAttribute("OrderMSG");
                    response.sendRedirect("DispathController?page=home");
                }
            }
        }
        
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
