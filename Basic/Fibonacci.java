public class Fibonacci
{
	public static void main(String args[])
	{
		/*
			Fibonacci Ex:
			0 1 1 2 3 5 8 13
		*/
		int num=9;
		System.out.println("fibonacci nom" + num );
		int num1=0,num2=1,num3;
		System.out.print(num1 +" "+ num2);
		for(int i = 3; i<= num; i++){
			num3 = num1 + num2;
			System.out.print(" "+num3 );
			num1 = num2;
			num2 = num3;
		}
		System.out.println();
	}
}