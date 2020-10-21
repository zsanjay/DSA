package interview;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

	public static void main(String[] args) {
		
		
		String input = "ABCD";
		List<String>  list = new ArrayList<>();
		printPermutations(input , 0 ,input.length()-1 ,list);
		
		System.out.println(list.size());
		

	}

	private static void printPermutations(String input, int l, int h ,List<String> list) {
	
		if(l == h)
			list.add(input);
		
		for(int i = l;i <= h;i++)
		{
			input = swap(input , l , i);
			 printPermutations(input, l+1, h,list);
			//input = swap(input, l, i);
			
		}
		
		
	}



	private static String swap(String str , int i , int j)
	{
	
		char[] temp = str.toCharArray();
		
		char c = temp[i];
		temp[i] = temp[j];
		temp[j] = c;
		
		return String.valueOf(temp);
		
	}
	

}