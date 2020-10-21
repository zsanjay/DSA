package hashing;

import java.util.HashSet;
import java.util.Set;

public class HashingForPair {

	public static void main(String[] args) {
		
		System.out.println(sumExists(new int[] {1 ,2 ,3 ,4  ,5,6,7,8,9,10}, 10, 14));
		System.out.println(sumExists(new int[] {1 ,2 ,6 ,8 ,9 ,5}, 6, 5));
		
	}
    
    public static int sumExists(int arr[], int sizeOfArray, int sum)
    {
        Set<Integer> set = new HashSet<>();
        
       for(int num : arr)
       {
    	   if(set.contains(sum - num))
    	   return 1;
    	   else
    	   set.add(num);   
       }
       
       return 0;
       
    }

}
