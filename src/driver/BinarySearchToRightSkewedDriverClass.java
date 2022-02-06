package driver;

import main.Node;
import main.RightSkewedTree;

public class BinarySearchToRightSkewedDriverClass {

	public static void main(String[] args) {

		RightSkewedTree.node = new Node(50);
		RightSkewedTree.node.left = new Node(30); 
		RightSkewedTree.node.right = new Node(60); 
		RightSkewedTree.node.left.left = new Node(10); 
		RightSkewedTree.node.right.left= new Node(40);

		RightSkewedTree.binarySearchTreeToSkewed(RightSkewedTree.node);
		RightSkewedTree.rightSkewedTraversal(RightSkewedTree.head);
	}

}
