public class Knapsack {
    public static void main(String[] args){
        int[] wt = {1,3,4,5};
        int[] val = {1,4,5,7};
        int W = 7;

        int[] dp = new int[W+1];

        for(int i=0;i<wt.length;i++)
            for(int w=W; w>=wt[i]; w--)
                dp[w] = Math.max(dp[w], dp[w-wt[i]] + val[i]);

        System.out.println(dp[W]);
    }
}
