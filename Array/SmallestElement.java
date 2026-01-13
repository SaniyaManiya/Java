public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 90, 33};

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest element = " + min);
    }
}
