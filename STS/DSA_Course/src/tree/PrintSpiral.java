package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintSpiral {

	public static void main(String[] args) {
		
		//9 8 11 4 N 10 12 3 7 N N N N 2 N 6 N 1 N 5 N 0 N N N N N

		Node root = new Node(9);
		root.left = new Node(8);
		root.right = new Node(11);
		root.left.left = new Node(4);
		root.right.left = new Node(10);
		root.right.right = new Node(12);
		root.left.left.left = new Node(3);
		root.left.left.right = new Node(7);
		root.left.left.left.left = new Node(2);
		root.left.left.right.left = new Node(6);
		root.left.left.left.left.left = new Node(1);
		root.left.left.right.left.left = new Node(5);
		root.left.left.left.left.left.left = new Node(0);
		
		
		printSpiral(root);
		
	}
	
	static void printSpiral(Node node) 
    {
        if(node == null)
        return;
        
        Queue<Node> queue = new LinkedList<>();
        
        queue.add(node);
        int flag = 0;
        Stack<Integer> stack = new Stack();
         while(!queue.isEmpty())
         {
             int size = queue.size();
             
             while(size-- > 0)
             {
                 Node n = queue.poll();
                 
                 if(flag % 2 == 1)
                 {
                     if(n.left != null)
                     queue.add(n.left);
                     
                     if(n.right != null)
                     queue.add(n.right);
                     
                     System.out.print(n.data+" ");
                 }
                 else
                 {
                     if(n.left != null)  
                     queue.add(n.left);
                     
                     if(n.right != null)
                    queue.add(n.right);
                     
                     stack.push(n.data);
                 }
                 
             }
             
             while(!stack.isEmpty())
            System.out.print(stack.pop()+" ");
             
             
             flag++;
         }
    }
	

}
