package algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {2, 1, 5,4,3,6,9,8};
		
		sort(arr, arr.length);
		
		for(int i : arr)
			System.out.print(i+" ");

	}

	public static void sort(int[] arr, int n) {
		
		for(int i = 0; i < n; i++)
		{
			int min = i;
			
			for(int j = i+1;j < arr.length; j++)
			{
				if(arr[j] < arr[min])
				min  = j;
			}
			
			swap(arr , i ,min);
			
		}
		
	}


	private static void swap(int[] arr, int i, int minIndex) {
		
		
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;
		
	}

}
