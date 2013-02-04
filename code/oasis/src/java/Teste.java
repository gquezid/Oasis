
import java.util.ArrayList;
import oasis.controleinterno.cgt.AplPrincipal;

/**
 * < description of this class > 
 * @author Gabriel Quézid
 * @since 18/12/2012
 */
public class Teste {
    public static void main(String[] args){
        ArrayList<Object> list = new ArrayList<>();
        
        list.add("user@mail.com");
        list.add("user");
        list.add("abc123");
        
        AplPrincipal.getInstance().incluirUsuario(list);
    }
    
}
