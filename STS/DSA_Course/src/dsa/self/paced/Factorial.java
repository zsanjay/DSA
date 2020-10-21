package dsa.self.paced;

public class Factorial {

	public static void main(String[] args) {
		
		double big =0;
		
		int n = 42;
		for(int i = 1;i<= n;i++)
			big += Math.log10(i);
		
		
		int floor = (int) Math.floor(big) + 1;
		

		System.out.println(floor);

		long l = findFactorial(5);
		
		System.out.println(l);
		
		int d =(int)Math.floor(Math.log10(l)+1);
		
		
		System.out.println(d);	

	}

	private static long findFactorial(int i) {
		
		
		if( i <= 1)
			return 1;
		
		return i * findFactorial(i-1);
	}

}
