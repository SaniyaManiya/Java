public class SparseTable {
    static int[][] st;
    static int[] log;

    public static void main(String[] args){
        int[] a={1,3,-2,8,5};
        int n=a.length;
        log=new int[n+1];
        for(int i=2;i<=n;i++) log[i]=log[i/2]+1;

        int k=log[n]+1;
        st=new int[k][n];

        for(int i=0;i<n;i++) st[0][i]=a[i];

        for(int i=1;i<k;i++)
            for(int j=0;j+(1<<i)<=n;j++)
                st[i][j]=Math.min(st[i-1][j],st[i-1][j+(1<<(i-1))]);

        System.out.println(query(1,4));
    }

    static int query(int l,int r){
        int j=log[r-l+1];
        return Math.min(st[j][l],st[j][r-(1<<j)+1]);
    }
}
