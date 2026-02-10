import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
