public class findNode {
	public static int findNodeInLL(LinkedListNode<Integer> head, int n) {
        int pos = 0;
        LinkedListNode<Integer> temp = head;
        while(temp != null){
            if(temp.data == n){
                return pos;
            }
            pos++;
            temp = temp.next;
        }
        return -1;
	}
}