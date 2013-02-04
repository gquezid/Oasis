/*
 * DAOFactory.java
 * 
 * LEDS - Laboratório de Engenharia e Desenvolvimento de Software
 * IFES - Instituto Federal do Espírito Santo - Campus Serra.
 */

package util.utilitarioPersistence;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class DAOFactory {

    public static String TIPO_JDBC = "JDBC";
    public static String TIPO_JPA = "JPA";
    public static String TIPO_FABRICA = TIPO_JPA;
    //TODO: resolver passagem do tipo e Exceptions

    public static void setTIPO_FABRICA(String TIPO_FABRICA) {
        DAOFactory.TIPO_FABRICA = TIPO_FABRICA;
    }
    
    public static DAO obterDAO(Class classe) {
        String nome = classe.getName();
        
        nome = nome.replace("cdp", "cgd");
        nome = nome + "DAO" + TIPO_FABRICA;
        System.out.println(nome);
        try {
            return (DAO) Class.forName(nome).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(DAOFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
