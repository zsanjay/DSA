package recursion;

import java.util.HashMap;
import java.util.Map;

public class PhoneDigit {

	public static void main(String[] args) {
		
		int arr[] = new int[3];
		
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;
		
		possibleWords(arr,arr.length);

	}

	public static void possibleWords(int[] arr, int length) {
		
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		
		
		printWords(map,arr,"",0,0,0);
		
	}

	public static void printWords(Map<Integer,String> map , int arr[] ,String curr,int i,int j,int k) {
		
		
		if(i == 2)
		return;
		
		String a =	map.get(arr[0]);
		String b = map.get(arr[1]);
		String c = map.get(arr[2]);
		curr+= a.charAt(i);
		curr+= b.charAt(j);
		curr+= c.charAt(k);
		
		
		System.out.print(curr+" ");
		
		curr = "";
		
		if(c.length()-1 == k)
		{
			k = 0;
			j++;
		}
		
		if(b.length() -1 == j)
		{
			j = 0;
			i++;
		}
		
		printWords(map,arr,curr,i , j , k+1);
		
		printWords(map,arr,curr,i , j+1 , k);
		
		
	}

}
