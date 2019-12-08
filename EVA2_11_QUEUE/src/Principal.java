
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lista miLista = new Lista();
     miLista.Agregar(new Nodo(100));
     miLista.Agregar(new Nodo(200));
     miLista.Agregar(new Nodo(300));
     miLista.Agregar(new Nodo(400));
     miLista.print();
        System.out.println("CIMA DE LA PILA" + miLista.Quitar());
       
         try {
             System.out.println("CIMA DE LA PILA" + miLista.Leer());
         } catch (Exception ex) {
             Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
         }
         miLista.print();
        }
    }
    

