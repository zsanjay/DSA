package recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static void main(String[] args) {
		
		
		List<String> list = powerSet("abc");
		
		System.out.println(list);

	}

	private static List<String> powerSet(String string) {
		
		
		List<String> list = new ArrayList<>();
		
		
		getPowerSet(list,string," ",-1);
		
		
		return list;
	}

	private static void getPowerSet(List<String> list, String str, String curr ,int index) {
			
		
		  int n = str.length(); 
		  
	        // base case  
	        if (index == n) 
	        { 
	            return; 
	        } 
	  
	        // First print current subset  
	        list.add(curr);
	  
	        // Try appending remaining characters  
	        // to current subset  
	        for (int i = index + 1; i < n; i++)  
	        { 
	            curr += str.charAt(i); 
	            getPowerSet(list,str, curr,i); 
	  
	            // Once all subsets beginning with  
	            // initial "curr" are printed, remove  
	            // last character to consider a different  
	            // prefix of subsets.  
	            curr = curr.substring(0, curr.length() - 1); 
	        } 
		
		
	}

}
