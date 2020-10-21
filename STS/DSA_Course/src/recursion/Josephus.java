package recursion;

public class Josephus {

	public static void main(String[] args) {
			
		int survivor = josephus(8,2);
		
		System.out.println(survivor);
		

	}

	private static int josephus(int n, int k) {
		
		
		if(n == 1 )
			return 1;
		else
			return (josephus(n - 1, k) + k-1) % n + 1;
		
	}

}
