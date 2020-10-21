package string;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

	public static void main(String[] args) {
		
		
		String str = "MEHTA";
		
		Set<String> set = new HashSet<>();
		int size = permutation(str , 0 , str.length()-1 , set);
		
		System.out.println(size);

	}

	private static int permutation(String str , int l , int h , Set<String> set) {
		
		
		if(l == h)
		{
			System.out.println(str);
			set.add(str);
			return 0;
		}
			
		
		for(int i = l; i <= h; i++)
		{
			str = swap(str , i , l);
			permutation(str , l+1 , h ,set);
			
		}
		
		return set.size();
	}

	private static String swap(String str, int i, int l) {
		
		
		char ch[] = str.toCharArray();
		
		char temp = ch[i];
		ch[i] = ch[l];
		ch[l] = temp;
		
		return new String(ch);
		
	}

}
