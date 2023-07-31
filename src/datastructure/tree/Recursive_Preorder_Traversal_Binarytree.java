package datastructure.tree;

public class Recursive_Preorder_Traversal_Binarytree {
	TreeNode root;

	public static void main(String[] args) {

		TreeNode first = new TreeNode(0);
		TreeNode second = new TreeNode(1);
		TreeNode third = new TreeNode(2);
		TreeNode fourth = new TreeNode(3);
		TreeNode fifth = new TreeNode(4);
		// TreeNode sixth = new TreeNode(5);

		Recursive_Preorder_Traversal_Binarytree bte = new Recursive_Preorder_Traversal_Binarytree();
		bte.root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		bte.preorder_traversal(bte.root);

	}

	private void preorder_traversal(TreeNode root) {
		
		if(root == null) {
			return;
		}
		System.out.print(root.data+"--->");
		preorder_traversal(root.left);
		preorder_traversal(root.right);
	}
	
	
	
}
