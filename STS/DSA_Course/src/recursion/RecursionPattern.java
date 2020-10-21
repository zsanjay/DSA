package recursion;

public class RecursionPattern {

	public static void main(String[] args) {
		
		
		printPattern(16,5);

	}

	private static void printPattern(int n,int m) {
		
		System.out.print(n+" ");
		
		if(n <= 0)
		return;
		
		
		printPattern(n-m,m);
		
		System.out.print(n+" ");
		
	}

}
