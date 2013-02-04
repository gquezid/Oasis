package oasis.controleinterno.cdp;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.*;
import util.utilitarioPersistence.ObjetoPersistente;

/**
 * < description of this class > 
 * @author Gabriel Quézid
 * @since 23/10/2012
 */
@Entity
public class Usuario extends ObjetoPersistente {
    private String email;
    private String nome;
    private String senha;
    private ArrayList<Grupo> grupo;
    
    
    public static String gerarHashCode(String s) {
        //define o tipo de hash a ser gerado
        MessageDigest hash = null;
        try {
            hash = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        //passa os bytes da senha
        hash.update(s.getBytes());
        //transforma o hash em bytes gerado para hexadecimal
        String hashCode = byte2StringHexa(hash.digest());
        hash.reset();

        return hashCode;
    }

    private static String byte2StringHexa(byte[] bytes) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            int parteAlta = ((bytes[i] >> 4) & 0xf) << 4;
            int parteBaixa = bytes[i] & 0xf;
            if (parteAlta == 0) {
                s.append('0');
            }
            s.append(Integer.toHexString(parteAlta | parteBaixa));
        }
        return s.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setSenhaCriptografar(String senha) {
        this.senha = gerarHashCode(senha);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(nullable = true)
    public ArrayList<Grupo> getGrupo() {
        return grupo;
    }

    public void setGrupo(ArrayList<Grupo> grupo) {
        this.grupo = grupo;
    }
    
}