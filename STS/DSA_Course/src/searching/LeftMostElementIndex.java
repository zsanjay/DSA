package searching;

public class LeftMostElementIndex {

	public static void main(String[] args) {
		
		
		int arr[] = {2,3,3,3,3};
		
		int x = 3;
		
		int index = searchIndex(arr,0,arr.length-1,x);
		
		System.out.println(index);

	}

	private static int searchIndex(int[] arr, int low, int high, int x) {
		
		
		if(low > high)
			return -1;
		
		int mid = low + (high - low)/2;
		
		if(arr[mid] == x && (mid == 0 || arr[mid-1] != x))
			return mid;
			
		
		if(arr[mid] >= x)
			return searchIndex(arr, low, mid-1, x);
		else
			return searchIndex(arr, mid+1, high, x);
	}

}
