public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog".toLowerCase();
        boolean isPangram = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!str.contains(String.valueOf(ch))) {
                isPangram = false;
                break;
            }
        }

        System.out.println(isPangram ? "Pangram" : "Not Pangram");
    }
}
