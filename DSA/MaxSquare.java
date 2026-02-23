public class MaxSquare {
    public static void main(String[] args){
        char[][] m={{'1','0','1'},{'1','1','1'},{'1','1','1'}};
        int[][] dp=new int[m.length+1][m[0].length+1];
        int max=0;

        for(int i=1;i<=m.length;i++)
            for(int j=1;j<=m[0].length;j++)
                if(m[i-1][j-1]=='1'){
                    dp[i][j]=1+Math.min(dp[i-1][j],
                               Math.min(dp[i][j-1],dp[i-1][j-1]));
                    max=Math.max(max,dp[i][j]);
                }

        System.out.println(max*max);
    }
}
