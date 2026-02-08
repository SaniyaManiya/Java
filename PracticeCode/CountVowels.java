public class CountVowels {
    public static void main(String[] args) {
        String s = "education";
        int count = 0;

        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println("Vowels count: " + count);
    }
}
