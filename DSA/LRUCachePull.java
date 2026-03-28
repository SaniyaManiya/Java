import java.util.*;

class Node {
    int key, value;
    Node prev, next;

    Node(int k, int v){
        key = k;
        value = v;
    }
}

public class LRUCache {

    private int capacity;
    private Map<Integer, Node> map;
    private Node head, tail;

    public LRUCache(int cap){
        capacity = cap;
        map = new HashMap<>();

        head = new Node(0,0);
        tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;
    }

    private void add(Node node){
        Node temp = head.next;
        head.next = node;
        node.prev = head;
        node.next = temp;
        temp.prev = node;
    }

    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key){
        if(!map.containsKey(key))
            return -1;

        Node node = map.get(key);
        remove(node);
        add(node);

        return node.value;
    }

    public void put(int key, int value){

        if(map.containsKey(key)){
            remove(map.get(key));
        }

        if(map.size() == capacity){
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }

        Node newNode = new Node(key, value);
        add(newNode);
        map.put(key, newNode);
    }

    public static void main(String[] args){

        LRUCache cache = new LRUCache(2);

        cache.put(1,1);
        cache.put(2,2);
        System.out.println(cache.get(1)); // 1

        cache.put(3,3); // removes key 2
        System.out.println(cache.get(2)); // -1
    }
}
