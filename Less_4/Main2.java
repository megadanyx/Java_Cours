
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author Mihai Rotari
 */
public class Main2 {
    public static void main(String[] args) { 
       Scanner sc = new Scanner (System.in);
       
    int num;
    
    System.out.print("Enter one int number: ");
    num = sc.nextInt();     
    int result = ((num +1)* num+2)*num+3;
    System.out.print(result);
       
                                                                                                                                     
    }
}
