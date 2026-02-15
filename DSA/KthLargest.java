import java.util.*;

public class KthLargest {
    public static void main(String[] args){
        int[] a={3,2,1,5,6,4};
        int k=2;

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int x:a){
            pq.add(x);
            if(pq.size()>k) pq.poll();
        }

        System.out.println(pq.peek());
    }
}
