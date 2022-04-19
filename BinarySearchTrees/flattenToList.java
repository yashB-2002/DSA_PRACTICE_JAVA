/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
// o(N)
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root == null) 
            return ;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

// o(N) s.c o(N)

public static void flatten(Node root)
    {
        //code here
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()) {
            Node curr = s.peek();
            s.pop();
            if(curr.right != null){
                s.push(curr.right);
            }
            if(curr.left != null) {
                s.push(curr.left);
            }
            if(!s.isEmpty() ) {
                curr.right = s.peek();
            }
            curr.left = null;
        }
        
    }
// o(n) using morris traversal

public static void flatten(Node root)
    {
        //code here
        Node curr = root;
        while(curr != null) {
            if(curr.left != null) {
                Node prev = curr.left;
                while(prev.right != null) {
                    prev = prev.right;
                }
                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
        
        
    }
}
