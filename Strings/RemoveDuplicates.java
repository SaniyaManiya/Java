import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "banana";
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char c : s.toCharArray())
            set.add(c);

        for(char c : set)
            System.out.print(c);
    }
}
