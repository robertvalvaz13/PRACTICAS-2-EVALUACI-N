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
        int[]datos= new int[20];
       /* llenar(datos);
        imprimir(datos);
        selectionSort(datos);
        imprimir(datos);
        quickSort(datos);
        */
       llenar(datos);
       imprimir(datos);
       quickSort(datos);
       imprimir(datos);
    }
    

public static void llenar(int[]arreglo){
    for (int i = 0; i < arreglo.length; i++) {
        arreglo[i]=(int)(Math.random()*100);
    }
}
public static void imprimir(int[]arreglo){
    for (int i = 0; i < arreglo.length; i++) {
        System.out.print("[" + arreglo[i] + "]");
    }
        System.out.println("");
    }
public static void selectionSort(int[]arreglo){
    //HACE MÁS COMPARACIONES Y MENOS INTERCAMBIOS
    for (int i = 0; i < arreglo.length ; i++) {
        int iMin= i;
        for (int j = i+1; j < arreglo.length; j++) {
            if(arreglo[j]<arreglo[iMin])
                iMin=j;
            
          
        }
        //SWAP
        int iTemp = arreglo[i];
        arreglo[i]=arreglo[iMin];
        arreglo[iMin]= iTemp;
               
    }
}
public static void insectionSort(int[]arreglo){
    //HACE MÁS INTERCAMBIOS Y MENOS COMPARACIONES
    for (int i = 1; i < arreglo.length; i++) {
        int iTemp= arreglo[i];
        for (int insP = i; insP >0; insP--) {
            int iPrev= insP- 1;
            if(arreglo[iPrev]> iTemp)
            //SWAP    
            arreglo[insP] = arreglo[iPrev];
            
        }
    }
}
public static void quickSort(int[]arreglo){
quickSortRec(arreglo,0 ,arreglo.length-1);
}
private static void quickSortRec(int[] arreglo, int ini, int fin){
    if((ini<fin)&&(fin<arreglo.length)){
    int piv= ini;
    int too_big= ini+1;
    int too_small=fin;
    int iTemp;
    while(too_big<too_small){
        
    
    while((too_big < fin)&&(arreglo[too_big]< arreglo[piv])){
    too_big++;
    
     while((too_small > ini + 1)&&(arreglo[too_small]> arreglo[piv])){
    too_small--;
       
    if(too_big>too_small){
    iTemp= arreglo[too_big];
       arreglo[too_big]=arreglo[too_small];
        arreglo[too_small]=iTemp;    
    }
     } 
    //SWAP AL PIVOTE
    iTemp= arreglo[piv];
    arreglo[piv]=arreglo[too_small];
    arreglo[too_small]=iTemp;
    
    quickSortRec(arreglo,ini,piv-1);//IZQ
    quickSortRec(arreglo,piv+1,fin);//DER
    
     }
}
            
}
}
}




