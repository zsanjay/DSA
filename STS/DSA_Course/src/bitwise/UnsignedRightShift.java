package bitwise;

public class UnsignedRightShift {

	public static void main(String[] args) {
		
		int x = -2; // 1111...1110
		
		System.out.println(x >>> 1); // 0111.1111   2^31 -1
		System.out.println(x >>> 2); // 00111.1111   2^30 -1
	}

}
