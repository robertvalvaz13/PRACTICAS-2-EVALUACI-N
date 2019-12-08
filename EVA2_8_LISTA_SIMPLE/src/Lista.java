
/**
 *
 * @author Roberto Valdez Vazquez 18550731
 */
public class Lista {
 private Nodo inicio;
 private Nodo fin;
    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
    //DEVUELVE TRUE SI LA LISTA ESTA VACÍA
   public boolean isEmpty(){
   if(inicio==null)
       return true;
   else
       return false;
   }
   //AGREGAR UN NODO AL FINAL DE LA LISTA
   public void add(Nodo nuevo){
       //PRIMERO VERIFICAR SI LA LISTA ESTA VACÍA
   if(isEmpty()){
       inicio = nuevo;
       fin = nuevo;
   }   
   else {
      Nodo temp = inicio;
      while(temp.getSiguiente()!= null){
      temp  = temp.getSiguiente();
      }
      temp.setSiguiente(nuevo);
       fin.setSiguiente(nuevo);
        fin =nuevo;
   }
   }
   public void addBegin(Nodo nuevo){
    if(isEmpty()){
       inicio = nuevo;
       fin = nuevo;
   }
    else{
        inicio = nuevo;
        nuevo.setSiguiente(inicio);
    }
   }
   //imprimir lista
  public void print(){
        Nodo temp = inicio;   
        while(temp != null){
        System.out.print(temp.getValor() + " - ");
        temp = temp.getSiguiente();
       
        }
       
            
        }
   public int size(){
   int iCont=0;
   Nodo temp=inicio;
   while(temp != null){
       
   temp = temp.getSiguiente();
   iCont++;
   
      
   }
   return iCont;
   }
public void insertAt(int pos, Nodo nuevo){
     //movernos hasta la pos - 1
     //reconectar --> primero nuevo,
     //previo
  Nodo temp = inicio;
  while(pos - 1 != null);
  temp = temp.setSiguiente;
  
  
  }

  
  
  

  
   
   

