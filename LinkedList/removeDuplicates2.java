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
public class removeDuplicates2 {
    public LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) 
    {
        HashSet<Integer> set=new HashSet<>();
        LinkedListNode<Integer> curr = head, prev = null;
        while(curr != null) {
            if(set.contains(curr.data)) {
                prev.next = curr.next;
            }
            else {
                set.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}