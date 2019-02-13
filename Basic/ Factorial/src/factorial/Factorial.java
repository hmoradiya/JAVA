
package factorial;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ans =1; 
        System.out.println("Enter number");
        int a = sc.nextInt();
        
        for(int i=1;i<=a;i++)
        {
           ans = ans * i; 
        }
        System.out.println("Fectorial of " + a + " is :" + ans);
    }
    
}
