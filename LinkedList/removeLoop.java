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

public class removeLoop {
    public static void removeLoopLL(LinkedListNode<Integer> head){
        if(head == null)
            return;
        LinkedListNode<Integer> start = startPoint(head);
        if(start == null) {
            return;
        }
        Node temp = start;
        while(temp.next != start) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public static LinkedListNode<Integer> startPoint(LinkedListNode<Integer> head) {
        if(head == null) 
            return null;
        LinkedListNode<Integer> intersection = detectLoopList(head);
        if(intersection == null) 
            return null;
        LinkedListNode<Integer> slow = head;
        while(intersection != slow) {
            intersection = intersection.next;
            slow = slow.next;
        }
        return slow;
    } 
    public static LinkedListNode<Integer> detectLoopList(LinkedListNode<Integer> head){
        if(head == null) 
            return null;
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) return slow;
        }
        return null;
    }
}