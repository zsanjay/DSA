package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximunIndex {

	public static void main(String[] args) {
		
		
		int arr[] = {34,8 ,10 ,3 ,2 ,80 ,30, 33, 1};
		
		int max = findMaximumIndex2(arr,arr.length);
		
		System.out.println(max);

	}

	public static int findMaximumIndex(int[] arr, int n) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i : arr)
			list.add(i);
		
		Arrays.sort(arr);
		
		int indicies[] = new int[n];
		
		for(int i =0;i < n;i++)
		indicies[i] = list.indexOf(arr[i]);
			
		int res = Integer.MIN_VALUE , maxIndex = indicies[n-1];
		
		for(int j = n-2;j > -1;j-- )
		{
			if(maxIndex - indicies[j] > res)
			res = maxIndex - indicies[j];
			
			maxIndex = Math.max(maxIndex,indicies[j]);
			
		}
		
		return res;
	}

	
	public static int findMaximumIndex2(int[] arr , int n)
	{
		int maxDiff; 
        int i, j; 
  
        int RMax[] = new int[n]; 
        int LMin[] = new int[n]; 
  
        /* Construct LMin[] such that LMin[i] stores the minimum value 
           from (arr[0], arr[1], ... arr[i]) */
        LMin[0] = arr[0]; 
        System.out.print(arr[0]+" ");
        for (i = 1; i < n; ++i) 
        {
            LMin[i] = min(arr[i], LMin[i - 1]); 
            System.out.print(LMin[i] + " ");
        }
        
        System.out.println();
  
        /* Construct RMax[] such that RMax[j] stores the maximum value 
           from (arr[j], arr[j+1], ..arr[n-1]) */
        RMax[n - 1] = arr[n - 1]; 
        for (j = n - 2; j >= 0; --j) 
            RMax[j] = max(arr[j], RMax[j + 1]); 
        
        
        for(int k : RMax)
            System.out.print(k + " ");
  
        /* Traverse both arrays from left to right to find optimum j - i 
           This process is similar to merge() of MergeSort */
        i = 0; j = 0; maxDiff = 0; 
        while (j < n && i < n)  
        { 
            if (LMin[i] <= RMax[j])  
            { 
                maxDiff = max(maxDiff, j - i); 
                j = j + 1; 
            }  
            else 
                i = i + 1; 
        } 
  
        return maxDiff; 
	}
	
	public static int min(int a , int b)
	{
		return a < b ? a : b;
	}
	
	public static int max(int a , int b)
	{
		return a > b ? a : b;
	}
}
