public class MaxRectangle {
    public static void main(String[] args){
        int[][] m={{1,0,1},{1,1,1},{1,1,1}};
        int[] h=new int[m[0].length];
        int max=0;

        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++)
                h[j]=m[i][j]==0?0:h[j]+1;

            max=Math.max(max,area(h));
        }

        System.out.println(max);
    }

    static int area(int[] h){
        java.util.Stack<Integer> st=new java.util.Stack<>();
        int res=0;

        for(int i=0;i<=h.length;i++){
            int cur=i==h.length?0:h[i];
            while(!st.isEmpty()&&cur<h[st.peek()]){
                int ht=h[st.pop()];
                int w=st.isEmpty()?i:i-st.peek()-1;
                res=Math.max(res,ht*w);
            }
            st.push(i);
        }
        return res;
    }
}
