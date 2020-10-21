package interview;

public class MethodHiding {

	public static void main(String[] args) {
		
		A a = null;
		
		a.print();
		
	}

}

class A
{
	public static void print()
	{
		System.out.println("class A");
	}
}

class B extends A
{
	public static void print()
	{
		System.out.println("class B");
	}
}