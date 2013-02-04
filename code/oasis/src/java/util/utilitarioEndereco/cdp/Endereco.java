/*
 * Endereco.java
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
public class Endereco  extends ObjetoPersistente{
    private String logradouro;
    private Long cep;
    private Integer numero;
    private String Complemento;
    private Bairro bairro;

    /**
     * Obtém complemento de Endereco
     * @return 
     */
    public String getComplemento() {
        return Complemento;
    }

    /**
     * Altera o valor do complemento em Endereco
     * @param Complemento 
     */
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    /**
     * Obtém cep de Endereco
     * @return 
     */
    public Long getCep() {
        return cep;
    }

    /**
     * Altera o valor do cep em Endereco
     * @param cep 
     */
    public void setCep(Long cep) {
        this.cep = cep;
    }

    /**
     * Obtém logradouro de Endereco
     * @return 
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Alterar o valor de logradouro em Endereco
     * @param logradouro 
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * Obtém numero de Endereco
     * @return 
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * Altera o valor de numero em Endereco
     * @param numero 
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    /**
     * Obtém bairro de Endereco
     * @return 
     */
    @ManyToOne(cascade= CascadeType.PERSIST)
    @JoinColumn(nullable= true)
    public Bairro getBairro() {
        return bairro;
    }

    /**
     * Altera o valor do bairro em Endereco
     * @param bairro 
     */
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
}
