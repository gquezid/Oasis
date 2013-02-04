package oasis.controleinterno.cgt;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oasis.controleinterno.cdp.Usuario;
import util.utilitarioPersistence.DAO;
import util.utilitarioPersistence.DAOFactory;

/**
 * < description of this class > 
 * @author Gabriel Quézid
 * @since 08/12/2012
 */
public class AplPrincipal {
    private DAO apDaoUsuario = DAOFactory.obterDAO(Usuario.class);
    public static AplPrincipal instance = null;
    
    public static AplPrincipal getInstance(){
        if(instance == null){
            instance = new AplPrincipal();
        }
        return instance;
    }
     
    public Usuario login(String login, String senha) {
        return validarUsuario(login, senha);
    }     
    
    public Usuario incluirUsuario(ArrayList<Object> args){
        Usuario usuario = new Usuario();
        
        try {
            usuario.setEmail((String) args.get(0));
            usuario.setNome((String) args.get(1));
            usuario.setSenhaCriptografar((String) args.get(2));

            //System.out.println("INFORAMÇÕES DO USUÁRIO: \nE-MAIL: "  + usuario.getEmail() + "\nNOME: " + usuario.getNome() + "\nSENHA (CRIPTOGRAFADA):" + usuario.getSenha());
            
            usuario = (Usuario) apDaoUsuario.salvar(usuario);
        } catch (Exception ex) {
            Logger.getLogger(AplPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuario;
        
    }
    
    public Usuario alterarUsuario(Usuario usuario) throws Exception {
        usuario.setSenhaCriptografar(usuario.getSenha());

        return (Usuario) apDaoUsuario.salvar(usuario);
    }
    
     public List<Usuario> listarUsuarios() {
        try {
            return (List<Usuario>) apDaoUsuario.obter(Usuario.class);
        } catch (Exception ex) {
            Logger.getLogger(AplPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Usuario validarUsuario(String nome, String senha) {
        try {
            List<Usuario> l = listarUsuarios();
            String senhaCrip = Usuario.gerarHashCode(senha);

            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).getEmail().toLowerCase().equals(nome.toLowerCase()) && l.get(i).getSenha().equals(senhaCrip)) {
                    return l.get(i);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(AplPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Usuario validarUsuario(String mail) {
        List<Usuario> l = listarUsuarios();
        
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getEmail().toLowerCase().equals(mail.toLowerCase())) {
                return l.get(i);
            }
        }

        return null;
    }

    public Usuario verificarUsuario(String nome, String senha) {
        List<Usuario> l = listarUsuarios();
        String senhaCrip = Usuario.gerarHashCode(senha);

        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getEmail().toLowerCase().equals(nome.toLowerCase()) && l.get(i).getSenha().equals(senhaCrip)) {
                return l.get(i);
            }
        }
        return null;
    }
}
