package array;

public class LongestSubarrayOfEvensAndOdds {

	public static void main(String[] args) {
		
		
		int arr[] = {74 ,80, 8, 13, 37, 49, 20, 6};
		
		int res = maxEvenOdd(arr, arr.length);
		
		System.out.println(res);

	}
	
	public static int maxEvenOdd(int arr[], int n) 
	{ 
		int len = 1 , maxLen = 1;
		
		for(int i = 0; i < n-1;i++)
		{
			if((arr[i] + arr[i+1]) % 2 == 1)
				len++;
			else
				len = 1;
			
			if(len > maxLen)
				maxLen = len;
			
			
		}
		
	   return maxLen;
	} 

}
