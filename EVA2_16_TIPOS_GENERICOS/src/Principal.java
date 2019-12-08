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
        Nodo<String> nodo = new Nodo<String>();
        nodo.setValor("Hola Mundo Cruel!!");
    }
    
}
class Nodo<T>{
T valor;
Nodo siguiente;
Nodo previo;
public Nodo(){
    this.siguiente= null;
    this.previo= null;   
}

    public Nodo(T valor) {
        this.valor = valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }

}