package stack;

import java.util.LinkedList;
import java.util.Queue;

public class UsingTwoQueues {

	
	 Queue<Integer> q1 = new LinkedList<Integer>();
	 Queue<Integer> q2 = new LinkedList<Integer>();
	
	
	public int pop()
    {
	    if(q1.isEmpty())
	    return -1;
	    
	    while(q1.size() > 1)
	    q2.add(q1.remove());
	    
	    
	    while(q2.size() > 0)
	    q1.add(q2.remove());
	    
	    return q1.remove();
    }
	
    
   public void push(int a)
    {
	    q1.add(a);	
    }

   
   
	public static void main(String[] args) {
		
		

	}
}
