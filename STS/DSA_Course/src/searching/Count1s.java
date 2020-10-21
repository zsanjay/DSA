package searching;

public class Count1s {

	public static void main(String[] args) {
		
		int arr[] = {0,0,1,1,1,1,1,1};
		
		int x = 1;
		
		int leftIndex = leftMostIndex(arr , 0 , arr.length-1 , x);
		
		System.out.println(((arr.length-1) - leftIndex)+1);

	}
	
	public static int leftMostIndex(int[] arr, int low, int high, int x) {
		
		if(low > high)
			return -1;
		
		int mid = low + (high - low)/2;
		
		if(arr[mid] == x && (mid == 0 || arr[mid-1] != x))
			return mid;
		
		
		if(arr[mid] >= x)
			return leftMostIndex(arr, low, mid-1, x);
		else
			return leftMostIndex(arr, mid+1, high, x);
	}

}
