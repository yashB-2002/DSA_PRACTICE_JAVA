import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Trie {
  private class Node {
    boolean isTerminal;
    char data;
    HashMap<Character, Node> children;

    Node(char data, boolean isTerminal) {
      this.data = data;
      this.isTerminal = isTerminal;
      this.children = new HashMap<>();
    }
  }

  private int numWords;
  private Node root;

  Trie() {
    this.numWords = 0;
    this.root = new Node('\0', false);
  }

  public int numOfWords() {
    return this.numWords;
  }

  public void addWord(String word) {
    this.addWord(word, this.root);
  }

  private void addWord(String word, Node parent) {
    if (word.length() == 0) {
      if (parent.isTerminal == true) {
        // word already exists
      } else {
        parent.isTerminal = true;
        this.numWords++;
      }
      return;
    }
    char cc = word.charAt(0);
    String ros = word.substring(1);
    Node child = parent.children.get(cc);
    if (child == null) {
      child = new Node(cc, false);
      parent.children.put(cc, child);
    }
    this.addWord(ros, child);
  }

  public void display() {
    this.display(this.root, "");
  }

  private void display(Node root, String osf) {
    if (root.isTerminal) {
      // when only 1 elem is present in word and it is terminal
      System.out.println(osf.substring(1) + root.data); // substring is done because we don't want \0art as final result
    }
    Set<Map.Entry<Character, Node>> entries = root.children.entrySet();
    for (Map.Entry<Character, Node> entry : entries) {
      this.display(entry.getValue(), osf + root.data);
    }
  }

  public boolean search(String word) {
    return this.search(word, this.root);
  }

  private boolean search(String word, Node parent) {
    if (word.length() == 0) {
      if (parent.isTerminal) {
        return true;
      } else {
        return false;
      }
    }
    char cc = word.charAt(0);
    String ros = word.substring(1);
    Node child = parent.children.get(cc);
    if (child == null) {
      return false;
    }
    return this.search(ros, child);

  }

  public void remove(String word) {
    this.remove(word, this.root);
  }

  private void remove(String word, Node parent) {
    if (word.length() == 0) {
      if (parent.isTerminal) {
        parent.isTerminal = false;
        this.numWords--;
      } else {
        // word is part of other word
      }
      return;
    }
    char cc = word.charAt(0);
    String ros = word.substring(1);
    Node child = parent.children.get(cc);
    if (child == null) {
      System.out.println("enter valid word...");
      return;
    }
    this.remove(ros, child);

    if (!child.isTerminal && child.children.size() == 0) {
      parent.children.remove(cc);
    }
  }

  public static void main(String[] args) {
    Trie obj = new Trie();
    obj.addWord("art");
    obj.addWord("arts");
    obj.addWord("artss");
    obj.display();
    System.out.println(obj.search("arm"));
    obj.remove("arts");
    System.out.println("--------------------------");
    obj.display();
  }
}