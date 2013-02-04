/*
 * SracException.java
 * 
 * LEDS - Laboratório de Engenharia e Desenvolvimento de Software
 * IFES - Instituto Federal do Espírito Santo - Campus Serra.
 */
package util.utilitarioException;

public class WebException extends Exception {

    public WebException() {
    }

    public WebException(String msg) {
        super(msg);
    }
}