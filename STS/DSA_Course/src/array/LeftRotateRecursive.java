package array;

public class LeftRotateRecursive {

	public static void main(String[] args) {
		
		
		int arr[] = new int[11];
		
		for(int i = 1;i<=arr.length;i++)
			arr[i-1] = i;
		
		int d = 3;
		
		leftRotate(arr,arr.length,d);
		
		for(int a:arr)
			System.out.print(a+" ");

	}

	public static void leftRotate(int[] arr, int length, int d) {
		
		int i = 0;
		
		while(i <=length-d-1)
		{
		reverse(arr, i ,i+d-1);
		i = i+d;
		}
		System.out.println(i);
		reverse(arr,i,length-1);
		
	}
	
public static void reverse(int[] arr,int i,int j) {
		
		
		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
	}


}
