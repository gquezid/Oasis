/*
 * Bairro.java
 * 
 * LEDS - Laboratório de Engenharia e Desenvolvimento de Software
 * IFES - Instituto Federal do Espírito Santo - Campus Serra.
 */

package util.utilitarioEndereco.cdp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import util.utilitarioPersistence.ObjetoPersistente;

@Entity
public class Bairro extends ObjetoPersistente {

    private Municipio municipio;
    private String nome;

    /**
     * Obtém municipio de Bairro
     *
     * @return
     */
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    public Municipio getMunicipio() {
        return municipio;
    }

    /**
     * Altera o valor de municipio em Bairro
     *
     * @param municipio
     */
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    /**
     * Obtém nome de Bairro
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o valor de nome em Bairro
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
