
import java.util.Scanner;

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
    
    public static void main(String[] args) {
       Scanner sInput= new Scanner(System.in);
        System.out.println("Introduce un número:");
        int Num = sInput.nextInt();
        
        for (int i = Num; i >= 1; i--) {
               System.out.print(i + " - ");
        }
        System.out.println("");
        forFalso(Num);
         forFalso2(Num, 1);
    }
    public static void forFalso(int Num){
        System.out.print(Num + " - ");  
        if(Num>1)
        forFalso(Num - 1);
                                   
        }
        public static void forFalso2(int iVal, int inc){

         System.out.println(inc + " - ");  
         if(inc < iVal)
         forFalso(iVal - 1);
        }
        
}
    
    

