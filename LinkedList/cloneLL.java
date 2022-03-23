import java.util.HashMap;

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

public class cloneLL {
    // using extra space approach
    LinkedListNode<Integer> copyList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> tempHead = new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> t = tempHead;
        HashMap<LinkedListNode<Integer>, LinkedListNode<Integer>> map = new HashMap<>();
        while (curr != null) {

            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(curr.data);
            map.put(curr, newNode);
            t.next = newNode;
            t = t.next;
            curr = curr.next;

        }
        tempHead = tempHead.next;
        LinkedListNode<Integer> c1 = head;
        LinkedListNode<Integer> c2 = tempHead;
        while (c2 != null) {
            c2.random = (c1.random != null) ? map.get(c1.random) : null;
            c1 = c1.next;
            c2 = c2.next;
        }
        return tempHead;

    }
// ----------------------------------------------------------------------------------------



    // without using extra space

    // copy of list
    void copyList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head;
        while (curr != null) {
            LinkedListNode<Integer> node = new LinkedListNode<Integer>(curr.data);
            LinkedListNode<Integer> next = curr.next;
            curr.next = node;
            node.next = next;
            curr = next;
        }
    }

    // copy of random pointer
    void copyListRandomPointer(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head;
        while(curr != null) {
            LinkedListNode<Integer> random = curr.random;
            if(curr.random != null ) { 
                curr.next.random = random.next;
            }
            curr = curr.next.next;
        }
    }

    // extracting list
    LinkedListNode<Integer> extractList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> t = temp;
        LinkedListNode<Integer> curr = head;
        while(curr != null) {
            t.next = curr.next;
            curr.next = curr.next.next;
            t = t.next;
            curr = curr.next;
        } 
        return temp.next;
    }

    LinkedListNode<Integer> clone(LinkedListNode<Integer> head) {
        copyList(head);
        copyListRandomPointer(head);
        return extractList(head);
    }
}