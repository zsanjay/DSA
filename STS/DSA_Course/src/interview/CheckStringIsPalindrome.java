package interview;

public class CheckStringIsPalindrome {

	public static void main(String[] args) {
		
		
		String input = "racecar";
		
		
		boolean check = checkPalindrome(input);
		
		System.out.println(check);
		
		
		check = isPalindromeString(input);
		
		System.out.println(check);

	}

	private static boolean checkPalindrome(String input) {
		
		
		if(input == null || input.equals(""))
			return false;
		
		
		int i = 0, j = input.length()-1;
		
		while(i < j)
		{
			char a = input.charAt(i);
			char b = input.charAt(j);
			
			if(a != b)
				return false;
			
			i++;
			j--;
		}
		
		
		return true;
	}
	
	
	private static boolean isPalindromeString(String str) {
	    if (str == null)
	        return false;
	    int length = str.length();
	    System.out.println(length / 2);
	    for (int i = 0; i < length / 2; i++) {
	 
	        if (str.charAt(i) != str.charAt(length - i - 1))
	            return false;
	    }
	    return true;
	}


}
