import java.util.*;

public class KthMatrix {
    public static void main(String[] args){
        int[][] m={{1,5,9},{10,11,13},{12,13,15}};
        int k=8;

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int[] r:m)
            for(int x:r){
                pq.add(x);
                if(pq.size()>k) pq.poll();
            }

        System.out.println(pq.peek());
    }
}
