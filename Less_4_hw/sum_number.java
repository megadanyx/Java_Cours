/*
3.The sum of digits (medium)
Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.
*/

package com.mycompany.myproj_hello_w;
import java.util.Scanner;
/**
 *
 * @author Mihai Rotari
 */
public class sum_number {
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter one number 3-digit: ");
            int n = sc.nextInt();
            // calculam restu la zecimi 674 ---> 4
            int zecimi = n % 10;
            int num_1 = zecimi;
            n -=zecimi;
            n = n /10;
            int num_2 = n % 10; 
            int num_3 = n / 10;
            
            int result = num_1 + num_2 + num_3;
            
            System.out.println("Suma este : "+ result); 
             
             
         }
    
}
