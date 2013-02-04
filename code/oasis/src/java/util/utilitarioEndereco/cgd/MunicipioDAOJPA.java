/*
 * MunicipioDAOJPA.java
 * 
 * LEDS - Laboratório de Engenharia e Desenvolvimento de Software
 * IFES - Instituto Federal do Espírito Santo - Campus Serra.
 */
package util.utilitarioEndereco.cgd;

import java.util.List;
import javax.persistence.Query;
import util.utilitarioEndereco.cdp.Estado;
import util.utilitarioEndereco.cdp.Municipio;
import util.utilitarioPersistence.DAOJPA;

public class MunicipioDAOJPA extends DAOJPA<Municipio> implements MunicipioDAO {

    public List<Municipio> obter(Estado e) {
        Query query = entityManager.createQuery("Select pE from Municipio pE where pE.estado.id = ?1 order by pE.nome ASC");
        query.setParameter(1, e.getId());
        return query.getResultList();
    }
}
