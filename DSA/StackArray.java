class StackArray {
    int top=-1;
    int size=5;
    int[] stack=new int[size];

    void push(int x){
        stack[++top]=x;
    }

    int pop(){
        return stack[top--];
    }

    public static void main(String[] args){
        StackArray s=new StackArray();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
    }
}
