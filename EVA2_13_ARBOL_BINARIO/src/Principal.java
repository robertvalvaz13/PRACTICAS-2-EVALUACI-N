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
        // TODO code application logic here
        Arbol MiArbol = new Arbol();
        MiArbol.agregarNodo(new Nodo(13));
        MiArbol.agregarNodo(new Nodo(10));
        MiArbol.agregarNodo(new Nodo(18));
        MiArbol.agregarNodo(new Nodo(2));
        MiArbol.agregarNodo(new Nodo(11));
        MiArbol.agregarNodo(new Nodo(17));
        MiArbol.agregarNodo(new Nodo(20));
        MiArbol.imprimePostOrder();
    }
    
}
