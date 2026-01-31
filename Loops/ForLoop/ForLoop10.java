public class ForLoop10 {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;

        for(; num != 0; num /= 10) {
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}
