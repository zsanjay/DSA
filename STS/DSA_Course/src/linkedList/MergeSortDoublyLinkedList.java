package linkedList;

public class MergeSortDoublyLinkedList {

	public static void main(String[] args) {

		int arr[] = { 5, 3, 7, 9, 1, 4, 10, 8, 6, 2 };

		DoublyLinkedList list = new DoublyLinkedList();

		for (int i = 0; i < arr.length; i++)
			list.add(arr[i]);

		Node temp = list.head;

		temp = mergeSort(temp);

		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(temp.data + " ");

		while (temp.prev != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}

		System.out.println(temp.data + " ");
	}

	public static Node mergeSort(Node node) {

		if (node == null || node.next == null)
			return node;

		Node middle = findMiddleNode(node);

		Node middle_node = middle.next;

		middle.next.prev = null;
		middle.next = null;

		Node first = mergeSort(node);
		Node second = mergeSort(middle_node);

		Node sortedList = sortedMerge(first, second);

		return sortedList;
	}

	public static Node merge(Node first, Node second) {

		Node sorted = null;

		if (first == null)
			return second;
		if (second == null)
			return first;

		if (first.data <= second.data) {
			sorted = first;
			sorted.next = merge(first.next, second);
			sorted.next.prev = sorted;
		} else {
			sorted = second;
			sorted.next = merge(first, second.next);
			sorted.next.prev = sorted;
		}

		return sorted;

	}

	public static Node findMiddleNode(Node head) {

		Node hare = head, turtle = head;

		while (hare.next != null && hare.next.next != null) {
			hare = hare.next.next;
			turtle = turtle.next;
		}

		return turtle;
	}

	public static Node sortedMerge(Node a, Node b) {
		
		Node result = null;
		if (a == null)
			return b;
		if (b == null)
			return a;
		if (a.data <= b.data) {
			result = a;
			a = a.next;
		} else {
			result = b;
			b = b.next;
		}
		result.prev = null;
		Node curr = result;
		while (a != null && b != null) {

			if (a.data <= b.data) {
				a.prev = curr;
				curr.next = a;
				a = a.next;
			} else {
				b.prev = curr;
				curr.next = b;
				b = b.next;
			}
			curr = curr.next;

		}
		if (a == null) {
			b.prev = curr;
			curr.next = b;
		}
		if (b == null) {
			a.prev = curr;
			curr.next = a;
		}
		return result;
	}

}
