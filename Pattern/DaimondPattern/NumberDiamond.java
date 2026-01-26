public class NumberDiamond {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int s = n; s > i; s--) System.out.print(" ");
            for (int j = i; j >= 1; j--) System.out.print(j);
            for (int j = 2; j <= i; j++) System.out.print(j);
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int s = n; s > i; s--) System.out.print(" ");
            for (int j = i; j >= 1; j--) System.out.print(j);
            for (int j = 2; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }
}
