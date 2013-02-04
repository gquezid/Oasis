package oasis.controleinterno.cdp;

import java.util.Calendar;
import javax.persistence.*;
import util.utilitarioEndereco.cdp.Endereco;
import util.utilitarioPersistence.ObjetoPersistente;

/**
 * < description of this class > 
 * @author Gabriel Quézid
 * @since 07/12/2012
 */
@Entity
public class Pelada extends ObjetoPersistente {
    private Calendar dataMarco;
    private Calendar dataPelada;
    private Integer maxUsuario;
    private Integer minUsuario;
    private Grupo grupo;
    private Endereco endereco;
    private StatusPelada statusPelada;

    @Temporal(javax.persistence.TemporalType.DATE)
    public Calendar getDataMarco() {
        return dataMarco;
    }

    public void setDataMarco(Calendar dataMarco) {
        this.dataMarco = dataMarco;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Calendar getDataPelada() {
        return dataPelada;
    }

    public void setDataPelada(Calendar dataPelada) {
        this.dataPelada = dataPelada;
    }
    
    public Integer getMaxUsuario() {
        return maxUsuario;
    }

    public void setMaxUsuario(Integer maxUsuario) {
        this.maxUsuario = maxUsuario;
    }

    public Integer getMinUsuario() {
        return minUsuario;
    }

    public void setMinUsuario(Integer minUsuario) {
        this.minUsuario = minUsuario;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco grupo) {
        this.endereco = endereco;
    }
    
    @Enumerated(EnumType.STRING)
    public StatusPelada getStatusPelada() {
        return statusPelada;
    }

    public void setStatusPelada(StatusPelada statusPelada) {
        this.statusPelada = statusPelada;
    }
    
}
