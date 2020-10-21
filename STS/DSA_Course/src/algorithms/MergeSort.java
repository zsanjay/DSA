package algorithms;

public class MergeSort {
	
	public static void main(String[] args) {
		
		
		int arr[] = {9,7,8,3,2,1};
		
		sort(arr , 0 , arr.length-1);
		
		for(int i : arr)
			System.out.print(i+" ");
		
	}

	private static void sort(int[] arr, int start, int end) {
		
		
		if(start < end)
		{
			
			int mid = (start + end) / 2;
			
			sort(arr , start , mid );
			sort(arr , mid + 1 , end );
			
			merge(arr , start , mid , end);
			
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		
		
        int n1 = mid - start + 1; 
        int n2 = end - mid; 
	
		int L[] = new int[n1];
		
		int R[] = new int[n2];
		
		
		 for (int i=0; i<n1; ++i) 
	            L[i] = arr[start + i]; 
		 
	     for (int j=0; j<n2; ++j) 
	            R[j] = arr[mid + 1+ j]; 
		
		int i = 0, j = 0 , k = start;
		
		
		while( i < n1 && j < n2)
		{
			
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			
			k++;
			
		}
		
		while(i < n1)
		{
			arr[k] = L[i];
			k++;
			i++;
		}
		
		while(j < n2)
		{
			arr[k] = R[j];
			k++;
			j++;
		}
		
	}

}
