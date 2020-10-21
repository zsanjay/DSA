package array;

public class MajorityElement {

	public static void main(String[] args) {
		
		int arr[] = {20,30,40,50,50,50,50};
		
		int res = majorityElement(arr, arr.length);
		
		System.out.println(res);
		
	}

	private static int majorityElement(int[] arr, int n) {
		
		int res = 0 , count =1;
		
		for(int i=1; i < n;i++) 
		{
			if(arr[res] == arr[i])
				count++;
			else
				count--;
			
			if(count == 0)
			{
				res = i;
				count = 1;
			}
		}
		
		
		count = 0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[res] == arr[i])
				count++;
		}
		
		if(count > n/2)
			return arr[res];
		
		return -1;
	}
	
	

}
