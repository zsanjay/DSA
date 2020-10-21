package tree;

public class Diameter {

	int res = 0;
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(6);
		root.right.left.right = new Node(5);
		root.right.left.right.left = new Node(7);
		
		
		System.out.println(new Diameter().diameter(root));

	}
	
	
	public  int diameter(Node root){

		
		height(root);
		
		return res;
		
	}



	private Integer height(Node root) {

		
		if(root == null)
			return 0;
		
		
		int left = height(root.left);
		int right = height(root.right);
		
		res = Math.max(res, left + right + 1);
		
		return Math.max(left, right)+1;
		
	}

}
