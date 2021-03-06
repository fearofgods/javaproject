/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cellphonestore.controller;

import com.cellphonestore.dao.ProductDAO;
import com.cellphonestore.model.Products;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hongd
 */
@WebServlet(name = "productByPrice", urlPatterns = {"/productbyprice"})
public class productByPrice extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet productByPrice</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet productByPrice at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String min_raw = request.getParameter("min");
        String max_raw = request.getParameter("max");
        try {
            int min = Integer.parseInt(min_raw);
            int max = Integer.parseInt(max_raw);
            com.cellphonestore.dao.ProductDAO pdao = new ProductDAO();
            List<Products> plist = pdao.searchByPrice(min, max);
            
            if (plist != null && !plist.isEmpty()) {
                
                request.setAttribute("plist", plist);
                request.setAttribute("title", "S???n ph???m trong kho???ng gi?? t??? "+min+" tri???u - "+max+" tri???u");
                request.getRequestDispatcher("searchresult.jsp").forward(request, response);
            } else {

                request.setAttribute("title", "S???n ph???m trong kho???ng gi?? t??? "+min+"tri???u - "+max+" tri???u");
                request.getRequestDispatcher("searchresult.jsp").forward(request, response);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
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
