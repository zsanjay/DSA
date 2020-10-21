package tree;

public class Node {

	int data;
	Node left , right;
	
	
	public Node(int data)
	{
		this.data = data;
	}
	
	public String toString()
	{
		return String.valueOf(this.data+" ");
	}
	
	public boolean equals(Object node)
	{
		return this.data == ((Node)node).data;
	}
}