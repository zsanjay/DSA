package linkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveLoop {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		int arr[] = {62 ,20, 37, 80, 14, 14, 69, 71 ,56, 47};
		
		for(int i = 0; i < arr.length; i++)
			list.add(arr[i]);
		
		Node end = list.head;
		
		while(end.next != null)
		{
			end = end.next;
		}
		
		Node n = list.head;
		int len = 2;
		
		while(len > 0)
		{
			n = n.next;
			len--;
		}
		
		end.next = n;
		
		removeTheLoop(list.head);
		
		while(list.head != null)
		{
			System.out.print(list.head.data +" ");
			list.head = list.head.next;
		}
	

	}
	
    public static void removeTheLoop(Node head)
   {
    	Node hare = head;
      
    	Set<Node> set = new HashSet<>();
    	
    	while(hare != null)
    	{
    		if(set.contains(hare.next))
    			hare.next = null;
    		
    		set.add(hare);
    		
    		hare = hare.next;
    		
    	}
    	
    	
  }

}
