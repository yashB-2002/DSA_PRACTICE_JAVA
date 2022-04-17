/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class mirror {

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        root = mirror(root);
    }

    public static BinaryTreeNode<Integer> mirrorHelp(BinaryTreeNode<Integer> root) {
        // Your code goes here
        if (root == null)
            return root;
        BinaryTreeNode<Integer> left = mirrorHelp(root.left);
        BinaryTreeNode<Integer> right = mirrorHelp(root.right);
        root.left = right;
        root.right = left;

        return root;

    }

}