package string;

public class ModifyString {

	public static void main(String[] args) {
		
		
		String str = "aabbbbbbbccddd";
		
		long count = modifyString(str);
		
		System.out.println(count);

	}

	private static long modifyString(String a) {
		
		if(a.length() < 3)
			return 0;
		
		char c = a.charAt(0);
		int count = 1;
		long m = 0;
		
		for(int i=1; i < a.length(); i++)
		{
			char ch = a.charAt(i);
			
			if(ch == c)
				count++;
			else
			{
				c = ch;
				count = 1;
			}
			
			if(count >= 3)
			{
				
				while(count > 1)
				{
					count = count -2;
					m++;
				}
				
			}
			
		}
		
		return m;
	}

}
