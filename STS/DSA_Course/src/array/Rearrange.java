package array;

public class Rearrange {

	public static void main(String[] args) {
		
		int arr[] = {4 ,0 ,2 ,1 ,3};
		
		rearrange(arr , arr.length);
		
		for(int a : arr)
			System.out.print(a+" ");

	}

	private static void rearrange(int[] arr, int n) {
		
		
		for(int i = 0;i < n;i++)
		{
			int a = arr[i];
			
			int b = arr[a];
			
			arr[i] = n*(b%n) + a;
					
		}
		
		for(int j=0;j < n;j++)
			arr[j] = arr[j] /n;
		
		
	}

}
