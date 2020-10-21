package array;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class FirstDuplicate {

	public static void main(String[] args) {
		
		
		int arr[] = {2,1,3,5,3,2};
		
		int firstDuplicate = findFirstDuplicateByHashSet(arr , arr.length);
		
		int result = findFirstDuplicateEfficient(arr , arr.length);
		
		System.out.println(firstDuplicate);
		System.out.println(result);
	}

	private static int findFirstDuplicate(int[] arr, int length) {
		
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i : arr)
		{
			if(stack.contains(i))
				return i;
				
			stack.add(i);
		}
		
		
		return -1;
	}
	
	
	private static int findFirstDuplicateByHashSet(int[] arr, int length) {
		
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0 ; i< length;i++)
		{
			if(set.contains(arr[i]))
				return arr[i];
			
			set.add(arr[i]);
		}
		
		
		return -1;
	}
	
	
	public static int findFirstDuplicateEfficient(int arr[] , int  n)
	{
		
		for(int i = 0;i < n;i++)
		{
			 if((arr[i] - 1) > -1)
			{
				int a = arr[arr[i]-1];
				
				if(arr[a-1] < 0)
					return a;
				
				arr[arr[i]-1] = -arr[arr[i]-1];
			}
			
		}
		
		
		
		return -1;
	}

}
