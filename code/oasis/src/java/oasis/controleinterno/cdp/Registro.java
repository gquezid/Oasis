package oasis.controleinterno.cdp;

import javax.persistence.*;
import util.utilitarioPersistence.ObjetoPersistente;

/**
 * < description of this class > 
 * @author Gabriel Quézid
 * @since 07/12/2012
 */
@Entity
public class Registro extends ObjetoPersistente {
    private Integer gols;
    private Usuario usuario;
    private Pelada pelada;
    private boolean statusConvite;
    private StatusRegistro statusRegistro;

    public Integer getGols() {
        return gols;
    }

    public void setGols(Integer gols) {
        this.gols = gols;
    }

    @Enumerated(EnumType.STRING)
    public StatusRegistro getStatusRegistro() {
        return statusRegistro;
    }

    public void setStatusRegistro(StatusRegistro statusRegistro) {
        this.statusRegistro = statusRegistro;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    public Pelada getPelada() {
        return pelada;
    }

    public void setPelada(Pelada pelada) {
        this.pelada = pelada;
    }

    public boolean getStatusConvite() {
        return statusConvite;
    }

    public void setStatusConvite(boolean statusConvite) {
        this.statusConvite = statusConvite;
    }
    
    
}
