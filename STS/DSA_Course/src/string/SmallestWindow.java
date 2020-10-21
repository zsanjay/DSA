package string;

public class SmallestWindow {

	static final int no_of_chars = 256; 
	
	public static void main(String[] args) {
		
		System.out.println(findSubString("evcorexgrtxuqzckuhrykdvtndpaynlphnprygrcgetlmpehvfprgohuxfdqqftyfnobzvnqhhlwmzfydwlxwtgrrmobnkdkweljexlkupydkwfpqjhjgifshrxdxxwzxatjtpkwymnfulvbojshogdjtdgznglkouoahkberfcqwysknktkghwoacbpxaubqddoiykapyqiaqezgnqhacabhgvvpwvxxgfhdrmevbjnmeqrcawumooacazxqtgezwitocfyhlarshrqsngflctvverpemvevjrcjdmsnrwqujuiihiqmjwhuxktjvsthmvofzmbgrfecinxktjphgnygkzbehbbuzwnuqkxqbcrdycbrqmfoxapsqosslgiufmdowmmxivfevuhxdpwmnldigrnmoxyvqndtryaamvvhqmugczfrayeuhxkhyjkwzwnyfmzdcbtgstszjuknmjykwkmytrijflyybevzhyjqfngejtakoqsjusvmzmekdedxsmaasuntulkwsrjxbddfztnkmuoimagdonzkqlvrbjqtnwrj" , "coxqgkybvsucwnhgesscmotgykojfzx"));
		System.out.println(smallestWindow("timetopractice" , "toc"));
		
	}

	public static String smallestWindow (String s, String pat){
		
		
		
		if(s.length() < pat.length())
			return "-1";
		
		
		int L = 0;
		int R = 0;
		
		String minWindow = "";
		String ch = "";
		int count = 0;
		
		while( L < s.length() && R < s.length())
		{
			String temp = s.substring(L, R+1);
			
			if(temp.length() >= pat.length())
			{
				for(int j=0; j < pat.length(); j++)
				{
					ch += pat.charAt(j);
					
					int index = temp.indexOf(ch);
					
					if(index > -1)
					{
					temp = temp.replaceFirst(ch, "");
					count++;
					}
					
					ch = "";
					
				}
				
			}
			
			if(count == pat.length())
			{
				temp = s.substring(L, R+1);
				
				if(minWindow == "" || minWindow.length() > temp.length())
				minWindow = temp;
				
				L++;
			}
			else
				R++;
			
			count = 0;
			
		}
		
		if(minWindow.equals(""))
			return "-1";
		
		return minWindow;
	}
	
	public static String findSubString(String str, String pat) 
		{ 
			int len1 = str.length(); 
			int len2 = pat.length(); 
		
	
			if (len1 < len2) 
			{ 
				System.out.println("No such window exists"); 
				return ""; 
			} 
		
			int hash_pat[] = new int[no_of_chars]; 
			int hash_str[] = new int[no_of_chars]; 
		
			for (int i = 0; i < len2; i++) 
				hash_pat[pat.charAt(i)]++; 
		
			int start = 0, start_index = -1, min_len = Integer.MAX_VALUE; 
		
			
			int count = 0; 
			for (int j = 0; j < len1 ; j++) 
			{ 
			
				hash_str[str.charAt(j)]++; 
		
				
				if (hash_pat[str.charAt(j)] != 0 && 
					hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)] ) 
					count++; 
		
				
				if (count == len2) 
				{ 
						
					while ( hash_str[str.charAt(start)] > hash_pat[str.charAt(start)] 
						|| hash_pat[str.charAt(start)] == 0) 
					{ 
		
						if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]) 
							hash_str[str.charAt(start)]--; 
						start++; 
					} 
		
					
					int len_window = j - start + 1; 
					if (min_len > len_window) 
					{ 
						min_len = len_window; 
						start_index = start; 
					} 
				} 
			} 
		
			
			if (start_index == -1) 
			{ 
			System.out.println("No such window exists"); 
			return ""; 
			} 
		
		
			return str.substring(start_index, start_index + min_len); 
		} 
		
	 


}


