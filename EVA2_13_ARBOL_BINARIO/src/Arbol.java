/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Arbol {
    private Nodo root;
    
    public Arbol(){
        root = null;
    }
    public void agregarNodo(Nodo nuevo){
    agregarNodoRec(root,nuevo);
    }
    private void agregarNodoRec(Nodo actual, Nodo nuevo){
        if(root==null){
            root = nuevo;
        }else{
            if(nuevo.getNum()< actual.getNum()){//MAYR ---> DERECHA
                if(actual.getDer()==null){
                    actual.setDer(nuevo);
                } else{
                    agregarNodoRec(actual.getDer(),nuevo);
                }   
            }else if(nuevo.getNum()< actual.getNum()){//MENOR ---> IZQUIERDA
                if(actual.getIzq()==null){
                    actual.setIzq(nuevo);
                    }    
                else
                    agregarNodoRec(actual.getIzq(),nuevo);
                 
            } else {
                   System.out.println("UPS! YA EXISTE EL VALOR");
            }
        }
   }
    public void imprimePostOrder(){
    postOrder(root);
}
    private void postOrder(Nodo actual){
        if(actual !=null){                    
      //LEER IZQ  
      postOrder(actual.getIzq());
      //LEER DER 
       postOrder(actual.getDer());
      //IMPRIMIR
        System.out.print(actual.getNum() + " - ");
        }
    }
        }

  
    
    


