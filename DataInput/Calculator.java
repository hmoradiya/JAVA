import java.util.Scanner;

public class Calculator
{
	public static void main (String args[])
	{
		Scanner val = new Scanner(System.in);
		
		System.out.println("Enter two Value wich you want calculate");
		double a = val.nextDouble();
		double b = val.nextDouble();
		
		double ans;
		
		System.out.println("Select operation from + , - , * , / ");
		
		String c = val.next();
		
		switch(c)
		{
			case "+":
			ans = a + b;
			System.out.println("sum of two nom is: " + ans);
			break;
			
			case "-":
			ans = a - b;
			System.out.println("sub of two nom is: " + ans);
			break;
			
			case "*":
			ans = a * b;
			System.out.println("mul of two nom is: " + ans);
			break;
			
			case "/":
			ans = a / b;
			System.out.println("div of two nom is: " + ans);
			break;
			
			default:
			System.out.println("Invalid operator");
			return;
			
			
		}
	}
}
