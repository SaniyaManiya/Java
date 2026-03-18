import java.util.*;

public class MaxProductThree {

    public static void main(String[] args) {

        int[] nums = {-10, -10, 5, 2};

        Arrays.sort(nums);
        int n = nums.length;

        int option1 = nums[n-1] * nums[n-2] * nums[n-3];
        int option2 = nums[0] * nums[1] * nums[n-1];

        int result = Math.max(option1, option2);

        System.out.println("Maximum Product: " + result);
    }
}
