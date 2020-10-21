package algorithms;

public class QuickSort {
	
	
	public static void main(String[] args) {
		
		
		int arr[] = {7,2,1,6,8,5,3,4};
		
		sort(arr , 0 , arr.length-1);
		
		for(int i : arr)
			System.out.print(i+" ");
	}

	private static void sort(int[] arr, int start, int end) {

		if(start < end)
		{
			
			int partitionIndex = partition(arr , start , end);
			
			sort(arr , start , partitionIndex-1);
			
			sort(arr , partitionIndex+1 , end);
			
		}
		
		
	}

	private static int partition(int[] arr, int start, int end) {

		
		int pivot = arr[end];
		
		int pivotIndex = start;
		
		for(int j = start; j < end; j++)
		{
			if(arr[j] <= pivot)
			{
				swap(arr , pivotIndex , j);
				pivotIndex++;
			}
			
		}
		
		swap(arr , pivotIndex, end );
		
		return pivotIndex;
	}

	private static void swap(int[] arr, int pivotIndex, int j) {
		
		int temp = arr[pivotIndex];
		
		arr[pivotIndex] = arr[j];
		
		arr[j] = temp;
		
	}

}
