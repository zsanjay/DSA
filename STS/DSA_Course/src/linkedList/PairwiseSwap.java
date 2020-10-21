package linkedList;

public class PairwiseSwap {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		for(int i = 1; i <= 7; i++)
			list.add(i);
		
		Node head = pairwise_swap(list.head);
		
		while(head != null)
		{
			System.out.print(head.data+ " ");
			head = head.next;
		}

	}
	
	 public static Node pairwise_swap(Node node)
	    {
	        Node first = node;
	        
	        while(first != null && first.next != null)
	        {
	        	
	        	int a = first.next.data;
	            first.next.data = first.data;
	            first.data = a;
	            
	            first = first.next.next;
	            
	        }
	        
	        return node;
	    }

}
