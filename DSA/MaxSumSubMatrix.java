public class MaxSumSubmatrix {
    public static void main(String[] args){
        int[][] m={{1,-2,-1},{2,3,-2},{-1,2,4}};
        int R=m.length,C=m[0].length,ans=Integer.MIN_VALUE;

        for(int l=0;l<C;l++){
            int[] temp=new int[R];
            for(int r=l;r<C;r++){
                for(int i=0;i<R;i++) temp[i]+=m[i][r];
                ans=Math.max(ans,kadane(temp));
            }
        }
        System.out.println(ans);
    }

    static int kadane(int[] a){
        int max=a[0],cur=a[0];
        for(int i=1;i<a.length;i++){
            cur=Math.max(a[i],cur+a[i]);
            max=Math.max(max,cur);
        }
        return max;
    }
}
