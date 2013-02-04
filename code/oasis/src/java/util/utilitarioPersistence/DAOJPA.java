/*
 * DAOJPA.java
 * 
 * LEDS - Laboratório de Engenharia e Desenvolvimento de Software
 * IFES - Instituto Federal do Espírito Santo - Campus Serra.
 */

package util.utilitarioPersistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import util.utilitarioException.WebException;

public abstract class DAOJPA<T extends ObjetoPersistente> implements DAO<T> {

    //Obtém o factory a partir da unidade de persistência.
    protected static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
    protected static EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public T salvar(T obj) throws WebException {

        try {
            // Inicia uma transação com o banco de dados.
            entityManager.getTransaction().begin();
            // Verifica se o curso ainda não está salvo no banco de dados.
            if (obj.getId() == null) {
                //Salva os dados do curso.
                entityManager.persist(obj);
            } else {
                //Atualiza os dados do curso.
                obj = entityManager.merge(obj);
            }
            // Finaliza a transação.
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            obj = null;
            System.err.println("Erro ao obter " + e);
            throw new WebException("Erro ao obter " + e);
        }
        return obj;
    }

    @Override
    public void excluir(T obj) throws WebException {
        try {
            // Inicia uma transação com o banco de dados.
            entityManager.getTransaction().begin();
            // Remove o curso da base de dados.
            entityManager.remove(obj);
            // Finaliza a transação.
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Erro ao excluir " + e);
            throw new WebException("Erro ao excluir " + e);
        }
    }

    //TODO tentar resolver a passagem do .class
    @Override
    public List<T> obter(Class<T> classe) throws WebException {
        List<T> lista = null;
        try {
            Query query = entityManager.createQuery("SELECT t FROM " + classe.getSimpleName() + " t");
            lista = query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao obter " + e);
            throw new WebException("Erro ao obter " + e);
        }
        return lista;
    }

    public Object obterPorId(Class<T> classe, long id) throws WebException {
        Object obj = null;
        try {
            Query query = entityManager.createQuery("SELECT t FROM " + classe.getSimpleName() + " t where id = " + id);
            obj = query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao obter " + e);
            throw new WebException("Erro ao obter " + e);
        }
        return obj;
    }
}
