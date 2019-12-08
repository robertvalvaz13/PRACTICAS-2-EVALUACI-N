
/**
 *
 * @author Roberto Valdez Vazquez 18550731
 */
public class Nodo {
    
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