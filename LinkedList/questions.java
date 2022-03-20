public class questions {
    public class Node {
        Node next;
        int data;
    }

    public class LL {
        Node head;
        Node tail;
        int size;

        public void addlast(int val) {
            Node temp = new Node();
            temp.next = null;
            temp.data = val;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return;
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node t = head;
                for (int i = 0; i < size - 1; i++) {
                    t = t.next;
                }
                tail = t;
                t.next = null;
                size--;
            }
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return;
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public void addFirst(int val) {
            Node t = new Node();
            t.data = val;
            t.next = head;
            if (size == 0) {
                tail = temp;
            }
            size++;
        }
    }
}