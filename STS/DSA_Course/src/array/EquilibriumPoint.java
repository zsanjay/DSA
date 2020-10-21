package array;

import java.util.Arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		
		int arr[] = {27,4 ,25, 6, 6 ,1 ,27 ,22 ,19 ,29, 6, 9 ,36 ,24 ,6 ,15, 5};

		int a[] = {4,2,-2};
		
		int res = equilibriumPoint(arr,arr.length);
		
		System.out.println(equilibriumPointNew(a,a.length));
		
		System.out.println(res);
	}

	public static int equilibriumPoint(int[] arr, int n) {
		
		for(int i = 1;i < n;i++)
			arr[i] = arr[i] + arr[i - 1];
		
		for(int a:arr)
			System.out.print(a+" ");
		
		System.out.println();
		
		
		if(arr[n-1] - arr[0] == 0)
			return 1;
		
		int ep = -1;
		
		for(int i=1;i<n;i++)
		{
			if(arr[n -1] - arr[i-1] == arr[i])
			{
				ep = i+1;
				break;
			}
		}
		
		return ep;
	}
	
	
	public static boolean equilibriumPointNew(int[] arr, int n) {
		
		
		int sum =	Arrays.stream(arr).sum();
		
		int leftSum = 0;
		for(int i =0;i < n;i++)
		{
			if(leftSum  == sum - arr[i])
				return true;
			
			leftSum += arr[i];
			sum -= arr[i];
		}
		
		return false;
	}

}
