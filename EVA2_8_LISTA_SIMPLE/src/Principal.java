
/**
 *
 * @author Roberto Valdez Vazquez 18550731
 */
public class Principal {
  
    public static void main(String[] args) {
    Lista MiLista = new Lista();
    MiLista.add(new Nodo(4));
    MiLista.add(new Nodo(400));
    MiLista.add(new Nodo(40));
    MiLista.add(new Nodo(45));
    MiLista.add(new Nodo(47));
    MiLista.addBegin(new Nodo(99999));
    boolean vacia = MiLista.isEmpty();
    if(vacia)
            System.out.println("LISTA VACÍA");
    else
            System.out.println("LISTA CON NODOS");
           MiLista.print();
   /* int[] millon = new int[1000000];
        for (int i = 0; i < millon.length; i++) {
            millon[i] = (int)(Math.random()*1000);
            
        }
    */
        for (int i = 0; i < 1000000; i++) {
            MiLista.add(new Nodo((int)Math.random()*1000));
        }
        System.out.println("Números de Nodo:" + MiLista.size());
    }
   
}
