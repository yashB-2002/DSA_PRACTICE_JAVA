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

public class isPalindrome {
    
    public static boolean isPalindromeLL(LinkedListNode<Integer> head) {
        if(head==null || head.next==null) return true;
        LinkedListNode<Integer> mid = midPoint(head);
        LinkedListNode<Integer> last = reverseList(mid.next);
        LinkedListNode<Integer> curr = head;
        while(last != null){
            if(curr.data != last.data) return false;
            last = last.next;
            curr = curr.next;
        }
        return true;
    }

    // midpoint of LL
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow=head,fast=head;
        if(fast == null) return fast;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    // reverse LL
    public static LinkedListNode<Integer> reverseList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;
        while(curr != null){
            LinkedListNode<Integer> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

}