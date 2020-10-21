package linkedList;

public class LinkedList {
	
	Node head = null;
	
	public void add(int data)
	{
		if(head == null)
			head  = new Node(data);
		else
		{
			Node temp = head;
			
			while(temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = new Node(data);
		}
	}
	
	public int size()
	{
		Node temp = this.head;
		int length = 0;
		
		while(temp != null)
		{
			temp = temp.next;
			length++;
		}
		
		return length;
	}
	
}
