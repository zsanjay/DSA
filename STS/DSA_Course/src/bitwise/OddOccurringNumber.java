package bitwise;

public class OddOccurringNumber {

	public static void main(String[] args) {
		
		
		int arr[] = {4,3,4,4,4,5,5,3,3};
		
		int result = findOddOccurringNumber(arr,arr.length);
		
		System.out.println(result);
	}

	private static int findOddOccurringNumber(int[] arr, int length) {
		
		int number = 0;
		
		for(int i = 0;i<length;i++)
			number = number ^  arr[i]; 
		
		return number; 
	}

}
