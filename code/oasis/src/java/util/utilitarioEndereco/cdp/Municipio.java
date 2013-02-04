/*
 * Municipio.java
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
public class Municipio extends ObjetoPersistente {

    private Estado estado;
    private String nome;

    /**
     * Obtém o estado do Municipio
     *
     * @return
     */
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    public Estado getEstado() {
        return estado;
    }

    /**
     * Altera o valor do estado em Municipio
     *
     * @param estado
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * Obtém o nome do Municipio
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o valor do nome de Municipio
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
