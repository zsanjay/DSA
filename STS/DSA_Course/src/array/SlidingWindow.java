package array;

public class SlidingWindow {

	public static void main(String[] args) {
		
		
		int arr[] = {1,8,30,-5,20,7};
		
		int  k = 3;
		
		int sum = findMaxSum(arr, k ,arr.length);
		
		System.out.println(sum);

	}

	private static int findMaxSum(int[] arr, int k, int n) {
		
		int sum = 0, maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i< k;i++)
		{
			sum += arr[i]; 
			maxSum = sum;
		}
		int j=0;
		for(int i = k; i < n;i++)
		{
			sum -= arr[j++];
			sum += arr[i];
			
			maxSum = Math.max(sum, maxSum);
		}
		
		return maxSum;
	}

}
