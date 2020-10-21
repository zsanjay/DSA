package bitwise;

public class PowerSetUsingBitwise {

	public static void main(String[] args) {
		
		
		String str = "abcde";
		
		//printPowerSets(str);
		
		printPowerSetOriginal(str);

	}

	private static void printPowerSetOriginal(String str) {
		
		char ch[] = str.toCharArray();
		int n = str.length();
		
		int powSize = (int)Math.pow(2, n);
		
		for(int counter = 0; counter < powSize; counter++)
		{
			for(int j=0;j<n;j++)
			{
				if((counter & (1 << j)) != 0)
					System.out.print(ch[j]);
			}
			System.out.println();
		}
		
		
	}

	private static void printPowerSets(String str) {
		
		
			int n = (int)Math.pow(2, str.length());
			
			String powerSet = "";
			
			for(int i = 0;i< n;i++)
			{
				
				if( (i & 1 )== 1)
					powerSet += 'a';
				
				if( (i & 2 )== 2)
					powerSet += 'b';
				
				
				
				if( (i & 4 )== 4)
					powerSet += 'c';
				
				
				System.out.print(powerSet+",");
				
				
				powerSet = "";
				
			}
		
	}

}
