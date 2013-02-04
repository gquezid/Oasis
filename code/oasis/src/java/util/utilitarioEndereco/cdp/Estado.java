/*
 * Estado.java
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
public class Estado extends ObjetoPersistente {

    private String sigla;
    private String nome;
    private Pais pais;

    /**
     * Obtém nome em Estado
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o valor do nome em Estado
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém pais em Estado
     *
     * @return
     */
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    public Pais getPais() {
        return pais;
    }

    /**
     * Altera o valor do respectivo pais vinculado ao estado em Estado
     *
     * @param pais
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     * Obtém sigla que representa o estado em Estado
     *
     * @return
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Altera a sigla que representa o estado em Estado
     *
     * @param sigla
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return nome;
    }
}
