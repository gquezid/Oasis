/*
 * EstadoDAOJPA.java
 * 
 * LEDS - Laboratório de Engenharia e Desenvolvimento de Software
 * IFES - Instituto Federal do Espírito Santo - Campus Serra.
 */
package util.utilitarioEndereco.cgd;

import java.util.List;
import javax.persistence.Query;
import util.utilitarioEndereco.cdp.Estado;
import util.utilitarioEndereco.cdp.Pais;
import util.utilitarioPersistence.DAOJPA;

public class EstadoDAOJPA extends DAOJPA<Estado> implements EstadoDAO {

    public List<Estado> obter(Pais p) {
        Query query = entityManager.createQuery("Select pE from Estado pE where pE.pais.id = ?1 order by pE.nome ASC");
        query.setParameter(1, p.getId());
        return query.getResultList();
    }
}
