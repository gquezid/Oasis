package oasis.controleinterno.cci;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import oasis.controleinterno.cdp.Usuario;
import oasis.controleinterno.cgt.AplPrincipal;

/**
 *
 * @author Gabriel Quézid
 */
public class CtrlPrincipal extends HttpServlet {

    Usuario u = new Usuario();
    String nome;
    String mail;
    String senha1;

    public Usuario verificarUsuario(HttpServletRequest request, HttpServletResponse response) {
        mail = request.getParameter("mail");
        senha1 = request.getParameter("senha");

        HttpSession session = request.getSession();
        session.invalidate();
        if (mail != null && senha1 != null) {
            try {
                u = AplPrincipal.getInstance().verificarUsuario(mail, senha1);
                if (u != null) {
                    session = request.getSession();
                    session.setAttribute("userS2teamoases", u);
                }
            } catch (Exception ex) {
                Logger.getLogger(CtrlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return u;
    }

    public void realizarLogoff(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("index.jsp");
    }

    public void realizarLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RequestDispatcher dispatcher = null;
        Usuario retorno = null;

        retorno = verificarUsuario(request, response);

        if (retorno == null) {
            response.sendRedirect("cases/form/pagLogin.jsp");
        } else {
            //processRequest(request, response);
            response.sendRedirect("system.jsp");
        }
    }

    public void realizarCadastro(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RequestDispatcher dispatcher = null;
        Usuario retorno = null;

        try {
            retorno = salvarUsuario(request, response);
        } catch (Exception ex) {
            Logger.getLogger(CtrlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (retorno == null) {
            response.sendRedirect("cases/form/pagCadastroUsuario.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    // CONTROLE DA PÁGINA DE CADASTRO -->
    private void setParametrosUsuario(HttpServletRequest request, HttpServletResponse response) {
        u = (Usuario) request.getSession().getAttribute("user");
        nome = u.getNome();
        mail = u.getEmail();
        senha1 = u.getSenha();

    }

    public boolean validarUsuario(HttpServletRequest request) throws Exception {
        nome = request.getParameter("nome") + " " + request.getParameter("sobrenome");
        mail = request.getParameter("mail");
        senha1 = request.getParameter("senha1");

        if (("".equals(nome)) || ("".equals(mail)) || ("".equals(senha1))) {
            return false;
        } else {
            if (AplPrincipal.getInstance().validarUsuario(mail) != null) {
                return false;
            } else {
                return true;
            }
        }

    }

    private Usuario salvarUsuario(HttpServletRequest request, HttpServletResponse response) throws Exception {
        boolean valido = validarUsuario(request);
        ArrayList<Object> list = new ArrayList<>();

        list.add(mail);
        list.add(nome);
        list.add(senha1);

        if (valido != false) {
            return AplPrincipal.getInstance().incluirUsuario(list);
        } else {
            return null;
        }
    }

    // FIM DO CONTROLE DA PÁGINA DE CADASTRO
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CtrlPrincipal</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CtrlPrincipal at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //processRequest(request, response);

        switch (request.getParameter("index")) {
            case "0":
                realizarLogin(request, response);
                break;
            case "1":
                realizarCadastro(request, response);
                break;
            case "3":
                realizarLogoff(request, response);
                break;
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
