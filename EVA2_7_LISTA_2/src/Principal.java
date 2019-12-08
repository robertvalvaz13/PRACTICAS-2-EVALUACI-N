
/**
 *
 * @author Roberto Valdez Vazquez 18550731
 */
public class Principal {

   
    public static void main(String[] args) {
    Nodo n1, n2, n3;
    n1 = new Nodo (32);
    n2 = new Nodo (17);
    n3 = new Nodo (5);
    
    n1.setSiguiente(n2);
    n2.setSiguiente(n3);
    
    Nodo temp = n1;
    
    
    while(temp != null){
        System.out.print(temp.getValor() + " - ");
        temp = temp.getSiguiente();
        
    }
    
    }
    
}

class Nodo{
private int valor;
private Nodo siguiente; 

public Nodo(){
    this.siguiente = null;
}
public Nodo (int valor){
    this.valor = valor;
    this.siguiente = null;
}

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
 public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
