package dsa.self.paced;

public class FindFirstBitSetPosition {

	public static void main(String[] args) {
		
		
		int pos = findPosition(19);
		
		int pos2 = findPosition2(8);
		
		
		//System.out.println(pos);
		System.out.println(pos2);

	}

	private static int findPosition2(int n) {
		
		
		if(n == 0)
			return n;
		
		int k =1;
		
		while((n & 1) != 1)
		{
			n = n >> 1;
			k++;
		}
			
		return k;
	}

	private static int findPosition(int n) {
		
		if(n == 0)
			return 0;
		
		n = n ^ (n -1);
		
		int count = 0;
		
		while(n > 0)
		{
			if((n & 1) == 1)
				count++;
			
			n = n >> 1;
		}
		
		
		return count;
	}

}
