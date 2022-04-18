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

public class Solution {
    public static boolean isBST(BinaryTreeNode<Integer> root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private static boolean valid(BinaryTreeNode<Integer> root, long min, long max){
        if(root == null)    return true;
        if(root.data>min && root.data<max)    
            return(valid(root.left, min, root.data  ) && valid(root.right, root.data, max));
        return false;    
    }

	

}
