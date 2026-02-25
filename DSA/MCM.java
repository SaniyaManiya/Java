public class MCM {
    public static void main(String[] args){
        int[] p={10,20,30,40};
        int n=p.length;
        int[][] dp=new int[n][n];

        for(int len=2;len<n;len++)
            for(int i=1;i+len-1<n;i++){
                int j=i+len-1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++)
                    dp[i][j]=Math.min(dp[i][j],
                        dp[i][k]+dp[k+1][j]+p[i-1]*p[k]*p[j]);
            }

        System.out.println(dp[1][n-1]);
    }
}
