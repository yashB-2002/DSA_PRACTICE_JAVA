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
public class ReverseLL {
    // iterative solution
    public static void ReverseListIterative(LinkedListNode<Integer> head) {
        if (head == null || head.next == null)
            return head;
        LinkedListNode<Integer> curr = head, prev = null;
        while (curr != null) {
            LinkedListNode<Integer> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // recursion approach-1
    public static void ReverseListRecursive1(LinkedListNode<Integer> head, LinkedListNode<Integer> curr,
            LinkedListNode<Integer> prev) {
        if (curr == null) {
            head = prev;
            return;
        }
        LinkedListNode<Integer> next = curr.next;
        ReverseListRecursive1(head, next, curr);
        curr.next = prev;
    }

    public static LinkedListNode<Integer> ReverseListRecursive(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head, prev = null;
        ReverseListRecursive1(head, curr, prev);
        return head;
    }

    // recursion approach-2
    public static void ReverseListRecursive2(LinkedListNode<Integer> head) {
        if (head == null || head.next == null)
            return head;
        ListNode nhead = ReverseListRecursive2(head.next);
        ListNode temp = nhead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return nhead;
    }

    // recursion approach-3
    public static void ReverseListRecursive3(LinkedListNode<Integer> head) {
        if (head == null || head.next == null)
            return head;
        ListNode nhead = ReverseListRecursive3(head.next);
        head.next.next = head;
        head.next = null;
        return nhead;
    }

}