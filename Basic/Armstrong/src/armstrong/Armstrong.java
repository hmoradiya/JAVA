package armstrong;

import java.util.Scanner;

public class Armstrong 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter Number");
        int a = sc.nextInt();
        
        int temp = a;
      while(a>0)
      {
          int x = a%10;
          int b = x*x*x;
          sum = sum + b;
          a=a/10;
      }
      if(temp==sum)
      {
          System.out.println("Number is Armstrong");
      }
      else
      {
        System.out.println("Number is not-Armstrong");
      }
    }
    
}
