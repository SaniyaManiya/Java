import java.util.*;

public class SerializeBST {
    static void ser(Node r,StringBuilder sb){
        if(r==null) return;
        sb.append(r.val).append(",");
        ser(r.left,sb);
        ser(r.right,sb);
    }

    static Node des(Queue<String> q,int min,int max){
        if(q.isEmpty()) return null;
        int v=Integer.parseInt(q.peek());
        if(v<min||v>max) return null;

        q.poll();
        Node r=new Node(v);
        r.left=des(q,min,v);
        r.right=des(q,v,max);
        return r;
    }

    static class Node{
        int val;Node left,right;
        Node(int v){val=v;}
    }

    public static void main(String[] args){
        Node r=new Node(5);
        r.left=new Node(3);
        r.right=new Node(7);

        StringBuilder sb=new StringBuilder();
        ser(r,sb);
        Queue<String> q=new LinkedList<>(Arrays.asList(sb.toString().split(",")));
        Node root=des(q,Integer.MIN_VALUE,Integer.MAX_VALUE);

        System.out.println(root.val);
    }
}
