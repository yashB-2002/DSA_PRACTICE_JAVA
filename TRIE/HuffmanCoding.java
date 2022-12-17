import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class HuffmanCoding {
  HashMap<Character, String> encoder = new HashMap<>();
  HashMap<String, Character> decoder = new HashMap<>();

  public HuffmanCoding(String feeder) {
    HashMap<Character, Integer> fmap = new HashMap<>();
    // create freq map of feeder
    for (int i = 0; i < feeder.length(); i++) {
      // fmap.put(feeder.charAt(i), fmap.getOrDefault(feeder.charAt(i), 0) + 1);
      if (fmap.containsKey(feeder.charAt(i))) {
        int freq = fmap.get(feeder.charAt(i));
        fmap.put(feeder.charAt(i), freq + 1);
      } else {
        fmap.put(feeder.charAt(i), 1);
      }
    }

    // create min heap for adding nodes
    PriorityQueue<Node> pq = new PriorityQueue<>();
    Set<Map.Entry<Character, Integer>> entries = fmap.entrySet();
    for (Map.Entry<Character, Integer> entry : entries) {
      Node node = new Node(entry.getKey(), entry.getValue());
      pq.add(node);
    }
    // combine nodes until size of pq is 1
    while (pq.size() != 1) {
      Node min1 = pq.poll();
      Node min2 = pq.poll();
      // Node combinedNode = new Node('\0', min1.cost + min2.cost);
      Node combined = new Node(min1, min2);
      combined.cost = min1.cost + min2.cost;
      combined.data = '\0';
      pq.add(combined);
    }

    // remove last single node
    Node last = pq.poll();
    this.encoder = new HashMap<>();
    this.decoder = new HashMap<>();
    this.initEncoderDecoder(last, "");
  }

  // filling enocder and decoder
  private void initEncoderDecoder(Node node, String osf) {
    if (node == null)
      return;
    if (node.left == null && node.right == null) {
      this.encoder.put(node.data, osf);
      this.decoder.put(osf, node.data);

    }
    this.initEncoderDecoder(node.left, osf + "0");
    this.initEncoderDecoder(node.right, osf + "1");
  }

  // encode message
  public String encode(String source) {
    String ans = "";
    for (int i = 0; i < source.length(); i++) {
      String code = this.encoder.get(source.charAt(i));
      ans = ans + code;
    }
    return ans;
  }

  // decode message
  public String decode(String encodedStr) {
    String key = "", ans = "";
    for (int i = 0; i < encodedStr.length(); i++) {
      key = key + encodedStr.charAt(i);
      if (this.decoder.containsKey(key)) {
        ans = ans + this.decoder.get(key);
        key = "";
      }
    }
    return ans;
  }

  private class Node implements Comparable<Node> {
    char data;
    int cost;
    Node left;
    Node right;

    Node(char data, int cost) {
      this.cost = cost;
      this.data = data;
      this.left = null;
      this.right = null;
    }

    Node(Node left, Node right) {
      this.left = left;
      this.right = right;
    }

    @Override
    public int compareTo(HuffmanCoding.Node o) {
      return this.cost - o.cost;
    }
  }

  public static void main(String[] args) {
    String str = "abbccda";
    HuffmanCoding obj = new HuffmanCoding(str);
    String encodestr = obj.encode(str);
    // String decodestr = obj.decode(encodestr);
    // System.out.println(encode);
    // System.out.println(decode);

    BitSet set = new BitSet();
    int couter = 0;
    for (Character c : encodestr.toCharArray()) {
      if (c.equals('1')) {
        set.set(couter);
      }
      couter++;
    }
    byte[] ar = set.toByteArray();
    System.out.println(ar.length);
  }
}
