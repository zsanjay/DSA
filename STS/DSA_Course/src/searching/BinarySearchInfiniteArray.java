package searching;

public class BinarySearchInfiniteArray {

	public static void main(String[] args) {
		
		
		int arr[] = new int[1000];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = i*2;
		
		int x = 26;
		
		int index = findInInfiniteArr(arr,0,arr.length-1,x);
		
		System.out.println(index);
	}

	private static int findInInfiniteArr(int[] arr, int low, int high, int x) {

		if(arr[low] == x)
			return 0;
		
		low++;
		while(arr[low] < x)
		low = low*2;
		
		if(arr[low] == x)
		return low;
		
		return binarySearch(arr, low/2, low, x);
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
