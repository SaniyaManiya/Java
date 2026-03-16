import java.util.*;

public class ProductArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int n = nums.length;

        int[] result = new int[n];

        int prefix = 1;
        for(int i = 0; i < n; i++){
            result[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for(int i = n-1; i >= 0; i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
