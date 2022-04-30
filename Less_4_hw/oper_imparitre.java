/*
2.How many nuts each squirrel will get (medium)
N squirrels found K nuts and decided to divide them equally. Determine how many
nuts each squirrel will get. So there are two positive numbers N and K, each of them is
not greater than 10000.
*/
package com.mycompany.myproj_hello_w;
import java.util.Scanner;
/**
 *
 * @author Mihai Rotari
 */
public class oper_imparitre {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Write numbers of squirrels: ");
        int n = sc.nextInt();
        System.out.print("Write numbers of nuts: ");
        int k = sc.nextInt();
        int result = k/n;
        
        System.out.println(result + "  nuts of each squirrels!");
        
    } 
}
