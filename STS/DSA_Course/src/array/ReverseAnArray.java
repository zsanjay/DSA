package array;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		
		
		int arr[] = new int[5];
		
		for(int i = 1;i<=arr.length;i++)
			arr[i-1] = i;
		
		arr = reverse(arr,0,arr.length-1);
		
		for(int a:arr)
			System.out.print(a+" ");
	}

	public static int[] reverse(int[] arr,int i,int j) {
		
		
		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		
		return arr;
	}

}
