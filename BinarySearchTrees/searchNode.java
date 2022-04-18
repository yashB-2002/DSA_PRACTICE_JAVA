public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */


	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		boolean ans = true;
        if(root == null) return false;
        if(root.data == k) return true;
        // if(root.left.data == k || root.right.data == k) return true;
        if(k < root.data){
           ans =  searchInBST(root.left,k);
        }
        if(k > root.data){
            ans = searchInBST(root.right,k);
        }
        return ans;
	}
}
