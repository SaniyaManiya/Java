import java.util.*;

public class Histogram {
    public static void main(String[] args){
        int[] h={2,1,5,6,2,3};
        Stack<Integer> st=new Stack<>();
        int max=0;

        for(int i=0;i<=h.length;i++){
            int cur=(i==h.length)?0:h[i];
            while(!st.isEmpty()&&cur<h[st.peek()]){
                int ht=h[st.pop()];
                int w=st.isEmpty()?i:i-st.peek()-1;
                max=Math.max(max,ht*w);
            }
            st.push(i);
        }

        System.out.println(max);
    }
}
