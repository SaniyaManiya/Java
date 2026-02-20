public class EggDrop {
    public static void main(String[] args){
        int e=2,f=6;
        int[][] dp=new int[e+1][f+1];

        for(int i=1;i<=e;i++){
            dp[i][0]=0;
            dp[i][1]=1;
        }

        for(int j=1;j<=f;j++) dp[1][j]=j;

        for(int i=2;i<=e;i++)
            for(int j=2;j<=f;j++){
                dp[i][j]=Integer.MAX_VALUE;
                for(int x=1;x<=j;x++)
                    dp[i][j]=Math.min(dp[i][j],
                        1+Math.max(dp[i-1][x-1],dp[i][j-x]));
            }

        System.out.println(dp[e][f]);
    }
}
