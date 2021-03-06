package bitwise;

public class CountSetBits {

	
	public static void main(String[] args) {
		
		int n = 5;
		
		int count = countSetBits(n);
		
		System.out.println(count);
		
	}

	private static int countSetBits(int n) {
		
		int count = 0;
		
		// in bitwise
		while(n > 0)
		{
			if((n & 1) == 1)
				count++;
			
			n = n >> 1;
		}
		
		// in mathematical way same as above
		/*
		 * while(n > 0) { if(n%2 != 0) count++;
		 * 
		 * n = n/2; }
		 */ 
		
		return count;
	}
	
	
	int count_one (int n)
    {
		
		int count = 0;
		
        while( n > 0)
        {
        n = n&(n-1);
           count++;
        }
        return count;
}
}
