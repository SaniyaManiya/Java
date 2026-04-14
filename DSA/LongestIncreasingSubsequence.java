import java.util.*;

public class LongestIncreasingSubsequence {

    public static void main(String[] args){

        int[] nums = {10,9,2,5,3,7,101,18};

        List<Integer> list = new ArrayList<>();

        for(int num : nums){

            int pos = Collections.binarySearch(list, num);

            if(pos < 0)
                pos = -(pos + 1);

            if(pos == list.size())
                list.add(num);
            else
                list.set(pos, num);
        }

        System.out.println("LIS Length: " + list.size());
    }
}
