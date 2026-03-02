import java.util.*;

public class AhoCorasick {

    static class Node {
        Map<Character, Node> next = new HashMap<>();
        Node fail;
        boolean end = false;
    }

    static Node root = new Node();

    static void insert(String word) {
        Node cur = root;
        for (char c : word.toCharArray())
            cur = cur.next.computeIfAbsent(c, k -> new Node());
        cur.end = true;
    }

    static void build() {
        Queue<Node> q = new LinkedList<>();
        for (Node child : root.next.values()) {
            child.fail = root;
            q.add(child);
        }

        while (!q.isEmpty()) {
            Node cur = q.poll();
            for (char c : cur.next.keySet()) {
                Node child = cur.next.get(c);
                Node f = cur.fail;
                while (f != null && !f.next.containsKey(c))
                    f = f.fail;
                child.fail = (f == null) ? root : f.next.get(c);
                child.end |= child.fail.end;
                q.add(child);
            }
        }
    }

    static void search(String text) {
        Node cur = root;
        for (char c : text.toCharArray()) {
            while (cur != null && !cur.next.containsKey(c))
                cur = cur.fail;
            if (cur == null) {
                cur = root;
                continue;
            }
            cur = cur.next.get(c);
            if (cur.end)
                System.out.println("Pattern found");
        }
    }

    public static void main(String[] args) {
        insert("he");
        insert("she");
        insert("hers");
        insert("his");

        build();
        search("ahishers");
    }
}
