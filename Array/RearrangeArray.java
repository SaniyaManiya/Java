public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -5, 6};
        int[] res = new int[arr.length];
        int p = 0, n = 1;

        for (int i : arr) {
            if (i >= 0 && p < arr.length) {
                res[p] = i;
                p += 2;
            } else if (i < 0 && n < arr.length) {
                res[n] = i;
                n += 2;
            }
        }

        for (int i : res)
            System.out.print(i + " ");
    }
}
