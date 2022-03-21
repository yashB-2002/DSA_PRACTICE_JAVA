/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/
// Given this linked list: 1 -> 2 -> 3 -> 4 -> 5
// For k = 2, you should return: 2 -> 1 -> 4 -> 3 -> 5
// For k = 3, you should return: 3 -> 2 -> 1 -> 5 -> 4


public class Solution {

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        if(head == null || k == 0)
            return head;
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> next = null;
        LinkedListNode<Integer> prev = null;
        int cnt = 0;
        
        while(curr != null && cnt < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            cnt++;
        }
        
        if(next != null) {
            head.next = kReverse(next,k);
        }
        
        return prev;
	}

}