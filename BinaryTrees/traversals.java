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

public class traversals {
    // level order
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if(root == null) return;
        Queue<BinaryTreeNode<Integer>> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            for(int i=0; i < count; i++){
                root = q.remove();
                System.out.print(root.data + " ");
                if(root.left != null) {
                    q.add(root.left);                  
                }
                if(root.right != null) {
                    q.add(root.right);         
                }
            }
            System.out.print("\n");
        }
	}

    // preOrder
    public static void preOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    // inOrder
    public static void inOrder(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    // postOrder
    public static void postOrder(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

	
}
