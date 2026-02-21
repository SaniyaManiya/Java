import java.util.*;

public class KClosest {
    public static void main(String[] args){
        int[][] p={{1,3},{-2,2},{5,8}};
        int k=2;

        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1])
        );

        for(int[] x:p){
            pq.add(x);
            if(pq.size()>k) pq.poll();
        }

        while(!pq.isEmpty())
            System.out.println(Arrays.toString(pq.poll()));
    }
}
