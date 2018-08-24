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
import java.lang.Math;
import java.text.DecimalFormat;

/**
 *
 * @author Lucas Martins
 */
@WebServlet(name = "JurosCompostoServlet", urlPatterns = {"/jurosCompostos"})
public class JurosCompostoServlet extends HttpServlet {

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
                    out.println("<title>Servlet JurosCompostoServlet</title>");            
                out.println("</head>");
                
            out.println("<body>");
            
                out.println("<h1>Servlet JurosCompostoServlet at " + request.getContextPath() + "</h1>");
                
                out.println("<form>");
                        out.println("<label>Capital:</label> <input type='text' pattern='[0-9]+$' name='C' required> ");
                        out.println("<label>Taxa de Juros (% ao mês):</label> <input type='text' name='i' required> ");
                        out.println("<label>Tempo total (meses):</label><input type='text' pattern='[0-9]+$' name='n' required>");
                        out.println("<input type='submit' value='Calcular'>");
                out.println("</form>");
                
                double c = Double.parseDouble(request.getParameter("C"));
                double i =  1 + (Double.parseDouble(request.getParameter("i"))/100);
                int n = Integer.parseInt(request.getParameter("n"));
                double potencia = Math.pow(i, n);
                double m = c * potencia;
                
                out.println("<h1> Montante de " + c + " por " + i + "% " + "por " + n + "meses é " + new DecimalFormat("0.00").format(m) + "</h1>");
                out.println("<h3><a href='index.html'>Voltar</a></h3>");
                
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
