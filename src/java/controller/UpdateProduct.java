/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.SellerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;
import model.Product;

/**
 *
 * @author admin
 */
@WebServlet(name="UpdateProduct", urlPatterns={"/updateProduct"})
public class UpdateProduct extends HttpServlet {
   
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
            out.println("<title>Servlet UpdateProduct</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateProduct at " + request.getContextPath () + "</h1>");
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
        String productid = request.getParameter("productid");
        SellerDAO dao = new SellerDAO();
        try{
            Product p= dao.getProductByProductID(productid);
           request.setAttribute("productupdate", p);
            request.getRequestDispatcher("UpdateProduct.jsp").forward(request, response);
            
        }catch(IOException e){
            System.out.println(e);
        }
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
        String productid = request.getParameter("productid");
        String productname = request.getParameter("productname");
        String productprice_raw = request.getParameter("productprice");
        String detail = request.getParameter("detail");
        String createdate_raw = request.getParameter("createdate");
        String quantity_raw = request.getParameter("quantity");
        String status = request.getParameter("status");
        String categoryID = request.getParameter("categoryID");
        int productprice, quantity;
        Date createdate;
        SellerDAO dao = new SellerDAO();
        try {
            productprice = Integer.parseInt(productprice_raw);
            quantity = Integer.parseInt(quantity_raw);
            createdate = Date.valueOf(createdate_raw);

            Product pNew = new Product(productid, productname,
                        productprice, detail,
                        createdate, quantity, categoryID, status);
                dao.updateProduct(pNew);
                response.sendRedirect("listproduct");
           
        } catch (NumberFormatException e) {
            System.out.println(e);
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
