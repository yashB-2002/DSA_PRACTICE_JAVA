import java.util.*;
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

public class height {

    public static int height1(BinaryTreeNode<Integer> root) {
        // Your code goes here
        if (root == null)
            return 0;
        int lh = height1(root.left);
        int rh = height1(root.right);
        if (lh > rh)
            return (lh + 1);
        else
            return rh + 1;
    }

}