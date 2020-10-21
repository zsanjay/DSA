package array;

public class RearrangeArray {

	public static void main(String[] args) {
		
		int arr[] = {10 ,20 ,30 ,40 ,50 ,60 ,70 ,80 ,90 ,100, 110};
		
		rearrange(arr,arr.length);
		
		for(int a : arr)
			System.out.print(a+" ");

	}

	public static void rearrange(int[] arr, int n) {
		
		
		if(n == 1)
			return;
		
		for(int i=0;i<n;i++)
		{
			if(i%2 == 0)
				rotate(arr,i,n-1);
		}
		
	}

	public static void rotate(int[] arr, int i, int j) {
		
		
		int temp = arr[j];
		
		while(j > i)
		{
			arr[j] = arr[j-1];
			j--;
		}
		
		arr[i] = temp;
	}

}
