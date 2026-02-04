import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        int index = 0;

        for(int n : nums){
            if(n != 0)
                nums[index++] = n;
        }

        while(index < nums.length)
            nums[index++] = 0;

        System.out.println(Arrays.toString(nums));
    }
}
