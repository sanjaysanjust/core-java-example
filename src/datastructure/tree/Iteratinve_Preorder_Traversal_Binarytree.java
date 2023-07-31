package datastructure.tree;

import java.util.Stack;

public class Iteratinve_Preorder_Traversal_Binarytree {
	TreeNode root;
public static void main(String[] args) {
	TreeNode first = new TreeNode(0);
	TreeNode second = new TreeNode(1);
	TreeNode third = new TreeNode(2);
	TreeNode fourth = new TreeNode(3);
	TreeNode fifth = new TreeNode(4);
	// TreeNode sixth = new TreeNode(5);

	Iteratinve_Preorder_Traversal_Binarytree iptb = new Iteratinve_Preorder_Traversal_Binarytree();
	iptb.root = first;
	first.left = second;
	first.right = third;
	second.left = fourth;
	second.right = fifth;
	iptb.preorder_traversal(iptb.root);
}
private void preorder_traversal(TreeNode root) {
	if(root == null) {
		return;
	}
	Stack<TreeNode> stk = new Stack<TreeNode>();
	stk.push(root);
	while(!stk.isEmpty()) {
		TreeNode tempNode = stk.pop();
		System.out.println(tempNode.data);
		if(tempNode.right != null) {
			stk.push(tempNode.right);
		}
		if(tempNode.left != null) {
			stk.push(tempNode.left);
		}
	}
	
}
}
