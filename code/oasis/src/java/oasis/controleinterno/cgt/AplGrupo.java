package oasis.controleinterno.cgt;

import java.util.ArrayList;
import java.util.List;
import oasis.controleinterno.cdp.Grupo;
import oasis.controleinterno.cdp.Usuario;
import oasis.controleinterno.cgd.GrupoDAOJPA;
import oasis.controleinterno.cgd.UsuarioDAOJPA;
import util.utilitarioException.WebException;


/**
 * < description of this class > 
 * @author Patrício dos Santos Sante
 * @since 15/12/2012
 */
public class AplGrupo {
    /*esse objeto faz a negociação com a camada de persistencia  *
     */

    private GrupoDAOJPA persistenciaGrupo;
    private UsuarioDAOJPA persistenciaUsario;
    /**
     * *
     * Classe implementa o padrão singloton
     */
    private static AplGrupo instancia;

    public static AplGrupo getInstancia() {
        if (AplGrupo.instancia == null)
        {
            AplGrupo.instancia = new AplGrupo();
        }
        return AplGrupo.instancia;
    }
     
    /**
     * *
     * construtor privado, pois essa classe implementa o padrão singloton
     */
    private AplGrupo() {
        persistenciaGrupo = new GrupoDAOJPA();
        persistenciaUsario = new UsuarioDAOJPA();
    }

    /**
     * Inluir um grupo considera que a lista vira com argumentos na ordem 1.
     * Nome do grupo do tipo estring 2. Descrição do tipo string 3.
     * administrador do tipo Usario
   **
     */
    public void incluirGrupo(ArrayList<Object> args) throws WebException {
        /**
         * *Variavel de controle
         */
        assert args != null;
        assert args.size() < 3;

        Grupo newGrupo = new Grupo();
        newGrupo.setNome(args.get(0).toString());
        Usuario dono = (Usuario) args.get(2);
        String descricao = (String) args.get(1);
        newGrupo.setDescricao(descricao);
        newGrupo.setModerador(dono);
        persistenciaGrupo.salvar(newGrupo);
    }

    /**
     * *
     * Buscar todas os grupos cadastrados no sistema
     */
    public List buscarGrupos() throws WebException 
    {
        return persistenciaGrupo.obter(Grupo.class);
    }

    /**
     * *
     * Evento editar um grupo Esse evento recebe um objeto grupo como
     * paramentros e salva no banco as modificações retorna um novo objeto
     * editado
     */
    public Grupo editarGrupo(Grupo g) throws WebException {
        Grupo Editado = this.persistenciaGrupo.salvar(g);
        return Editado;
    }

    /**
     * *
     * esse evento excluir um grupo do banco de dados recebe como paramentros.
     */
    public void excluirGrupo(Grupo g) throws WebException {
        this.persistenciaGrupo.excluir(g);
    }
   
    
    /**
     * *
     * esse evento tratar do convite de participantes para o grupo
     * Recebe uma lista de usarios
     */
    public void convidarPartipante(ArrayList<Object> usuarios,String LinkGrupo, Grupo group) throws WebException {
        int i = usuarios.size();
        int j;
        Usuario user;
        ArrayList<Grupo> userGrupo;
        for(j=0 ; j<i; j++){
            user = (Usuario)usuarios.get(j);
            
            //enviar email!
            userGrupo =user.getGrupo();
            userGrupo.add(group);
            user.setGrupo(userGrupo);
            this.persistenciaUsario.salvar(user);
        }
        
    }
    
    /**
     * Esse evento trata da exclusão de um participamente  do grupo
     */
    public void excluirParticipante(ArrayList<Object> usuarios,Grupo g)  throws WebException
    {
        for (Object object : usuarios) 
        {
          Usuario aux = (Usuario) object;
           /**8*remove o grupo da lista de grupos do usario*/
          ArrayList<Grupo> grupos = aux.getGrupo();
          boolean sucesso = grupos.remove(g);
           if(sucesso  == true)
           {
               aux.setGrupo(grupos);
               this.persistenciaUsario.salvar(aux);
           }
        }
    }
}
