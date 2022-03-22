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

public class mergeSort {

    public static LinkedListNode<Integer> mergeSortLL(LinkedListNode<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }
        LinkedListNode<Integer> middle = getMiddle(head);
        LinkedListNode<Integer> nextOfMiddle = middle.next;
        middle.next = null;
        LinkedListNode<Integer> left = mergeSortLL(head);
        LinkedListNode<Integer> right = mergeSortLL(nextOfMiddle);
        LinkedListNode<Integer> sortedList = sortedMerge(left, right);
        return sortedList;

    }
    private static LinkedListNode<Integer> sortedMerge(LinkedListNode<Integer> left, LinkedListNode<Integer> right){
        LinkedListNode<Integer> result = null;
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        if(left.data <= right.data){
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        return result;
    }
    private static LinkedListNode<Integer> getMiddle(LinkedListNode<Integer> head){
        if(head == null){
            return head;
        }
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}