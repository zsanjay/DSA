package stack;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumHistogramArea {

	public static void main(String[] args) {
		
		long arr[] = {6 ,2 ,5 ,4 ,5 ,1 ,6};
		long b[] = {7 ,2 ,8 ,9 ,1 ,3 ,6 ,5};
		
		
	long maxArea = 	maxArea(b, b.length);
	
	System.out.println(maxArea);

	}

	private static long maxArea(long[] arr, long n) {
		
	Deque<Integer> indexes = new LinkedList<>();
	
	int top = 0;
	long area = 0;
	long maxArea = 0;
	int i;
	
		for(i = 0; i < n;)
		{
			
			if(indexes.isEmpty() || (!indexes.isEmpty() && arr[indexes.peekFirst()] <= arr[i]))
				indexes.push(i++);
			else 
			{
				top = indexes.pollFirst();
						
				if(indexes.isEmpty())
				area = arr[top] * i;
				else 
				area = arr[top] * (i - indexes.peekFirst() - 1);
							
				if(maxArea < area)
				maxArea = area;
					
					
				}
				
				
			}
		
		while(!indexes.isEmpty())
		{
			top = indexes.pollFirst();
			
			if(indexes.isEmpty())
			area = arr[top] * i;
			else 
			area = arr[top] * (i - indexes.peekFirst() - 1);
						
			if(maxArea < area)
			maxArea = area;
		}
		
		return maxArea;
	}

}
