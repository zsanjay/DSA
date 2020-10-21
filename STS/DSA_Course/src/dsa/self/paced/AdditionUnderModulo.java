package dsa.self.paced;

public class AdditionUnderModulo {

	public static void main(String[] args) {
		
		
		int M=1000000007;
		
		additionUnderModulo(9223372036854775807l,9223372036854775807l ,M);
		
		

	}

	private static void additionUnderModulo(long a, long b ,int M) {
		
		
		long addition = ((a % M )+ (b % M))%M;
		
		long multiplication = ((a % M )*(b % M))%M;
		
		System.out.println(addition);
		System.out.println(multiplication);
		
	}

}
