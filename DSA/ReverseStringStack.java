import java.util.*;

public class ReverseStringStack {
    public static void main(String[] args) {
        String s = "hello";
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray())
            st.push(c);

        while (!st.isEmpty())
            System.out.print(st.pop());
    }
}
