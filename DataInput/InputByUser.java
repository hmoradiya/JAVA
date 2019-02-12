import java.util.Scanner;

public class InputByUser{
	public static void main(String args[]){
		/*
			1. Scanner class import
			2. Object
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.print("Enter your mobail num: ");
		long num = sc.nextLong();
		
		System.out.print("You are male(ture/false): ");
		boolean male = sc.nextBoolean();
		
		System.out.println("\n\n ==>  Profile <== ");
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Mobile number = "+num);
		System.out.println("Male = "+male);
	}
}