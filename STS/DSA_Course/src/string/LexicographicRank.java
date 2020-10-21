package string;

public class LexicographicRank {

	public static void main(String[] args) {
		
		String str = "STRING";
		
		int rank = findLexicographicRank(str);
		
		System.out.println(rank);
		
		
	}

	public static int findLexicographicRank(String str) {
		
		if(str == null || str.equals(""))
			return -1;
		
		int arr[] = new int[str.length()];
		int result = 1;
		int fact = fact(str.length());
		for(int i=0 ; i < str.length();i++)
			arr[i] = str.charAt(i);
		
		
		for(int i=0 ; i < arr.length-1;i++)
		{
			int smallernos = findNumber(str , i);
			
			fact = fact/(arr.length -i);
			
			result += smallernos * fact;
		}
		
		return result;
	}

	private static int findNumber(String str, int index) {
		
		int count = 0;
		
		for(int i = index+1; i < str.length(); i++)
		{
			if(str.charAt(index) > str.charAt(i))
				count++;
		}
		return count;
	}

	private static int fact(int n) {
		
		if(n == 0 || n == 1)
			return 1;
		
		int fact = n;
		for(int i = 2;i < n;i++)
		{
			fact = fact * i;
		}
		
		return fact;
	}

}
