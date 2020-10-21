package linkedList;

public class SwapKthNode {

	public static void main(String[] args) {
		
		LinkedList link = new LinkedList();
		
		for(int i = 1; i <= 4; i++)
			link.add(i);
		
		
		Node head = swapkthnode(link.head , 4 ,1);
		
		while(head != null)
		{
			System.out.print(head.data+ " ");
			head = head.next;
		}
	}

	
	public static Node swapkthnode(Node head, int num, int K)
	{
			if(num < K)
	        return head;
		
			if(K == 1 || K == num)
			{
				Node end = head;
				int last = num - K;
				
				while(last > 1)
		        {
		            end = end.next;
		            last--;
		        }
				
				Node temp = end.next;
				
				temp.next = head.next;
				
				end.next = head;
				
				head.next = null;
				
				head = temp;
				
			}
			else if( num % 2 != 0 && K ==	(num / 2) + 1)
				return head;
			else
			{
				Node end = head;
				int last = num - K;
				
				while(last > 1)
		        {
		            end = end.next;
		            last--;
		        }
				
				int first = 1;
				Node begin = head;
				
				while(first < num -1)
				{
					begin = begin.next;
					first++;
				}
				
				if(num / 2 > K)
				{
					
					Node temp = end.next;
					
					end.next = begin.next;
					
					
					
				}
				
				
				
			}
			
			
//	        int first = K - 1;
//	        Node begin = head;
//	        
//	        while(first > 1)
//	        {
//	            begin = begin.next;
//	            first--;
//	        }
//	        
//	        Node end = head;
//	        int last = num - (K - 1);
//	        
//	        while(last >= 2)
//	        {
//	            end = end.next;
//	            last--;
//	        }
//	        
//	        Node next = end.next.next;
//	        Node right = end.next;
//	        end.next = begin;
//	        Node left = begin.next;
//	        begin.next = next;
//	        right.next = left;
//	        		
//	        if(next == null)
//	        	head = right;
//	        
	        return head;
	    }
}
