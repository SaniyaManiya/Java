public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 9, 1};
        int key = 9;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        System.out.println(index != -1 ? "Found at index " + index : "Not found");
    }
}
