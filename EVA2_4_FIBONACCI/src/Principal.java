/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Valdez Vazquez 1855731
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println(CalcuFibonacci(8));
    }
    public static int CalcuFibonacci (int Pos){
        switch (Pos) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return CalcuFibonacci(Pos - 1) + CalcuFibonacci (Pos -2);
        }
    }
    
}
