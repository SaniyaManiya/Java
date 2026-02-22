public class BinaryLifting {
    static int[][] up;

    public static void main(String[] args){
        int[] parent={-1,0,0,1,1};
        int n=parent.length,LOG=3;
        up=new int[LOG][n];

        for(int i=0;i<n;i++) up[0][i]=parent[i]==-1?i:parent[i];

        for(int j=1;j<LOG;j++)
            for(int i=0;i<n;i++)
                up[j][i]=up[j-1][ up[j-1][i] ];

        System.out.println(kthAncestor(4,2));
    }

    static int kthAncestor(int v,int k){
        for(int i=0;i<up.length;i++)
            if(((k>>i)&1)==1)
                v=up[i][v];
        return v;
    }
}
