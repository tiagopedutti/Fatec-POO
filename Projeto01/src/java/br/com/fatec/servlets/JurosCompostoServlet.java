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
                out.println("<meta charset='UTF-8'/>");
                out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'/>");
                    out.println("<title>Servlet JurosCompostoServlet</title>");  
                    out.println("<link rel='stylesheet' type='text/css' href='libs/bootstrap/bootstrap.min.css'/>");
                out.println("</head>");
                
            out.println("<body>");
                
                out.println("<div class='container-fluid'>");
                    
                    out.println("<div class='row'>");
                        out.println("<div class='offset-md-4 col-md-4'>");
                            out.println("<h1 class='text-center'>Juros Compostos</h1>");

                            out.println("<form class='form-row'>");
                                    out.println("<div class='form-group col-md-4'><label>Capital:</label> <input class='form-control' type='text' pattern='[0-9]+$' name='C' required></div>");
                                    out.println("<div class='form-group col-md-4'><label>Taxa de Juros (% ao mês):</label> <input class='form-control' type='text' name='i' required></div>");
                                    out.println("<div class='form-group col-md-4'><label>Tempo total (meses):</label><input class='form-control' type='text' pattern='[0-9]+$' name='n' required></div>");
                                    out.println("<input class='offset-4 col-md-4 btn btn-success' type='submit' value='Calcular'>");
                            out.println("</form>");

                            double c = Double.parseDouble(request.getParameter("C"));
                            double i =  1 + (Double.parseDouble(request.getParameter("i"))/100);
                            int n = Integer.parseInt(request.getParameter("n"));
                            double potencia = Math.pow(i, n);
                            double m = c * potencia;
                            
                            out.println("<div class='alert alert-success my-3' role='alert'>");
                                out.println("<b>Resultado: </b>Montante de " + c + " por " + i + "% " + " por " + n + " meses é " + new DecimalFormat("0.00").format(m));
                            out.println("</div>");
                        out.println("</div>");
                        
                    out.println("</div>");
                    
                out.println("</div>");
                
                out.println("<script src='libs/jquery/jquery-3.2.1.slim.min.js'/>");
                out.println("<script src='libs/bootstrap/popper.min.js'/>");
                out.println("<script src='libs/bootstrap/bootstrap.min.js'/>");
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
