class Implement {
  private class Node {
    int data, si, ei;
    Node left, right;
  }

  Node root;

  public Implement(int[] arr) {
    this.root = constructTree(arr, 0, arr.length - 1);
  }

  // segment tree construction
  private Node constructTree(int[] arr, int si, int ei) {
    if (si == ei) {
      Node leaf = new Node();
      leaf.data = arr[si];
      leaf.si = si;
      leaf.ei = ei;
      return leaf;
    }
    Node node = new Node();
    node.si = si;
    node.ei = ei;
    int mid = si + (ei - si) / 2;
    node.left = this.constructTree(arr, si, mid);
    node.right = this.constructTree(arr, mid + 1, ei);
    node.data = node.left.data + node.right.data;
    return node;
  }

  // display function
  private void display() {
    this.display(this.root);
  }

  public void display(Node root) {
    String str = "";
    if (root.left != null) {
      str = str + "Interval=[" + root.left.si + "-" + root.left.ei + "] and data is " + root.left.data + "=> ";
    } else {
      str += "no left child => ";
    }
    str = str + "Interval=[" + root.si + "-" + root.ei + "] and data is " + root.data;
    if (root.right != null) {
      str = str + "<= data is " + root.right.data + " and Interval=[" + root.right.si + "-" + root.right.ei + "]";
    } else {
      str += " <= no right child";
    }
    System.out.println(str);
    if (root.left != null) {
      this.display(root.left);
    }
    if (root.right != null) {
      this.display(root.right);
    }
  }

  // query operation on tree
  public int query(int qsi, int qei) {
    return this.query(this.root, qsi, qei);
  }

  private int query(Node root, int qsi, int qei) {
    // completely inside
    if (root.si >= qsi && root.ei <= qei) {
      return root.data;
    }
    // completely outside
    else if (root.si > qei || root.ei < qsi) {
      return 0;
    }
    // overlapping intervals
    else {
      int lans = this.query(root.left, qsi, qei);
      int rans = this.query(root.right, qsi, qei);
      return lans + rans;
    }
  }

  // update operation on tree
  public void update(int index, int newVal) {
    this.root.data = this.update(this.root, index, newVal);
  }

  private int update(Node root, int idx, int val) {
    if (idx >= root.si && idx <= root.ei) {
      if (idx == root.si && idx == root.ei) {
        root.data = val;
      } else {
        int left = this.update(root.left, idx, val);
        int right = this.update(root.right, idx, val);
        root.data = left + right;
      }
    }
    return root.data;
  }

  // main function
  public static void main(String[] args) {
    int[] arr = { 3, 8, 7, 6, -2, -8, 4, 9 };
    Implement tree = new Implement(arr);
    tree.display();
    System.out.println("Sum Between Interval = " + tree.query(2, 6));
    tree.update(3, 14);
    tree.display();
    System.out.println("Updated Sum Between Interval = " + tree.query(2, 6));
  }

}

// -------------- output -----------------------------------
// --------------- segment tree --------------------
// Interval=[0-3] and data is 24=>Interval=[0-7] and data is 27<= data is 3 and
// Interval=[4-7]
// Interval=[0-1] and data is 11=>Interval=[0-3] and data is 24<= data is 13 and
// Interval=[2-3]
// Interval=[0-0] and data is 3=>Interval=[0-1] and data is 11<= data is 8 and
// Interval=[1-1]
// no left child =>Interval=[0-0] and data is 3 <= no right child
// no left child =>Interval=[1-1] and data is 8 <= no right child
// Interval=[2-2] and data is 7=>Interval=[2-3] and data is 13<= data is 6 and
// Interval=[3-3]
// no left child =>Interval=[2-2] and data is 7 <= no right child
// no left child =>Interval=[3-3] and data is 6 <= no right child
// Interval=[4-5] and data is -10=>Interval=[4-7] and data is 3<= data is 13 and
// Interval=[6-7]
// Interval=[4-4] and data is -2=>Interval=[4-5] and data is -10<= data is -8
// and Interval=[5-5]
// no left child =>Interval=[4-4] and data is -2 <= no right child
// no left child =>Interval=[5-5] and data is -8 <= no right child
// Interval=[6-6] and data is 4=>Interval=[6-7] and data is 13<= data is 9 and
// Interval=[7-7]
// no left child =>Interval=[6-6] and data is 4 <= no right child
// no left child =>Interval=[7-7] and data is 9 <= no right child
