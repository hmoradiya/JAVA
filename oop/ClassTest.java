import java.util.*;

public class ClassTest
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);

		Car bmw = new Car();
		Car audi = new Car();

		bmw.name = "BMW";
		bmw.modNub = 101;
		bmw.speed = 120.5;

		audi.name = "AUDI";
		audi.modNub = 155;
		audi.speed = 148.5;

		System.out.println("BMW data");
		System.out.println("name = " + bmw.name);
		System.out.println("Model Number = " + bmw.modNub);
		System.out.println("speed = " + bmw.speed);
	}
}

class Car
{
	String name;
	int modNub;
	double speed;
}