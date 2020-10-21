package array;

public class LeftRotate {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		for(int i = 1;i<=arr.length;i++)
			arr[i-1] = i;
		
		int d = 2;
		
		arr = leftRotate(arr,arr.length,d);
		
		for(int a:arr)
			System.out.print(a+" ");

	}

	private static int[] leftRotate(int[] arr, int len, int d) {
		
		int newArr[] = new int[d];
		
		
		for(int j =0;j<newArr.length;j++)
			newArr[j]=arr[j];
		
		
		for(int i=d;i<len;i++)
			arr[i-d] =arr[i];
		
		for(int j=0;j<newArr.length;j++)
			arr[len - d+j] =newArr[j];
		
		return arr;
	}
}
