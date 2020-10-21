package bitwise;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		
		boolean a = checkPowerOfTwo(57);
		
		boolean b = checkPowerOfTwo2(7);
		
		System.out.println(a);
		System.out.println(b);

	}

	private static boolean checkPowerOfTwo2(int n) {
		
		
		return (n!=0) && (n & (n-1)) == 0;
	}

	private static boolean checkPowerOfTwo(int n) {
		
		
	 if(n == 0)
		 return false;
	 
	 while( n != 1)
	 {
		 if((n & 1) == 1)  // n % 2 == 1
			 return false;
		 
		 n = n >> 1; // n = n/2;
	 }
		 
	 
	 return true;
		
	}

}
