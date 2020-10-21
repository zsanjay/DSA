package linkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		
		LinkedList list = new LinkedList();
		
		for(int i = 1; i <= 5; i++)
			list.add(i);
		
		
		Node head = reverse(list.head);
		
		while(head != null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
		

	}

	private static Node reverse(Node head) {
		
		Node current = head;
		
		Node prev = null;
		
		while(current != null)
		{
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		
		return head;
	}

}
