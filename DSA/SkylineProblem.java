import java.util.*;

public class SkylineProblem {

    public static void main(String[] args) {

        int[][] buildings = {
            {2,9,10},
            {3,7,15},
            {5,12,12}
        };

        List<int[]> events = new ArrayList<>();

        for(int[] b : buildings){
            events.add(new int[]{b[0], -b[2]}); // start
            events.add(new int[]{b[1], b[2]});  // end
        }

        Collections.sort(events, (a, b) -> {
            if(a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(0);

        int prev = 0;

        for(int[] e : events){

            int x = e[0], h = e[1];

            if(h < 0)
                maxHeap.add(-h);
            else
                maxHeap.remove(h);

            int curr = maxHeap.peek();

            if(curr != prev){
                System.out.println("[" + x + "," + curr + "]");
                prev = curr;
            }
        }
    }
}
