package interview;

public class PermutationOfStringIsPalindrome {

	public static void main(String[] args) {
		
		boolean check = checkPermutationPalindrome("racerac");
		
		System.out.println(check);

	}

	private static boolean checkPermutationPalindrome(String str) {
		
		
		if(str == null || str.equals(""))
			return false;
		
	   char ch[] = new char[128];
	   
	   for(int i=0;i < str.length(); i++)
	   {
		  ch[str.charAt(i)]++;
	   }
		
	   int count = 0;
	   
	   for(int i=0;i<ch.length;i++)
	   {
		  count += ch[i] % 2;
	   }
	   
		return count <= 1;
	}

}
