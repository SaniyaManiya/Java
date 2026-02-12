public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        int key = 9;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
