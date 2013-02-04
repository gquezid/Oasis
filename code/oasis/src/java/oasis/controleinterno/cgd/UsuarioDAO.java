package oasis.controleinterno.cgd;


import oasis.controleinterno.cdp.Usuario;
import util.utilitarioPersistence.DAO;

/**
 * < description of this class > 
 * @author Gabriel Quézid
 * @since 08/12/2012
 */
public interface UsuarioDAO extends DAO<Usuario>
{
    public Usuario obter(Usuario u);
}
