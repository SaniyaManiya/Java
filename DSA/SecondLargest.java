public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 40, 20, 30};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first)
                second = x;
        }

        System.out.println(second);
    }
}
