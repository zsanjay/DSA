package queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxOfKSubArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		maxOfAll(arr , n , k);
		
		

	}

	
	public static void maxOfAll(int arr[] , int n ,int k)
	{

        Deque<Integer> deque = new LinkedList<>();
        
        
        for(int i=0; i<k; i++)
        {
        	
        	while(!deque.isEmpty() && arr[deque.peekLast()] <= arr[i])
        	deque.removeLast();
        	
        	deque.addLast(i);
        	
        }
        
        
        
        for(int i=k; i<n; i++)
        {
        	
        	System.out.print(arr[deque.peekFirst()]+" ");
        	
        	while(!deque.isEmpty() && deque.peekFirst() <= i - k)
            	deque.removeFirst();
        	
        	while(!deque.isEmpty() && arr[deque.peekLast()] <= arr[i])
            	deque.removeLast();
        	
        	
        	deque.addLast(i);
        	
        }
        
        System.out.print(arr[deque.peekFirst()]+" ");
        
		
	}
}
