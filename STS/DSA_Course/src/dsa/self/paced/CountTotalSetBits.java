package dsa.self.paced;

public class CountTotalSetBits {

	public static void main(String[] args) {
		
	int result = countTotalSetBits(4);
	
	System.out.println(result);

	}

	private static int countTotalSetBits(int n) {
		
		int count =0;
		
		for(int i=1;i<=n;i++)
		{
			int k = 0;
			int j = i;
			while(j > 0)
			{
			j = (j &(j-1));
			k++;
			}
			
			count+=k;
		}
		
		
		return count;
	}

}
