package linkedList;

public class DoublyLinkedList {

	Node head = null;
	
	
	public void add(int data) 
	{
		if(head == null)
		{
			head = new Node(data);
		}
		else
		{
			Node temp = head;
			
			while(temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = new Node(data);
			temp.next.prev = temp;
			
		}
		
	}
	
}
