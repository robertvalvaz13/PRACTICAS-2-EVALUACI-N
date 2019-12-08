/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Valdez Vazquez 18550731
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner imput = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        int num = imput.nextInt();
        if (esPrimIneficiente(num))
            System.out.println("El numero Es primo");
        else 
            System.out.println("El numero No es primo");
    }
    public static boolean esPrimIneficiente(int lim){
        boolean bResu = true;
        for (int i = 2; i < lim; i++) {
            if((lim % i)==0){
                bResu = false;
                break;
            }
           
        }
        return bResu;
    }
    }
    

