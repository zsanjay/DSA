package lambda;

public class Test {

	public static void main(String[] args) {
		
	TestInterface test = () -> System.out.println("Hello World");
	
	test.print();
			
	}
	

}

