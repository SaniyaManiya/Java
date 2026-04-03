import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums)
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));

        for(int num : freqMap.keySet()) {
            minHeap.add(num);

            if(minHeap.size() > k)
                minHeap.poll();
        }

        List<Integer> result = new ArrayList<>();

        while(!minHeap.isEmpty())
            result.add(minHeap.poll());

        System.out.println(result);
    }
}
