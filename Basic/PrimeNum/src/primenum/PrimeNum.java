
package primenum;

import java.util.Scanner;


public class PrimeNum {

   
    public static void main(String[] args) {
        System.out.println("Enter Value");
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean ans = false;
        for(int i = 2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                ans = true;
            }
        }
        if(ans) {
            System.out.println("Prime");
        } else {
            System.out.println("NOn-Prime");
        }
        
               }
    
}
