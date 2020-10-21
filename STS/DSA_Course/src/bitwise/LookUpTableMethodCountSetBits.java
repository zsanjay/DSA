package bitwise;

public class LookUpTableMethodCountSetBits {

	public static void main(String[] args) {
		
		int table[] = new int[256];
		
		initialize(table);
		
		
		int count = countSetBits(table , 15);
		
		System.out.println(count);

	}

	private static int countSetBits(int[] table, int n) {
		
		int count = table[n & 0xff];
		
		System.out.println( 0xff);
		
		
		n = n >> 8;
		
		count  += table[n & 0xff];
		
		n = n >> 8;
		
		count  += table[n & 0xff];
		
		n = n >> 8;
		
		count  += table[n & 0xff];
		
		return count;
	}

	private static void initialize(int[] table) {
		
		table[0] = 0;
		
		for(int i = 1 ;i < table.length ;i++)
			table[i] = (i & 1) + table[i/2];
			
		
	}

}
