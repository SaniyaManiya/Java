public class SubarraySumN {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        int k = 12;

        int start = 0, sum = 0;

        for(int end = 0; end < arr.length; end++){

            sum += arr[end];

            while(sum > k && start <= end){
                sum -= arr[start];
                start++;
            }

            if(sum == k){
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray found");
    }
}
