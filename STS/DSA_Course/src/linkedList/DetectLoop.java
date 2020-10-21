package linkedList;

public class DetectLoop {

	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		for(int i = 1; i <= 5; i++)
			list.add(i);
		
		Node temp = list.head;
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = list.head;
		
		System.out.println(detectLoop(list.head));
		
	}
	
    public static boolean detectLoop(Node head) {
        
        Node hare = head, turtle = head;
        
        while(hare != null && hare.next != null)
        {
            hare = hare.next.next;
            turtle = turtle.next;
            
            if(hare == turtle)
            return true;
        }
        
        return false;
    }


}
