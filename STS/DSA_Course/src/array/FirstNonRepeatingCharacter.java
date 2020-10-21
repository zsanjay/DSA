package array;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String str = "aaabccccaaaarrr";
		
		char result = findFirstNonRepeatingCharacter(str);
		System.out.println(result);
	}

	private static char findFirstNonRepeatingCharacter(String str) {
		
		
		int arr[] = new int[256];
		
		for(int i=0 ; i<str.length();i++)
		arr[str.charAt(i)]++;
		
		for(int i =0;i < arr.length;i++)
		{
			if(arr[i] == 1)
				return (char)i;
		}
		
		return (char)-1;
	}

}
