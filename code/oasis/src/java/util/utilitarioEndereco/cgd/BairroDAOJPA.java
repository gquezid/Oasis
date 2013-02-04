/*
 * BairroDAOJPA.java
 * 
 * LEDS - Laboratório de Engenharia e Desenvolvimento de Software
 * IFES - Instituto Federal do Espírito Santo - Campus Serra.
 */
package util.utilitarioEndereco.cgd;

import java.util.List;
import javax.persistence.Query;
import util.utilitarioEndereco.cdp.Bairro;
import util.utilitarioEndereco.cdp.Municipio;
import util.utilitarioPersistence.DAOJPA;

public class BairroDAOJPA extends DAOJPA<Bairro> implements BairroDAO {

    public List<Bairro> obter(Municipio m) {
        Query query = entityManager.createQuery("Select pE from Bairro pE where pE.municipio.id = ?1 order by pE.nome ASC");
        query.setParameter(1, m.getId());
        return query.getResultList();
    }
}
