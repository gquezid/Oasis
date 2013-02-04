/*
 * BuscaCep.java
 * 
 * LEDS - Laboratório de Engenharia e Desenvolvimento de Software
 * IFES - Instituto Federal do Espírito Santo - Campus Serra.
 */
package util.utilitarioEndereco.cgt;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class BuscaCep {

    public static webservicecep getEndereco(String cep) throws JAXBException, MalformedURLException {

        JAXBContext jc = JAXBContext.newInstance(webservicecep.class);

        Unmarshaller u = jc.createUnmarshaller();
        URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&formato=xml");
        webservicecep wCep = (webservicecep) u.unmarshal(url);

        return wCep;

    }
}