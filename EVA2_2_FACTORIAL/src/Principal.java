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
    
        System.out.println(calculafactorial(7));
    }
      public static int calculafactorial(int iVal){
          System.out.println("Inicio " + iVal);
          if(iVal ==0)
             
          return 1;
          
          else
          return iVal * calculafactorial(iVal - 1);        
                  
          }
         
          } 
      


    

