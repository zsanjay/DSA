package tree;

public class CheckIfSubtree {

	public static void main(String[] args) {
		
		
		Node root = new Node(26);
		root.left = new Node(10);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(6);
		
		Node root1 = new Node(26);
		root1.left = new Node(10);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(6);
		
		

	}


    public static boolean isSubtree(Node T, Node S) {
        
        if(T == null)
        return false;
        
        if(S == null)
        return true;
        
        if(T.data == S.data)
        {
            if(checkEquals(T , S))
            return true;
        }
        
        
        return isSubtree(T.left , S) || isSubtree(T.right , S);
    }
    
	public static boolean checkEquals(Node T , Node S)
	{
	   
	  if(T == null && S == null)
	  return true;
	  
	  if(T == null || S == null)
	  return false;
	   
	  return (T.data == S.data && 
	  checkEquals(T.left , S.left) && checkEquals(T.right , S.right));
	}



}
