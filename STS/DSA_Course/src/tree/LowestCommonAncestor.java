package tree;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		

		Node root = new Node(7);
		root.left = new Node(1);
		root.right = new Node(10);
		root.left.right = new Node(2);
		root.right.left = new Node(9);
		root.right.right = new Node(11);
		root.left.right.right = new Node(4);
		root.right.left.left = new Node(8);
		root.right.right.right = new Node(12);

		root = lca(root , 9 ,10);
		
		if(root != null)
		System.out.println(root);
		
	}

	
	static Node lca(Node root, int n1,int n2)
	{
		 List<Node> listA = new ArrayList<>();
		 List<Node> listB = new ArrayList<>();
			
		if(!findPath(root , n1 , listA) || !findPath(root , n2 , listB))
		return null;
		
		int i;
		for(i = 0;i< listA.size()-1 && i < listB.size()-1; i++)
		{
		    if(listA.get(i+1) != listB.get(i+1))
		    return listA.get(i);
		}
		
		return listA.get(i);
	}


	private static 	boolean findPath(Node root , int n , List<Node> list)
	{
	    if(root == null)
	    return false;
	    
	    list.add(root);
	    
	    if(root.data == n)
	    return true;
	    
	    if(findPath(root.left, n ,list) || findPath(root.right, n ,list))
	    return true;
	    
	    list.remove(list.size()-1);
	    
	    return false;
	}
}
