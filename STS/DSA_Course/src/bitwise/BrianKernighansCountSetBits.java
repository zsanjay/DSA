package bitwise;

public class BrianKernighansCountSetBits {

	public static void main(String[] args) {
		
		
	int count = countSetBits(5);

	System.out.println(count);
	
	}

	private static int countSetBits(int n) {
		
		int count =0;
		
		while(n > 0)
		{
		n = (n &(n-1));
		count++;
		}
		
		
		return count;
	}

}
