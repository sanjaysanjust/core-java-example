package datastructure.tree;

public class Recursive_Inorder_Traversal_Binarytree {
	TreeNode root;

	public static void main(String[] args) {

		TreeNode first = new TreeNode(0);
		TreeNode second = new TreeNode(1);
		TreeNode third = new TreeNode(2);
		TreeNode fourth = new TreeNode(3);
		TreeNode fifth = new TreeNode(4);
		// TreeNode sixth = new TreeNode(5);

		Recursive_Inorder_Traversal_Binarytree ritb = new Recursive_Inorder_Traversal_Binarytree();
		ritb.root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		ritb.inorder_traversal(ritb.root);

	}

	private void inorder_traversal(TreeNode root) {
		
		if(root == null) {
			return;
		}
		inorder_traversal(root.left);
		System.out.print(root.data+"--->");
		inorder_traversal(root.right);
	}
	
	
	
}
