public class CopyArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println("Copied array:");
        for (int n : b)
            System.out.print(n + " ");
    }
}
