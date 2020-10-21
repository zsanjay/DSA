package bitwise;

public class RightShiftOperator {

	public static void main(String[] args) {
		
		
		int x = 33; // 00..100000
		
		System.out.println(x >> 1); // 00..10000
		System.out.println(x >> 2); // 00..1000
		
		
		x = -2; //1111...110
		
		System.out.println(x >> 1); //111111.111
		
		System.out.println(x >> 2); //111111...1111

	}

}
