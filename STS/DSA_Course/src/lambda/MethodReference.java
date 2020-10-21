package lambda;

public class MethodReference {

	public static void main(String[] args) {
		
		TestInterface t = () -> System.out.println("saySomething called");
		
		t.print();
		
		
		TestInterface test = MethodReference::saySomething;
		
		test.print();
		

	}
	
	public static void saySomething()
	{
		System.out.println("saySomething called");
	}

}


