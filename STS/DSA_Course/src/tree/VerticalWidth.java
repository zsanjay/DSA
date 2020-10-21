package tree;

public class VerticalWidth {

	int min , max , curr = 0;
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(6);
		root.right.left.right = new Node(5);
		root.right.left.right.left = new Node(7);

		System.out.println(new VerticalWidth().verticalWidth(root));
		
	}

	int verticalWidth(Node root) {
		
		if(root == null)
	    return 0;
	    
		getWidth(root , curr);
		
		return (max - min) + 1;
		
	}

	public void getWidth(Node root , int curr) {
		
		if(root == null)
			return;
		
		max = Math.max(max, curr);
		min = Math.min(min, curr);
		
		getWidth(root.left , curr - 1);
		getWidth(root.right , curr + 1);
		
	}
	
	
	
}
