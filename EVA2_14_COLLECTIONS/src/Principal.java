import java.util.LinkedList;
/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList lListaEnLa = new LinkedList<String>();
        lListaEnLa.add("Hola");
        lListaEnLa.add(" ");
        lListaEnLa.add("Mundo");
        lListaEnLa.add(" ");
        lListaEnLa.add("Cruel");
        lListaEnLa.add(" ");
        lListaEnLa.add("!!!");
        lListaEnLa.addFirst("XXXXX");
        System.out.println(lListaEnLa);
       for (Object string : lListaEnLa) {
           System.out.println(string + " - ");
            
        }
        System.out.println("");     
        System.out.println("Cantidad de elementos " + lListaEnLa.size());  
        lListaEnLa.remove(3);
        System.out.println(lListaEnLa);
        }
    }
    

class Algo{

}
