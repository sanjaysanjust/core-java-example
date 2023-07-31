package datastructure.tree;

import java.util.Stack;

public class BinaryTreeExample {
	private TreeNode root;

	public static void main(String[] args) {
	
		TreeNode first = new TreeNode(0);
		TreeNode second = new TreeNode(1);
		TreeNode third = new TreeNode(2);
		TreeNode fourth = new TreeNode(3);
		TreeNode fifth = new TreeNode(4);
		// TreeNode sixth = new TreeNode(5);

		BinaryTreeExample bte = new BinaryTreeExample();
		bte.root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;

		bte.preOrderRecursive(bte.root);
		System.out.println("################################");
		bte.preOrderIterative(bte.root);
	}

	private void preOrderIterative(TreeNode root3) {

		Stack<TreeNode> stn = new Stack<TreeNode>();
		stn.push(root3);
		System.out.println(stn.isEmpty());
		while (!stn.isEmpty()) {
			TreeNode temp = stn.pop();
			System.out.print(temp.data);
			if (temp.right != null) {
				stn.push(temp.right);
			}
			if (temp.left != null) {
				stn.push(temp.left);
			}

		}

	}

	private void preOrderRecursive(TreeNode root2) {
		if (root2 == null) {
			return;
		}
		System.out.println(root2.data);
		preOrderRecursive(root2.left);
		preOrderRecursive(root2.right);

	}

}
