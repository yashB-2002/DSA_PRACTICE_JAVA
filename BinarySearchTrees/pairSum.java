//Given a binary tree and an integer S, print all the pair of nodes whose sum equals S.


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

import java.util.*;
public class Solution {

    static void pairSum(BinaryTreeNode<Integer> root, int sum) {

        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(root==null)
            return;
        int[] arr=arrayInsertion(root);
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==sum){
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j--;
            }
            else if(arr[i]+arr[j]<sum)
                i++;
            else 
                j--;

        }
    }
    private static int[] arrayInsertion(BinaryTreeNode<Integer> root){
        if(root==null){
            int[] arr=new int[0];
            return arr;
        }
        int firstData=root.data;

        int[] jrr= arrayInsertion(root.left);

        int[] krr= arrayInsertion(root.right);
        int[] finalArray=new int[1+jrr.length+krr.length];
        int k=0;
        finalArray[k]=firstData;
        k++;
        for(int i=0;i<jrr.length;i++)
        {  
            finalArray[k++]=jrr[i];
        }
        for(int i=0;i<krr.length;i++)
        {
            finalArray[k++]=krr[i];
        }
        return finalArray;

    }

}
