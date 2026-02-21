import java.util.*;

public class RPN {
    public static void main(String[] args){
        String[] t={"2","1","+","3","*"};
        Stack<Integer> st=new Stack<>();

        for(String s:t){
            if("+-*/".contains(s)){
                int b=st.pop(),a=st.pop();
                st.push(s.equals("+")?a+b:s.equals("-")?a-b:s.equals("*")?a*b:a/b);
            }else st.push(Integer.parseInt(s));
        }
        System.out.println(st.pop());
    }
}
