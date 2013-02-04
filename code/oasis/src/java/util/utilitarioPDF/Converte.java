package util.utilitarioPDF;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * < description of this class > 
 * @author Gabriel Quézid
 * @since 29/11/2012
 */
public class Converte {

    public static byte[] convertePDFparaByteArray(File file) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(file);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] buf = new byte[1024];

        try {
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum); //no doubt here is 0
                //Writes len bytes from the specified byte array starting at offset off to this byte array output stream.
                System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
            //Logger.getLogger(genJpeg.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte[] bytes = bos.toByteArray();

        return bytes;
    }

    public static void converteByteArrayparaPDF(byte[] bytes) throws FileNotFoundException, IOException {
        //below is the different part
        File someFile = new File("java2.pdf");
        FileOutputStream fos = new FileOutputStream(someFile);
        fos.write(bytes);
        fos.flush();
        fos.close();
    }

//    public static void main(String[] args) throws FileNotFoundException, IOException {
//        File file = new File("teste.pdf");
//        
//        byte[]  bytes = convertePDFparaByteArray(file);
//
//        converteByteArrayparaPDF(bytes);
//    }
}
