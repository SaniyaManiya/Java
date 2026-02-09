public class CharFrequency {
    public static void main(String[] args) {
        String str = "programming";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (str.indexOf(ch) == i) {
                System.out.println(ch + " : " + count);
            }
        }
    }
}
