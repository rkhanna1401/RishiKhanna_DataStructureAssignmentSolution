package main;

public class RightSkewedTree {

	public static Node node;
	public static Node prev = null;
	public static Node head = null;


	public static void binarySearchTreeToSkewed(Node root)
	{

		if(root == null)
		{
			return;
		}

		binarySearchTreeToSkewed(root.left);

		Node rightNode = root.right;
		
		if(head == null)
		{
			head = root;
			root.left = null;
			prev = root;
		}
		else
		{
			prev.right = root;
			root.left = null;
			prev = root;
		}

		binarySearchTreeToSkewed(rightNode);
	}

	public static void rightSkewedTraversal(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		rightSkewedTraversal(root.right);       
	}

}
