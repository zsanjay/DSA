package array;

import java.util.Arrays;

public class SmallestPositiveMissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {1, 2,3,4,5};
		
		System.out.println(missingNumber(arr,arr.length));

	}
	
	public static int missingNumber(int arr[], int size)
	{

		int m = Arrays.stream(arr).max().getAsInt(); // Storing maximum value 
	        if (m < 1) // In case all values in our array are negative 
	        { 
	            return 1; 
	        } 
	        if (size == 1) { 
	  
	            
	            if (arr[0] == 1) { 
	                return 2; 
	            } 
	            else { 
	                return 1; 
	            } 
	        } 
	        int i = 0; 
	        int[] l = new int[m]; 
	        for (i = 0; i < size; i++) { 
	            if (arr[i] > 0) { 
	                if (l[arr[i] - 1] != 1) 
	                { 
	                    l[arr[i] - 1] = 1; 
	                } 
	            } 
	        } 
	        for (i = 0; i < l.length; i++) 
	        { 
	            if (l[i] == 0) { 
	                return i + 1; 
	            } 
	        } 
	        System.out.println(i);
	        return i + 2;   
	        }

}
