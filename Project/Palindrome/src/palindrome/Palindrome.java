
package palindrome;

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args)
    {
        int sum=0;
        System.out.println("Enter Number");
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
       int temp =a;
       
       while(a>0)
       {
          int x = a % 10;
          sum=(sum*10)+x;
          a = a/10;
       }
       
       if(temp==sum)
       {
           System.out.println("Is Palindrome");
       }
       else
       {
           System.out.println("Is Not-Palindrome");
       }
    }
   
}
