public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};

        int largest = arr[0];
        int second = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Second largest = " + second);
    }
}
