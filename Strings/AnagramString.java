import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println(Arrays.equals(x,y) ? "Anagram" : "Not Anagram");
    }
}
