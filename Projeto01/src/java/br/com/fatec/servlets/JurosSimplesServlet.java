/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ernandes
 */
@WebServlet(name = "JurosSimplesServlet", urlPatterns = {"/JurosSimplesServlet"})
public class JurosSimplesServlet extends HttpServlet {

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
                    out.println("<title>Servlet SimplesServlet</title>");
                    out.println("<meta charset='UTF-8'>");
                    out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
                out.println("</head>");
                out.println("<body>");
                    out.println("<h1 align='center'>Cálculo de Juros Simples</h1>");
                    out.println("<div id='menu'>");
                        out.println("<ul>");
                            out.println("<li><a href='index.html'> Home  </a></li>");
                            out.println("<li><a href='juros-simples.html' >Juros Simples  </a></li>");
                            out.println("<li><a href='juros-composto.html' >Juros Composto</a></li>");
                        out.println("</ul>");
                    out.println("</div>");
                    out.println("<form>");
                        out.println("<p>Capital: <input type='text' pattern='[0-9]+$' name='capital' required> ");
                        out.println("<p>Taxa de Juros (% ao mês): <input type='text' name='taxa' required> ");
                        out.println("<p>Tempo total (meses): <input type='text' pattern='[0-9]+$' name='meses' required>");
                        out.println("<p><input type='submit' value='Calcular'></p>");
                    out.println("</form>");
                    double capital = Double.parseDouble(request.getParameter("capital"));
                    double taxa = Double.parseDouble(request.getParameter("taxa"));
                    int meses = Integer.parseInt(request.getParameter("meses"));
                    double juros = capital*(taxa/100)*meses;
                    double resultado = capital+juros;
                    out.println("<h3 style='color:red;'>Montante: "+resultado+"</h3>");
                    out.println("<h3 style='color:red;'>Juros: "+juros+"</h3>");
                    out.println("<h3><a href='index.html'>Voltar</h3>");
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
        processRequest(request, response);
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
