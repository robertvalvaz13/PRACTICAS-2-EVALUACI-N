/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Nodo {
     private int num;
    private Nodo next;
    private Nodo previo;
    public Nodo(){
        this.next = null;
        this.previo = null;
    }
    public Nodo(int val){
        this.num = val;
        this.next = null;
        this.previo = null;
    }
    
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }  

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
}

