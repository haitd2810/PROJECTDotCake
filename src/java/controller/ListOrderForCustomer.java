/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.ImageDAO;
import dal.ShipDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import model.Ship;
import model.ShipObject;
import model.User;
import model.image;

/**
 *
 * @author Duy Hai
 */
@WebServlet(name="ListOrderForCustomer", urlPatterns={"/ListOrderForCustomer"})
public class ListOrderForCustomer extends HttpServlet {
   
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
        
        ShipDAO shipdao = new ShipDAO();
        User user = (User)request.getSession().getAttribute("USER");
        List<Ship> listShipOfCus = shipdao.getShipOfCus(user.getUserID());   
        ImageDAO imagedao = new ImageDAO();    
        for(int i=0; i <listShipOfCus.size();i++){
            imagedao.getImageOfProOrder(listShipOfCus.get(i).getProductID());
        }
        ShipObject ship = new ShipObject();
        ship.AddtoList(imagedao.getListimageOfCus(), listShipOfCus);
        request.getSession().setAttribute("LISTORDERED", ship);
        response.sendRedirect("OrderedOfCustomer.jsp");
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
        processRequest(request, response);
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
