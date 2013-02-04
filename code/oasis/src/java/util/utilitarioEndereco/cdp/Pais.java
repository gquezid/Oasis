/*
 * Pais.java
 * 
 * LEDS - Laboratório de Engenharia e Desenvolvimento de Software
 * IFES - Instituto Federal do Espírito Santo - Campus Serra.
 */

package util.utilitarioEndereco.cdp;

import javax.persistence.Entity;
import util.utilitarioPersistence.ObjetoPersistente;

@Entity
public class Pais extends ObjetoPersistente {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
