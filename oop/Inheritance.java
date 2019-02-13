class Inheritsance {
	public static void main(String args[]) {
		B b = new B();
		System.out.println(b.a);
	}
}

class A{
	int a = 101;
}

class B extends A {

}