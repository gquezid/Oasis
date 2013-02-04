/*
 * DAO.java
 * 
 * LEDS - Laboratório de Engenharia e Desenvolvimento de Software
 * IFES - Instituto Federal do Espírito Santo - Campus Serra.
 */

package util.utilitarioPersistence;

import java.util.List;

public interface DAO<T> {

    public T salvar(T obj) throws Exception;

    public void excluir(T obj) throws Exception;

    public List<T> obter(Class<T> classe) throws Exception;

}
