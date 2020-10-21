package linkedList;

import java.util.HashMap;
import java.util.Map;

public class LRU_Cache {

	private Map<Integer, Node> map;
	int capacity, count;
	private Node head, tail;
	
	
	public LRU_Cache(int capacity)
	{
		this.capacity = capacity;
		map = new HashMap<>();
	}
	
	public int get(int key)
	{
		if(map.containsKey(key))
		{
			Node value = map.get(key);
			Node temp = head;
			
			while(temp != value)
				temp = temp.next;
			
			if(head.next != null)
			{
			Node prev = temp.prev;
			prev.next = temp.next;
			//temp.next.prev = prev;
			
			Node node = new Node(map.get(key).data);
			node.next = head;
			head.prev = node;
			head = node;
			
			map.put(key, node);
			}
			
			return map.get(key).data;
		}
		
		return -1;
	}
	
	public void set(int key , int value)
	{
		if(count < capacity)
		{
			Node node = new Node(value);
			
			if(head == null)
			{
				node.next = head;
				head = node;
			}
			else
			{
			node.next = head;
			head.prev = node;
			head = node;
			}
			
			map.put(key, node);
			count++;
		}
		else
		{
			Node temp = head;
			
			while(temp.next.next != null)
			temp = temp.next;
			
			temp.next = null;
			
			Node node = new Node(value);
			node.next = head;
			head.prev = node;
			head = node;
			
			map.put(key, node);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		LRU_Cache lru = new LRU_Cache(4);
		
		lru.set(1 , 2);
		lru.set(2 , 3);
		lru.set(1 , 5);
		lru.set(4 , 5);
		lru.set(6 , 7);
		
		System.out.println(lru.get(1));
		System.out.println(lru.get(2));
		System.out.println(lru.get(1));
		System.out.println(lru.get(4));
		System.out.println(lru.get(6));
		
		

	}

}
