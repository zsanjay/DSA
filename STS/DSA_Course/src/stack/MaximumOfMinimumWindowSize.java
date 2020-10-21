package stack;

import java.util.Stack;

public class MaximumOfMinimumWindowSize {

	public static void main(String[] args) {
		
		
		int arr[] = {10 ,20, 30, 50, 10, 70, 30};
		
		printMaxOfMin(arr , arr.length);
	}

	
	public static void printMaxOfMin(int[] arr, int n) {
        
		
		Stack<Integer> s = new Stack<>();
		
		int left[] = new int[n+1];
		int right[] = new int[n+1];
		
		int ans[] = new int[n+1];
		

		for(int i=0; i < n;i++)
		{
			left[i] = -1;
			right[i] = n;
		}
		
		
		 for (int i=0; i<n; i++) 
	        { 
	            while (!s.empty() && arr[s.peek()] >= arr[i]) 
	                s.pop(); 
	       
	            if (!s.empty()) 
	                left[i] = s.peek(); 
	       
	            s.push(i); 
	        } 
	       
	            s.clear(); 
	       
	        
	        for (int i = n-1 ; i>=0 ; i-- ) 
	        { 
	            while (!s.empty() && arr[s.peek()] >= arr[i]) 
	                s.pop(); 
	       
	            if(!s.empty()) 
	                right[i] = s.peek(); 
	       
	            s.push(i); 
	        }
		
		 for (int i=0; i < n; i++)
		    {
		        int len = right[i] - left[i] - 1;
		        ans[len] = Math.max(ans[len], arr[i]);
		    }
		
		 for (int i=n-1; i>=1; i--)
		        ans[i] = Math.max(ans[i], ans[i+1]);
		
		 for(int a : ans)
		       System.out.print(a+" ");
	}

}
