
package com.mycompany.main;

import java.util.Scanner;


public class Main4 {
    public static void main(String[] args) { 
    
        Scanner sc = new Scanner (System.in);
       
    
        int a ;
        int b ;
        int c ;
        System.out.print("Enter fitst num : ");
        a = sc.nextInt();
        System.out.print("Enter second num: ");
        b = sc.nextInt();    
        System.out.print("Enter three num : ");
        c = sc.nextInt();
        
        boolean rs1 = a + b == 20;
        boolean rs2 = a + c == 20;
        boolean rs3 = b + c == 20;
        boolean result = rs1 || rs2 || rs3;
        
        System.out.println(result);
        
       /* if(result == 20 || result > 20 ){
        System.out.print("Result is TRUE");}
        else {  System.out.print("Result is FALSE");     
            } */ 
    }
    
    
    
}
