package bitwise;

public class BitwiseNot {

	public static void main(String[] args) {
		
		int x = 1; //0000....0001
		
		System.out.println(~x); //111....1110  
		
		// output is 2^32 -1  represents all 1's  and 2^3 -1  is 111
		// 2^32 -1 -1 that is -2  
		// -x Representation (2 ^ 32 - x)
		
			x = 5;
			
			System.out.println(~x);
	}

}
