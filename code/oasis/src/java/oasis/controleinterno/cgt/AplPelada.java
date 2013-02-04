//package oasis.controleinterno.cgt;
//
//import oasis.controleinterno.cdp.Grupo;
//import oasis.controleinterno.cdp.Pelada;
//import oasis.controleinterno.cdp.StatusPelada;
//import oasis.controleinterno.cdp.Usuario;
//import oasis.controleinterno.cgd.PeladaDAOJPA;
//import oasis.controleinterno.cgd.RegistroDAOJPA;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;
//import util.utilitarioException.WebException;
//
///**
// * < description of this class > 
// * @author Patrício dos Santos Sante
// * @since 15/12/2012
// */
//public class AplPelada {
//
//    private PeladaDAOJPA persistenciaPelada;
//    private RegistroDAOJPA PesistenciaRegistro;
//    /**
//     * Essa classe implemta o padrão singloton
//     */
//    private static AplPelada instancia = null;
//
//    public static AplPelada getInstancia() {
//        if (AplPelada.instancia == null) {
//            AplPelada.instancia = new AplPelada();
//        }
//        return instancia;
//    }
//
//    private AplPelada() {
//        persistenciaPelada = new PeladaDAOJPA();
//    }
//
//    /**
//     * @see Salva uma pelada no sistema
//     * @param dadosPelada: Os dados para construção do obeto pelada
//     * @throws WebException caso alguma erro durante a criação do objeto ou na
//     * hora de salva Esse metodo supondo que a lista de objetos sera passado na
//     * seguinte ordem Marco,data,Maxuser,Mim usar,Grupo
//     */
//    public void incluirPelada(ArrayList<Object> dadosPelada) throws WebException {
//        Pelada p = new Pelada();
//        Calendar marco = null, data = null;
//        Integer maxuser = null, mimUser = null;
//        Grupo g;
//        /**
//         * * recolhe as informações da lista de paramentro
//         */
//        try {
//            marco = (Calendar) dadosPelada.get(0);
//            data = (Calendar) dadosPelada.get(1);
//            
//            if(marco.compareTo(data) > 0)
//            {
//                throw  new WebException("A data e menor do que o marco");
//            }
//          
//            
//            maxuser = Integer.parseInt(dadosPelada.get(2).toString());
//            mimUser = Integer.parseInt(dadosPelada.get(3).toString());
//            g = (Grupo) dadosPelada.get(4);
//
//        } catch (NullPointerException | ClassCastException e) {
//            throw new WebException("Paramentros  incorretos, erro de conversão de dados: " + e.getMessage());
//        } catch (IndexOutOfBoundsException e) {
//            throw new WebException("Paramentros  Insuficiente para criar uma Pelada");
//        }
//
//        p.setStatusPelada(StatusPelada.AGENDADA);
//        p.setDataMarco(marco);
//        p.setDataPelada(data);
//        p.setMaxUsuario(maxuser);
//        p.setMinUsuario(mimUser);
//
//        persistenciaPelada.salvar(p);
//
//    }
//
//    /**
//     * @see retorna todas as peladas de um deterninado grupo
//     * @param g: grupo que sera buscado sua peladas
//     * @return : As peladas salva no sistema
//     */
//    public List<Pelada> consultaPelada(Grupo g) throws WebException {
//        return this.persistenciaPelada.obter(Pelada.class);
//    }
//
//    /**
//     * @see retorna todas as peladas de um deterninado grupo em um
//     * deterninado dia
//     * @param g: grupo que sera buscado sua peladas
//     * @param c: dia e que aconteceu a pelada
//     * @return : As peladas salva no sistema
//     */
//    public List<Pelada> consultaPelada(Grupo g, Calendar c) throws WebException {
//        throw  new WebException("Funcionalidade não suportado nesse versão");
//    }
//
//    /**
//     * @see retorna todas as peladas do sistema
//     * @return : As peladas salva no sistema
//     */
//    public List<Pelada> consultaPelada() throws WebException {
//        return persistenciaPelada.obter(Pelada.class);
//    }
//
//    /**
//     * @see retorna uma pelada com base na sia chave primaria
//     * @param o: indece da pelada salva no sistema
//     * @return : a pelada salva no sistema correspondente ao parmentro
//     */
//    public Pelada consultaPelada(Object o) throws WebException {
//        Pelada p;
//        try {
//            p = (Pelada)o;
//        } catch (Exception e) {
//              throw  new WebException("Objeto do paramentro não é uma pelada valida");
//        }
//        return (Pelada)this.persistenciaPelada.obterPorId(Pelada.class,p.getId());  
//    }
//
//    /**
//     * @see edita uma pelada ja salva no sistema
//     * @param dadosPelada: informações para atualizar a pelada
//     * @param obeto pelada que sera salva as novas informações
//     */
//    public void editarPelada(ArrayList<Object> dadosPelada, Pelada p) throws WebException {
//        
//       
//        /**
//         * * recolhe as informações da lista de paramentro
//         */
//        try {
//            p.setDataMarco((Calendar) dadosPelada.get(0));
//            p.setDataPelada((Calendar) dadosPelada.get(1));
//            
//            if(p.getDataMarco().compareTo(p.getDataPelada()) > 0)
//            {
//                throw  new WebException("A data e menor do que o marco");
//            }
//            
//            p.setMaxUsuario(Integer.parseInt(dadosPelada.get(2).toString()));
//            p.setMinUsuario(Integer.parseInt(dadosPelada.get(3).toString()));
//            p.setGrupo((Grupo) dadosPelada.get(4));
//            
//            this.persistenciaPelada.salvar(p);
//
//        } catch (NullPointerException | ClassCastException e) {
//            throw new WebException("Paramentros  incorretos, erro de conversão de dados: " + e.getMessage());
//        } catch (IndexOutOfBoundsException e) {
//            throw new WebException("Paramentros  Insuficiente para criar uma Pelada");
//        }
//    }
//
//    /**
//     * @see convidar usarios do grupo para a pelada
//     * @param usuarios lista de usuarios que sera convidado para a pelada
//     * @param link que direciona para a pagina de confirmação da pelada
//     */
//    public void convidarParticipante(List<Object> usarios, String LinkPelada) throws WebException {
//
//    }
//
//    /**
//     * @see convidar usarios do grupo para a pelada
//     * @param usuarios lista de usuarios que sera excluidos da pelada
//     * @param p pelada a gual os usarios serão excluidos
//     */
//    public void excluirParticipante(List<Object> usarios, Pelada p) throws WebException 
//    {
//        throw  new WebException("Funcionalidade não suportado nesse versão");
//        
//
//    }
//}
