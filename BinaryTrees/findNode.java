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

public class findNode {

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        if(root == null) return false;
        if(root.data == x) return true;
        boolean res1 = isNodePresent(root.left, x);
        if(res1) return true;
        boolean res2 = isNodePresent(root.right, x);
        return res2;
    }

}