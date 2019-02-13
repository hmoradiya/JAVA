public class CommandLine{
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);


		int ans;

		switch(args[1])
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