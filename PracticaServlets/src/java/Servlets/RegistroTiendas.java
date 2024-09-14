/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres_Marulanda
 */
@WebServlet(name = "RegistroTiendas", urlPatterns = {"/RegistroTiendas"})
public class RegistroTiendas extends HttpServlet {

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
            
            // Declarar las variables para capturar los datos del formulario.
            String codigoTienda = request.getParameter("codigoTienda");
            String nitTienda = request.getParameter("nitTienda");
            String nombreTienda = request.getParameter("nombreTienda");
            String ciudadTienda = request.getParameter("ciudadTienda");
            String direccion = request.getParameter("direccionTienda");
            String telefono = request.getParameter("telefonoTienda");
            String nombreAdministrador = request.getParameter("nombreAdministrador");
            String telefonoAdmin = request.getParameter("telAdministrador");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistroTiendas</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h4> Código: " + codigoTienda + "</h4>");
            out.println("<h4> Nit: " + nitTienda + "</h4>");
            out.println("<h4> Nombre: " + nombreTienda + "</h4>");
            out.println("<h4> Ciudad: " + ciudadTienda + "</h4>");
            out.println("<h4> Dirección: " + direccion + "</h4>");
            out.println("<h4> Teléfono: " + telefono + "</h4>");
            out.println("<h4> Administrador: " + nombreAdministrador + "</h4>");
            out.println("<h4> Teléfono administrador: " + telefonoAdmin + "</h4>");
            
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
