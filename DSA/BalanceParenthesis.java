import java.util.*;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String s="({[]})";
        Stack<Character> st=new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='[')
                st.push(c);
            else{
                if(st.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                st.pop();
            }
        }
        System.out.println(st.isEmpty());
    }
}
