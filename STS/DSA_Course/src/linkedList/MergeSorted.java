package linkedList;

public class MergeSorted {

	public static void main(String[] args) {
		
		int a[] = {5 , 10 ,15, 40};
		
		int b[] = {2 , 3, 20};
		
		LinkedList  linkA = new LinkedList();
		LinkedList  linkB = new LinkedList();
		
		for(int i : a)
			linkA.add(i);
		
		for(int i : b)
			linkB.add(i);
		
		Node merge = mergeLinkedList(linkA.head , linkB.head);
		
		while(merge != null)
		{
			System.out.print(merge.data+" ");
			merge = merge.next;
		}

	}

	private static Node mergeLinkedList(Node headA, Node headB) {
		
		if(headA.data < headB.data)
			return merge(headA , headB ,headA);
		else
			return merge(headB , headA , headB);
			
		
	}

	public static Node merge(Node temp, Node head, Node head2) {

		while(temp.next != null && head != null)
		{
			
			if(temp.next.data < head.data)
				temp = temp.next;
			else
			{
				Node next = temp.next;
				temp.next = head;
				head = head.next;
				temp.next.next = next;
			}
		}
		
		while(temp.next!= null)
			temp = temp.next;
		
		temp.next= head;
		
		return head2;
		
	}

}
