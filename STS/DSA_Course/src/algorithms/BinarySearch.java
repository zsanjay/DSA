package algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		int arr[] = {1,3,5,6,7,8,10};
		
		int key = 6;
		
		int  index = binarySearch(arr,key,0 ,arr.length-1);
		
		System.out.println(key +" is present at "+index);
				
	}

	private static int binarySearch(int[] arr, int key, int low, int high) {
		
		if(low > high)
			return -1;
		
		int mid = low + (high - low) / 2;
		
		if(arr[mid] == key)
			return mid;
		
		if(arr[mid] > key)
			return	binarySearch(arr , key ,low ,mid -1);
		else
			return	binarySearch(arr , key ,mid + 1 ,high);
			
	}

}
