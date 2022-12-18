import java.util.ArrayList;

class heapImplemtation {
  public static void main(String[] args) {
    heapImplemtation heap = new heapImplemtation();
    heap.add(10);
    heap.display();
    System.out.println(heap.get());
    heap.add(20);
    heap.display();
    System.out.println(heap.get());
    heap.add(4);
    heap.display();
    System.out.println(heap.get());
    heap.add(9);
    heap.display();
    System.out.println(heap.get());
    heap.add(50);
    heap.display(); // [4, 9, 10, 20, 50]
    System.out.println(heap.get());
    heap.remove();
    heap.display();
    System.out.println(heap.get());
    heap.remove();
    heap.display();
    System.out.println(heap.get());
    // [10]
    // 10
    // [10, 20]
    // 10
    // [4, 20, 10]
    // 4
    // [4, 9, 10, 20]
    // 4
    // [4, 9, 10, 20, 50]
    // 4
    // [9, 20, 10, 50]
    // 9
    // [10, 20, 50]
    // 10
  }

  static ArrayList<Integer> data = new ArrayList<>();

  public void add(int item) {
    data.add(item);
    upheapify(data.size() - 1);
  }

  private void upheapify(int ci) {
    int pi = (ci - 1) / 2;
    if (data.get(ci) < data.get(pi)) {
      swap(ci, pi);
      upheapify(pi);
    }
  }

  public int remove() {
    swap(0, data.size() - 1);
    int rv = data.remove(data.size() - 1);
    downheapify(0);
    return rv;
  }

  private void downheapify(int pi) {
    int lci = 2 * pi + 1;
    int rci = 2 * pi + 2;
    int mini = pi;
    if (lci < data.size() && data.get(lci) < data.get(mini)) {
      mini = lci;
    }
    if (rci < data.size() && data.get(rci) < data.get(mini)) {
      mini = rci;
    }
    if (mini != pi) {
      swap(mini, pi);
      downheapify(mini);
    }
  }

  public int get() {
    return data.get(0);
  }

  public void swap(int i, int j) {
    int ith = data.get(i);
    int jth = data.get(j);
    data.set(i, jth);
    data.set(j, ith);
  }

  public void display() {
    System.out.println(data);
  }

  public int size() {
    return data.size();
  }

  public boolean isEmpty() {
    return data.isEmpty();
  }

}