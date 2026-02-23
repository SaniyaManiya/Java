public class CherryPickup {
    public static void main(String[] args){
        int[][] g={{0,1,-1},{1,0,-1},{1,1,1}};
        int n=g.length;
        int[][] dp=new int[n][n];
        dp[0][0]=g[0][0];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(g[i][j]!=-1){
                    if(i>0) dp[i][j]=Math.max(dp[i][j],dp[i-1][j]);
                    if(j>0) dp[i][j]=Math.max(dp[i][j],dp[i][j-1]);
                    dp[i][j]+=g[i][j];
                }

        System.out.println(dp[n-1][n-1]);
    }
}
