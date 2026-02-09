public class SwapFirstLast {
    public static void main(String[] args) {
        String str = "Hello";

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        String result = last + str.substring(1, str.length() - 1) + first;
        System.out.println(result);
    }
}
