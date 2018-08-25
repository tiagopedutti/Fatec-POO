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
 * @author Tiago
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/index.html"})
public class HomeServlet extends HttpServlet {

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
                out.println("<link rel='stylesheet' type='text/css' href='libs/bootstrap/bootstrap.min.css'/>");
                out.println("<style>.card{height: 100%}</style>");
//                out.println("<link rel='stylesheet' type='text/css' href='css/main.css'/>");
                out.println("<title>Home</title>");            
            out.println("</head>");
            
            out.println("<body>");
                out.println("<div class='container-fluid'>");
                
                    out.println("<header class='jumbotron text-center text-light' style='background: linear-gradient(to bottom right, #4cc0fb, #007bff)'>");
                        out.println("<h1 class='display-2'>Cálculo de Juros</h1>");
                        out.println("<h2 class='display-4'>Projeto 01</h2>");
                    out.println("</header>");

                    out.println("<main class='text-center'>");
                        
                        out.println("<div class='row'>");
                            
                            
                        out.println("<div class='col-md-6'>");
                            out.println("<div class='card'>");
                                out.println("<h5 class='card-header bg-primary text-light'>Sobre</h5>");
                                out.println("<div class='card-body'>");
                                  out.println("<h5 class='card-title'>Sobre o Projeto</h5>");
                                    out.println("<p class='card-text'>O projeto gira em torno de dois principais servlets.<br/> "
                                            + "Ambos os componentes possuem um formulário, que irá retornar como resultado, o montante de uma aplicação inicial.<br/>"
                                            + "Um servlet realiza o cálculo aplicando juros simples, e o outro, juros compostos!</p>");
                                out.println("</div>");
                            out.println("</div>");
                        out.println("</div>");
                            
                        out.println("<div class='col-md-6'>");
                            out.println("<div class='card'>");
                                out.println("<h5 class='card-header bg-primary text-light'>Equipe</h5>");
                                out.println("<div class='card-body'>");
                                  out.println("<h5 class='card-title'>Créditos da nossa equipe</h5>");
                                    out.println("<ul class='text-left'>");
                                        out.println("<li><b>Tiago Benitez Pedutti</b> - Servlet Home</li>");
                                        out.println("<li><b>Ernandes Roberto Papa Braga</b> - <i>Front-end</i> Servlet Juros Simples</li>");
                                        out.println("<li><b>Sidney Almeida</b> - <i>Back-end</i> Servlet Juros Simples</li>");
                                        out.println("<li><b>Julio Cesar Takeda</b> - <i>Front-end</i> Servlet Juros Compostos</li>");
                                        out.println("<li><b>Lucas Martins Garcia</b> - <i>Back-end</i> Servlet Juros Compostos</li>");
                                    out.println("</ul>");
                                out.println("</div>");
                            out.println("</div>");
                        out.println("</div>");
                            
                        out.println("<div class='offset-3 col-md-6 my-5'>");
                            out.println("<div class='card'>");
                                out.println("<h5 class='card-header bg-primary text-light'>Cálculos</h5>");
                                out.println("<div class='card-body'>");
                                  out.println("<h5 class='card-title'>Selecione o cálculo que você deseja realizar</h5>");
                                    out.println("<nav>");
                                        out.println("<a href='jurosSimples'><button class='btn btn-primary' type='button'>Juros Simples</button></a>");
                                        out.println("<a href='jurosCompostos'><button class='btn btn-primary' type='button'>Juros Compostos</button></a>");
                                    out.println("</nav>");
                                out.println("</div>");
                            out.println("</div>");
                        out.println("</div>");
                            
                        out.println("</div>");

                    out.println("</main>");
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
