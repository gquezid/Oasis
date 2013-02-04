package oasis.controleinterno.cdp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import util.utilitarioPersistence.ObjetoPersistente;

/**
 * < description of this class > 
 * @author Gabriel Quézid
 * @since 07/12/2012
 */
@Entity
public class Grupo extends ObjetoPersistente {
    private String nome;
    private String descricao;
    private Usuario moderador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = true)
    public Usuario getModerador() {
        return moderador;
    }

    public void setModerador(Usuario moderador) {
        this.moderador = moderador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
