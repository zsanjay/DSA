package bitwise;

public class FindMissingNumberFromTheRange {

	public static void main(String[] args) {
		
		
		int arr[] = { 1,5,4,3,2,7,6};
		
		int missingNumber = findMissingNumber(arr, arr.length);
		
		int missingNumber2 = findMissingNumber2(arr, arr.length);
		
		
		System.out.println(missingNumber);
		System.out.println(missingNumber2);

	}

	private static int findMissingNumber2(int[] arr, int n) {
		
		n = n+1;
		
		int sum = (n * (n + 1)) / 2; 
		
		for(int i =0; i< n-1;i++)
			sum = sum - arr[i];
			
		return sum;
	}

	private static int findMissingNumber(int[] arr, int length) {
		
		int a=0,b=0;
		
		for(int i =0; i < length;i++ )
		{
			a = a ^ arr[i];
			b = b ^ i+1;
		}
			
		b = b ^ length + 1;
		
		
		return a ^ b;
	}


}
