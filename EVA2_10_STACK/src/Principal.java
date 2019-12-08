
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Roberto Valdez Vazquez 18550731
 */
public class Principal {
    
    public static void main(String[] args) {
     Pila miPila = new Pila();
     miPila.push(new Nodo(100));
     miPila.push(new Nodo(200));
     miPila.push(new Nodo(300));
     miPila.push(new Nodo(400));
     miPila.print();
        System.out.println("CIMA DE LA PILA" + miPila.peek());
       
         try {
             System.out.println("CIMA DE LA PILA" + miPila.pop());
         } catch (Exception ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
         }
         miPila.print();
        }
}
    

