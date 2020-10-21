package recursion;

public class RecursivePower {

	public static void main(String[] args) {
		
		
		long p = findPower(12 , 21);
		
		System.out.println(p);

	}

	private static long findPower(int i, int j) {
		
		if(j <= 1)
			return i;
		
		
		return (i* findPower(i, j-1))%1000000007;
	}

}
