/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cellphonestore.controller;

import com.cellphonestore.dao.ProductDAO;
import com.cellphonestore.model.Cart;
import com.cellphonestore.model.Item;
import com.cellphonestore.model.Products;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hongd
 */
@WebServlet(name = "qtyProcessController", urlPatterns = {"/qtyprocess"})
public class qtyProcessController extends HttpServlet {

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
            out.println("<title>Servlet qtyProcessController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet qtyProcessController at " + request.getContextPath() + "</h1>");
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
        com.cellphonestore.dao.ProductDAO dao = new ProductDAO();
        List<Products> list = dao.getAll();
        Cookie array[] = request.getCookies();
        String element="";
        if (array != null) {
            for (Cookie cookie : array) {
                if (cookie.getName().equals("cart")) {
                    element += cookie.getValue();
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }
            }
        }
        Cart cart = new Cart(element, list);
        String num_raw = request.getParameter("num");
        String id_raw = request.getParameter("id");
        int id,num=0;
        try {
            id = Integer.parseInt(id_raw);
            num = Integer.parseInt(num_raw);
            Products p = dao.getProductById2(id);
            int qty = p.getAmount();
            if ((num==-1)&&cart.getQuantityById(id)<=1) {
                cart.removeItem(id);
            } else {
                if ((num==1) && cart.getQuantityById(id)>=qty) {
                    num=0;
                }
                int price = p.getPrice()*2;
                Item item = new Item(p, num, price);
                cart.addItem(item);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: "+e);
        }
        List<Item> items = cart.getItems();
        element = "";
        if (items.size()>0) {
            element = items.get(0).getProducts().getId()+":"+items.get(0).getQuantity();
            for (int i = 0; i < items.size(); i++) {
                element += ","+items.get(i).getProducts().getId()+":"+items.get(i).getQuantity();
            }
        }
        Cookie cookie = new Cookie("cart", element);
        cookie.setMaxAge(2*24*60*60);
        response.addCookie(cookie);
        request.setAttribute("cart", cart);
        request.getRequestDispatcher("cart.jsp").forward(request, response);
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
        com.cellphonestore.dao.ProductDAO dao = new ProductDAO();
        List<Products> list = dao.getAll();
        Cookie array[] = request.getCookies();
        String element = "";
        if (array != null) {
            for (Cookie cookie : array) {
                if (cookie.getName().equals("cart")) {
                    element += cookie.getValue();
                    response.addCookie(cookie);
                }
            }
        }
        String id = request.getParameter("id");
        String ids[] = element.split(",");
        String out = "";
        for (int i = 0; i < ids.length; i++) {
            String string[] = ids[i].split(":");
            if (!string[0].equals(id)) {
                if (out.isEmpty()) {
                    out = ids[i];
                } else {
                    element += ","+ids[i];
                }
            }
        }
        if (!out.isEmpty()) {
            Cookie cookie = new Cookie("cart", out);
            cookie.setMaxAge(2*24*60*60);
            response.addCookie(cookie);
        }
        Cart cart = new Cart(out, list);
        request.setAttribute("cart", cart);
        request.getRequestDispatcher("cart.jsp").forward(request, response);
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
