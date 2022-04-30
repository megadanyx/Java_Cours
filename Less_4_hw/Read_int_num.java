package com.mycompany.myproj_hello_w;


/* 1.Reading integer numbers (medium)
Write a program that reads four integer numbers from one line and prints them each
in a new line. In the input line numbers are separated by one or more spaces.
package com.mycompany.myproj_hello_w; */
    
import java.util.Scanner;
/**
 *
 * @author Mihai Rotari
 */
public class Read_int_num {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("write 4 numbers in one line use space : ");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int num_3 = sc.nextInt();
        int num_4 = sc.nextInt();
        
        System.out.print("\n");
        System.out.println(num_1 +"\n");
        System.out.println(num_2 +"\n");
        System.out.println(num_3 +"\n");
        System.out.println(num_4 +"\n");
        
        
        
        
        
    }
    
    
}
