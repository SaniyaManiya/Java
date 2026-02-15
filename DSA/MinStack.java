import java.util.*;

class MinStack{
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();

    void push(int x){
        st.push(x);
        if(min.isEmpty()||x<=min.peek())
            min.push(x);
    }

    void pop(){
        if(st.pop().equals(min.peek()))
            min.pop();
    }

    int getMin(){
        return min.peek();
    }

    public static void main(String[] args){
        MinStack m=new MinStack();
        m.push(5);
        m.push(2);
        m.push(8);
        System.out.println(m.getMin());
    }
}
