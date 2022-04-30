/*The number of tens 
Write a program that finds the number of tens in a non-negative integer N (O N s 
1000000). Take a look at the examples: 
If N is 264, the number of tens is 6. 
If N is 4136, the number of tens is 3. 
If N is 101, the number of tens is 0. */

package com.mycompany.myproj_hello_w;
import java.util.Scanner;
public class find_number {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");    
        int n = sc.nextInt();
          
        if(n <= 100){
           int result = n/10;
           System.out.println(result);      
        }        
        if (n >= 100 && n <1000000 ){
           int zecimi = n/10;
           int result = zecimi%10;
            System.out.println(result);
        }
   
    }
    
}
