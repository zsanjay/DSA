package searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		int arr[] = {16 ,82 ,58 ,24 ,37 ,62 ,24 ,0 ,36};
		
		int x = 36;
		
		int index = binarySearch(arr ,0 , arr.length-1 ,x);
		
		System.out.println(index);

	}

	private static int binarySearch(int[] arr, int low, int high, int x) {
		
		
		if(low > high)
			return -1;
		
		int mid = low + (high - low)/2;
		
		if(arr[mid] == x)
			return mid;
		
		if(arr[mid] > x)
			return binarySearch(arr, low, mid-1, x);
		else
			return binarySearch(arr, mid+1, high, x);
	}

}
