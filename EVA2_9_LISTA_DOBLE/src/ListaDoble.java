/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class ListaDoble {
    private Nodo nodeIni;
    private Nodo nodeFin;
    
    public ListaDoble(){
        this.nodeIni = null;
        this.nodeFin = null;
    }
     public boolean isEmpty(){ //Comprobar si la lista esta vacia
        if(nodeIni == null)
            return true;
        else
            return false;
    }
     public void add(Nodo nuevo){
         if(isEmpty()){
             nodeIni =nuevo;
             nodeFin=nuevo;
         }else{
             nodeFin.setNext(nuevo);
             nuevo.setPrevio(nodeFin);
             nodeFin=nuevo;
         }
     }
    public void print(){
        Nodo temp = nodeIni;
        while(temp != null){
            System.out.print(temp.getNum()+" - ");
            temp = temp.getNext();
        }
        System.out.println("");
    }
    public void printBack(){
        Nodo temp = nodeFin;
        while(temp != null){
            System.out.print(temp.getNum()+" - ");
            temp = temp.getPrevio();
        }
        System.out.println("");
    }
    public int size(){
        int cont = 0;
        Nodo temp = nodeIni;
        while(temp != null){
            cont++;
            temp = temp.getNext();
        }
        return cont;
    }
    public void Clear(){
        nodeFin = null;
        nodeIni = null;
    }
    public int getAt(int posi){
        Nodo temp = nodeIni;
        int cont = 0;
        while(cont < posi){
            temp = temp.getNext();
            cont++;
        }
        return temp.getNum();
    }
}
