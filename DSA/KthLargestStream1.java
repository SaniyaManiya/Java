import java.util.*;

public class KthLargestStream {

    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargestStream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {

        minHeap.add(val);

        if (minHeap.size() > k) {
            minHeap.poll();
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {4,5,8,2};
        KthLargestStream obj = new KthLargestStream(3, nums);

        System.out.println(obj.add(3));  // 4
        System.out.println(obj.add(5));  // 5
        System.out.println(obj.add(10)); // 5
        System.out.println(obj.add(9));  // 8
    }
}
