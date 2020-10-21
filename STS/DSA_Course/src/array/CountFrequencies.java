package array;

public class CountFrequencies {

	public static void main(String[] args) {
		
		int arr[] = {2,3,2,3,5};
		
		//printFrequency(arr,arr.length);
		
		printFrequencyOptimize(arr,arr.length);

	}

	public static void printFrequencyOptimize(int[] arr, int n) {
		
	    for(int i = 0;i<n;i++)
	    arr[i] = arr[i]-1;
	    
	    for(int a:arr)
	    	System.out.print(a+" ");
	    
	    System.out.println();
	    
	    for(int j =0;j<n;j++)
	    arr[arr[j]%n] = arr[arr[j]%n] +n;
	    
	    for(int a:arr)
	    	System.out.print(a+" ");
	    
	    
	    System.out.println();
	    
	    for(int k=0;k<n;k++)
	    System.out.print(arr[k]/n+" ");
		
	}

	public static void printFrequency(int[] arr, int n) {
		
		
		int newArr[] = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]-=1; 
		
		
		for(int i=0;i<n;i++)
			newArr[arr[i]]++;
		
		for(int j=0;j<n;j++)
			System.out.println(j+1+" -> "+newArr[j]);
		
	}
	
	


}
