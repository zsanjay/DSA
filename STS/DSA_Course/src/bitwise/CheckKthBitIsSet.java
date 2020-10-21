package bitwise;

public class CheckKthBitIsSet {

	public static void main(String[] args) {
		
		// Left Shift
		checkKthBitIsSet(8,4);
		
		checkWithRightShift(13,3);

	}


	private static void checkWithRightShift(int n, int k) {
		
		if(((n >> (k-1)) & 1 ) == 1) // shift the bit to last and check with 1 that is 000000.000001 
			System.out.println(k+"th bit is set");
		else
			System.out.println(k+"th bit is not set");
			
	}


	private static void checkKthBitIsSet(int n, int k) { 
		
		if((n & (1 << (k -1)))!=0)
			System.out.println(k+"th bit is set");
		else
			System.out.println(k+"th bit is not set");
			
		
	}

}
