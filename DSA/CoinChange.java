public class CoinChange {
    public static void main(String[] args){
        int[] coins={1,2,5};
        int amt=11;

        int[] dp=new int[amt+1];
        for(int i=1;i<=amt;i++) dp[i]=amt+1;

        dp[0]=0;

        for(int i=1;i<=amt;i++)
            for(int c:coins)
                if(i>=c)
                    dp[i]=Math.min(dp[i],dp[i-c]+1);

        System.out.println(dp[amt]>amt?-1:dp[amt]);
    }
}
