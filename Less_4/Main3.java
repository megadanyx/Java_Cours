
package com.mycompany.main;
import java.util.Scanner;
/**
 *
 * @author Mihai Rotari
 */
public class Main3 {
        public static void main(String[] args) { 
       Scanner sc = new Scanner (System.in);
       
    double x ;
    
    System.out.print("Enter one double number: ");
    x = sc.nextDouble();    
    double result = (x*x*x+x*x+x+1);
    System.out.print("Result: " + result);
       
                                                                                                                                     
    }
}

