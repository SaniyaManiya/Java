public class CountTypes {
    public static void main(String[] args) {
        String str = "Java 123";
        int upper = 0, lower = 0, digit = 0, space = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isLowerCase(ch)) lower++;
            else if (Character.isDigit(ch)) digit++;
            else if (ch == ' ') space++;
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Spaces: " + space);
    }
}
