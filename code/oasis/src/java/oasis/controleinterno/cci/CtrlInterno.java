/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oasis.controleinterno.cci;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import oasis.controleinterno.cdp.Grupo;
import oasis.controleinterno.cdp.Usuario;
import oasis.controleinterno.cgt.AplGrupo;
import util.utilitarioException.WebException;

/**
 *
 * @author Rafael Bis
 */
public class CtrlInterno extends HttpServlet {

    String nome;
    String descricao;
    
    // Inicio CRUD de Grupos
    
    protected void incluirGrupo(HttpServletRequest request, HttpServletResponse response){
        nome = request.getParameter("nome");
        descricao = request.getParameter("descricao");
        HttpSession session = request.getSession();
        Usuario u = (Usuario) session.getAttribute("userS2teamoases");
        ArrayList<Object> list = new ArrayList<>();

        list.add(nome);
        list.add(descricao);
        list.add(u);
        try {
            AplGrupo.getInstancia().incluirGrupo(list);
        } catch (WebException ex) {
            Logger.getLogger(CtrlInterno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void editarGrupo(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        Grupo group = (Grupo) session.getAttribute("GrupoNaSession");
        try {
            AplGrupo.getInstancia().editarGrupo(group);
        } catch (WebException ex) {
            Logger.getLogger(CtrlInterno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void excluirGrupo(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        Grupo group = (Grupo) session.getAttribute("GrupoNaSession");
        try {
            AplGrupo.getInstancia().excluirGrupo(group);
        } catch (WebException ex) {
            Logger.getLogger(CtrlInterno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void convidarParticipante(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        Grupo group = (Grupo) session.getAttribute("GrupoNaSession");
        
        //discutir isso
        ArrayList<Object> list = new ArrayList<>();
        list = (ArrayList<Object>) session.getAttribute("Participantes convidados");
        String link ="";
        //link = createLink(group);
        try {
            AplGrupo.getInstancia().convidarPartipante(list, link, group);
        } catch (WebException ex) {
            Logger.getLogger(CtrlInterno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void excluirParticipante(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        Grupo group = (Grupo) session.getAttribute("GrupoNaSession");
        ArrayList<Object> users = (ArrayList<Object>)session.getAttribute("UsuariosExcluidos");
        try {
            AplGrupo.getInstancia().excluirParticipante(users, group);
        } catch (WebException ex) {
            Logger.getLogger(CtrlInterno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    protected void gerarRelatorio(HttpServletRequest request, HttpServletResponse response){
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /*
             * TODO output your page here. You may use following sample code.
             */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CtrlInterno</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CtrlInterno at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {      
        //processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);
    }

        @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
