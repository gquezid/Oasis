
/*
 * Mail.java
 * 
 * LEDS - Laboratório de Engenharia e Desenvolvimento de Software
 * IFES - Instituto Federal do Espírito Santo - Campus Serra.
 */
package util.utilitarioMail;

import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class Mail {
    
    public Mail() throws EmailException, MalformedURLException {
        //enviarEmailSimples();
        enviarEmailComAnexo();
        //enviarEmailFormatoHtml();
    }

    /**
     * envia email simples(somente texto)
     *
     * @throws EmailException
     */
    public void enviarEmailSimples() throws EmailException {

        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com"); // o servidor SMTP para envio do e-mail  
        email.addTo("teste@gmail.com", "Gabriel Quézid"); //destinatário  
        email.setFrom("teste2@gmail.com", "Eu"); // remetente  
        email.setSubject("Teste -> Email simples"); // assunto do e-mail  
        email.setMsg("Teste de Email utilizando commons-email"); //conteudo do e-mail  
        email.setAuthentication("USUARIO", "SENHA");
        email.setSmtpPort(465);
        email.setSSL(true);
        email.setTLS(true);
        email.send();
    }

    /**
     * envia email com arquivo anexo
     *
     * @throws EmailException
     */
    public void enviarEmailComAnexo() throws EmailException {

        // cria o anexo 1.  
        EmailAttachment anexo1 = new EmailAttachment();
        anexo1.setPath("certificado/teste.txt"); //caminho do arquivo (RAIZ_PROJETO/teste/teste.txt)  
        anexo1.setDisposition(EmailAttachment.ATTACHMENT);
        anexo1.setDescription("Exemplo de arquivo anexo");
        anexo1.setName("teste.txt");

        // configura o email  
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com"); // o servidor SMTP para envio do e-mail  
        email.addTo("gquezid@gmail.com", "Gabriel Quézid"); //destinatário  
        email.setFrom("teste2@gmail.com", "Eu"); // remetente  
        email.setSubject("Teste -> Email com anexos"); // assunto do e-mail  
        email.setMsg("Teste de Email utilizando commons-email"); //conteudo do e-mail  
        email.setAuthentication("USUARIO", "SENHA");
        email.setSmtpPort(465);
        email.setSSL(true);
        email.setTLS(true);

        // adiciona arquivo(s) anexo(s)  
        email.attach(anexo1);
        
        // envia o email  
        email.send();
    }

    /**
     * Envia email no formato HTML
     *
     * @throws EmailException
     * @throws MalformedURLException
     */
    public void enviarEmailFormatoHtml() throws EmailException, MalformedURLException {

        HtmlEmail email = new HtmlEmail();

        // adiciona uma imagem ao corpo da mensagem e retorna seu id  
        URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
        String cid = email.embed(url, "Apache logo");

        // configura a mensagem para o formato HTML  
        email.setHtmlMsg("<html>Logo do Apache - <img ></html>");

        // configure uma mensagem alternativa caso o servidor não suporte HTML  
        email.setTextMsg("Seu servidor de e-mail não suporta mensagem HTML");

        email.setHostName("smtp.gmail.com"); // o servidor SMTP para envio do e-mail  
        email.addTo("teste@gmail.com", "Gabriel Quézid"); //destinatário  
        email.setFrom("teste2@gmail.com", "Eu"); // remetente  
        email.setSubject("Teste -> Html Email"); // assunto do e-mail  
        email.setMsg("Teste de Email HTML utilizando commons-email"); //conteudo do e-mail  
        email.setAuthentication("Usuario", "SENHA");
        email.setSmtpPort(465);
        email.setSSL(true);
        email.setTLS(true);
        
        // envia email  
        email.send();
    }
    
    /**
     * @param args
     * @throws EmailException
     * @throws MalformedURLException
     */
    public static void main(String[] args) throws EmailException, MalformedURLException {
        Mail mail = new Mail();
    }
    
}