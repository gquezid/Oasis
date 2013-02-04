package oasis.controleinterno.cgd;


import oasis.controleinterno.cdp.Usuario;
import java.util.List;
import util.utilitarioPersistence.DAOJPA;

/**
 * < description of this class > 
 * @author Gabriel Quézid
 * @since 08/12/2012
 */
public class UsuarioDAOJPA extends DAOJPA<Usuario> implements UsuarioDAO {
   @Override
    public Usuario obter(Usuario u) {
        List<Usuario> usuario = entityManager.createQuery("select u from Usuario u where u.id = ?1").setParameter(1, u.getId()).getResultList();
        return usuario.get(0);
    }
}
