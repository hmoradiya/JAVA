public class Cunstructor
{
	public static void main (String args [])
	{
		Student hardik = new Student(1032L, "hardik");
		Student kaushik = new Student(1032L, "kaushik");
		hardik.collage = "ASOCET";

		System.out.println("Name = "+hardik.name+"\nNumber = "+kaushik.number+"\nCollage = "+kaushik.collage );
	}
}

class Student
{
	long number;
	String name;
	static String collage = "SOCET";
	
	Student(long number, String name)
	{
		this.number = number;
		this.name = name;
	}
}