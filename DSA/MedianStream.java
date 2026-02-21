import java.util.*;

public class MedianStream {
    public static void main(String[] args){
        PriorityQueue<Integer> lo=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> hi=new PriorityQueue<>();

        int[] stream={5,15,1,3};

        for(int x:stream){
            lo.add(x);
            hi.add(lo.poll());
            if(hi.size()>lo.size()) lo.add(hi.poll());

            double median=lo.size()>hi.size()?lo.peek():(lo.peek()+hi.peek())/2.0;
            System.out.println(median);
        }
    }
}
