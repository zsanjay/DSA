package array;

public class LeftRotateByOne {

	public static void main(String[] args) {
		
		
		int arr[] = new int[5];
		
		for(int i = 1;i<=arr.length;i++)
			arr[i-1] = i;
		
		arr = leftRotate(arr,arr.length);
		
		for(int a:arr)
			System.out.print(a+" ");

	}

	private static int[] leftRotate(int[] arr, int len) {
		
		int first = arr[0];
		
		for(int i=1;i<len;i++)
		{
			arr[i-1] =arr[i];
		}
		
		arr[len-1] = first;
		
		return arr;
	}

}
