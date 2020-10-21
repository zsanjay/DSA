package array;

import java.util.Arrays;

public class KadanesAlgo {

	public static void main(String[] args) {
		
		int arr[] = {-1,-2,-3,-4};
		
		int a = maxSubarraySum(arr, arr.length);
		
		System.out.println(a);

	}

	public static int maxSubarraySum(int arr[], int n){
        
		int sum = 0,maxSum = 0;
		
		for(int i = 0;i < n;i++)
		{
			sum += arr[i];
			
			if(sum < 0)
				sum = 0;
			
			if(sum > maxSum)
				maxSum = sum;
		}
		
		if(maxSum == 0)
		return	Arrays.stream(arr).max().getAsInt();
		
        return maxSum;
        
    }
}
