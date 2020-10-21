package tree;

public class ChildrenSumParent {

	public static void main(String[] args) {
		
		
		Node root = new Node(7);
		root.left = new Node(6);
		root.right = new Node(1);
		root.left.right = new Node(5);
		root.right.left = new Node(2);
		
		System.out.println(isSumProperty(root));

	}
	
	public static int isSumProperty(Node root)
	{
    if(root == null)
    return 1;
    
    if(root.left != null && root.right != null)
    {
    int left = root.left.data;
    int right = root.right.data;
    
    int sum = left + right;
    
    if(sum != root.data)
    return 0;
    
    }
    else if(root.left != null && root.right == null)
    {
        int sum = root.left.data;
        
        if(sum != root.data)
        return 0;
        
    }
    else if(root.left == null && root.right != null)
    {
    int sum = root.right.data;
    
    if(sum != root.data)
    return 0;
    
    }
    int l = isSumProperty(root.left);
    int r = isSumProperty(root.right);
    
    if(l == 0 || r == 0)
    return 0;
    else
    return 1;
	}
	

}
