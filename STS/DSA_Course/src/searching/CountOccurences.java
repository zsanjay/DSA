package searching;

public class CountOccurences {

	public static void main(String[] args) {
		
		int arr[] = {2,3,3,3,3,5};
		
		int x = 3;
		
		int leftIndex = countOccurencesLeft(arr, 0, arr.length-1, x );
		
		int rightIndex = countOccurencesRight(arr, 0, arr.length-1, x ,arr.length);
		
		System.out.println((rightIndex - leftIndex) + 1);

	}

	public static int countOccurencesLeft(int[] arr, int low, int high, int x) {
		
		if(low > high)
			return -1;
		
		int mid = low + (high - low)/2;
		
		if(arr[mid] == x && (mid == 0 || arr[mid-1] != x))
			return mid;
		
		
		if(arr[mid] >= x)
			return countOccurencesLeft(arr, low, mid-1, x);
		else
			return countOccurencesLeft(arr, mid+1, high, x);
	}
	
	public static int countOccurencesRight(int[] arr, int low, int high, int x, int n) {
		
		if(low > high)
			return -1;
		
		int mid = low + (high - low)/2;
		
		if(arr[mid] == x && (mid == (n-1) || arr[mid+1] != x))
			return mid;
		
		
		if(arr[mid] > x)
			return countOccurencesRight(arr, low, mid-1, x ,n);
		else
			return countOccurencesRight(arr, mid+1, high, x ,n);
	}

}
