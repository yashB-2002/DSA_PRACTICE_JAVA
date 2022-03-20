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
// eg: list =  1 2 3 4 5, n = 3 
// o/p = 3 4 5 1 2 
public class appendLastNToFirst {
    public static LinkedListNode<Integer> appendLastNToFirstInLL(LinkedListNode<Integer> root, int n) {
        if (root == null || n == 0)
            return root;
        LinkedListNode<Integer> temp = root;
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> temp1 = null;
        int count = countLength(root);
        int pos = count - n;
        int i = 0;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        head = temp.next;
        temp.next = null;
        temp1 = head;
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
        temp1.next = root;
        return head;
    }

    public static int countLength(LinkedListNode<Integer> head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }

}