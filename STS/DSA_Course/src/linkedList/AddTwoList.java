package linkedList;

public class AddTwoList {

	public static void main(String[] args) {
		
		LinkedList listA = new LinkedList();
		LinkedList listB = new LinkedList();
		
		for(int i=4; i <= 5;i++)
		listA.add(i);
		
		for(int i=3; i <= 5;i++)
		listB.add(i);
		
		
	Node head = addTwoLists(listA.head , listB.head);
	
	while(head != null)
	{
		System.out.print(head.data+" ");
		head = head.next;
	}
		

	}

	
	public static Node addTwoLists(Node first, Node second) {
		
		
		int carry = 0;
		
		Node head = null;
		
		while(first != null || second != null)
		{
			int a=0,b=0;
			
			if(first != null)
			{
				a = first.data;
				first = first.next;
			}
			
			if(second != null)
			{
				b = second.data;
				second = second.next;
			}
			
			int sum = a+b;
			
			sum = sum + carry;
			
			if(sum >= 10)
				carry = 1;
			else 
				carry = 0;
			
			if(head == null)
			{
				head = new Node(sum % 10);
			}
			else
			{
				Node temp = head;
				
				while(temp.next != null)
				{
					temp = temp.next;
				}
				
				temp.next = new Node(sum % 10);
			}
			
		}
		
		if(carry == 1)
		{

			Node temp = head;
			
			while(temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = new Node(1);
		
		}
		
		
		return head;
	}
}
