package array;

public class MaximumOccuredInteger {

	public static void main(String[] args) {
		
		int L[] = {1,4,3,1 };
		
		int R[] = {15,8,5,4};
		
		int max = 15;
		int n = 4;
		
		
		int result = maximumOccuredInteger(L , R ,max , n);

		System.out.println(result);
	}

	public static int maximumOccuredInteger(int[] l, int[] r, int max, int n) {
		
		int arr[] = new int[max+2];
		
		for(int i=0;i<n;i++)
		{
			arr[l[i]]++;
			
			arr[r[i]+1]--;
		}
		
		
		int prefixSum = 0, m = 0,res= 0;;
		
		for(int j=0;j<arr.length;j++)
		{
			prefixSum += arr[j];
			
			arr[j] = prefixSum;
			
			if(m < arr[j])
			{
				m = arr[j];
				res = j;
			}
		}
		
		return res;
	}

}
