package algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {2, 1, 5,4,3,6,9,8};
		
		sort(arr, arr.length);
		
		for(int i : arr)
			System.out.print(i+" ");

	}

	private static void sort(int[] arr, int n) {
		
		boolean swapped;
		
		for(int i=0; i < n-1;i++)
		{
			swapped = false;
			
			for(int j = 0; j < n-i-1 ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			if(!swapped)
				break;
		}
		
	}
	

}
