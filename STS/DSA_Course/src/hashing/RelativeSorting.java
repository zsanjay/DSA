package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RelativeSorting {

	public static void main (String[] args) throws Exception{
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<Integer,Integer> map = new TreeMap<>();
		
		    
		    String a[] = {"9" ,"9" ,"9", "9", "1", "1" ,"1", "1" , "2", "2", "2","2","3", "4", "4","4","3", "9","8" ,"10"};
		    String b[] = {"8","2","1","3"};
		    int arr[] = new int[a.length];
		    
		    for(int i=0; i <a.length; i++)
		    {
		    	Integer num = Integer.valueOf(a[i]);
		    	
		    	arr[i] = num;
		    	
		    if(map.containsKey(num))
		    map.put(num , map.get(num)+1);
		    else
		    map.put(num , 1);
		    }
		    
		    
		    for(String s : b)
		    {
		    	Integer num = Integer.valueOf(s);
		    	
		        if(map.containsKey(num))
		        {
		            int count =  map.get(num);
		            while(count > 0)
		            {
		                System.out.print(num+" ");
		                count--;
		            }
		            
		            map.remove(num);
		        }
		    }
		    
		    Arrays.sort(arr);
		    
		    for(int key : arr)
		    {
		    	if(map.containsKey(key))
		    		System.out.print(key+" ");
		    }
		    
		    
		    System.out.println();
		    
	}
	
	
}
