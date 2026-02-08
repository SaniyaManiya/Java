public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 2, 5};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Smallest element: " + min);
    }
}
