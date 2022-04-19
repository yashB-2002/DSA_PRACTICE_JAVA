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

public class nodeWithoutSiblings {

    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> node) {
        if (node == null)
            return;

        if (node.left != null && node.right != null) {
            printNodesWithoutSibling(node.left);
            printNodesWithoutSibling(node.right);
        }

        else if (node.right != null) {
            System.out.print(node.right.data + " ");
            printNodesWithoutSibling(node.right);
        }

        else if (node.left != null) {
            System.out.print(node.left.data + " ");
            printNodesWithoutSibling(node.left);
        }
    }

}