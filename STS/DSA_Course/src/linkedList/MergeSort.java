package linkedList;

public class MergeSort {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		int arr[] = {3 ,5 ,2 , 4 , 1};
		
		for(int i = 0; i < arr.length; i++)
			list.add(arr[i]);
		
		Node result = mergeSort(list.head);
		
		while(result != null)
		{
			System.out.print(result.data+ " ");
			result = result.next;
		}

	}

	public static Node mergeSort(Node head)
    {
       
		int length = 0;
		Node temp = head;
		
		while(temp != null)
		{
			temp = temp.next;
			length++;
		}
		temp = head;
		int low = 0 , high = length-1;
		
		 sort(temp , low , high);
		 
		 return temp;
    }

	public static void sort(Node temp, int low, int high) {
		
		
		if(low < high)
		{
			int mid = (low + high)/2;
			
			 sort(temp , low , mid );
			 sort(temp , mid+1 , high);
			
			merge(temp , low , mid ,high);
			
		}
		
		
	}

	public static void merge(Node head, int low, int mid, int high) {
		
		int i =0, j = 0, k =low;
		
		 int n1 = mid - low + 1; 
	     int n2 = high - mid; 
		
		Node temp1 = head;
		Node temp2 = head;
		
		LinkedList link1 = new LinkedList();
		
		LinkedList link2 = new LinkedList();
		
		
		while(i < low)
		{
			temp1 = temp1.next;
			i++;
		}
		
		while(j < mid+1)
		{
			temp2 = temp2.next;
			j++;
		}
		 i =0;
		 j = 0;
		while(i < n1)
		{
			link1.add(temp1.data);
			temp1 = temp1.next;
			i++;
		}
		
		
		while(j < n2)
		{
			link2.add(temp2.data);
			temp2 = temp2.next;
			j++;
		}
		
		temp1 = link1.head;
		temp2 = link2.head;
		Node node = head;
		
		
		while(k > 0)
		{
			node = node.next;
			k--;
		}
		
		
		i = 0;
		j = 0;
		
		while(i < link1.size() &&  j < link2.size())
		{
			
			if(temp1.data <= temp2.data)
			{
				node.data = temp1.data;
				node = node.next;
				temp1 = temp1.next;
				i++;
			}
			else
			{
				node.data = temp2.data;
				node = node.next;
				temp2 = temp2.next;
				j++;
			}
			
			
			
			
		}
		
		while(i < link1.size())
		{
			node.data = temp1.data;
			node = node.next;
			temp1 = temp1.next;
			
			i++;
		}
		
		while(j < link2.size())
		{
			node.data = temp2.data;
			node = node.next;
			temp2 = temp2.next;
			
			j++;
		}
		
	}
	
	
}
