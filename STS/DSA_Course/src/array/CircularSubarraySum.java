package array;

import java.util.Arrays;

public class CircularSubarraySum {

	public static void main(String[] args) {
		
		int arr[] = {10 ,-3, -4, 7, 6, 5 ,-4, -1};
		
		int sum = kadane(arr , arr.length);
		
		int sumR = reverseKadane(arr ,arr.length);
		
		System.out.println(Math.max(sum, sumR));

	}

	public static int reverseKadane(int[] arr, int num) {
		
		int rsum[] = new int[num];
		int sum[] = new int[num];
		
		int maxv,ans=Integer.MIN_VALUE;
		
		rsum[num-1]=arr[num-1];
		
		for (int i = num-2; i >= 0; i--)
		rsum[i]=rsum[i+1]+arr[i];
		
		sum[0]=arr[0];
		
		for (int i = 1; i < num; ++i)
		sum[i]=sum[i-1]+arr[i];
		
		maxv=sum[0];
		
		for (int i = 1,j=0; i < num; ++i,j++)
		{
		maxv=Math.max(maxv,sum[j]);
		ans=Math.max(ans,maxv+rsum[i]);
		}
		return ans;
	}
	
	public static int kadane(int[] arr, int n) {
		
		int sum =0, maxSum = -1;
		
		for(int i = 0;i < n; i++)
		{
			sum += arr[i];
			
			maxSum = Math.max(maxSum, sum);
			
			if(sum < 0)
				sum = 0;
		}
		
		return maxSum;
	}
	
}
