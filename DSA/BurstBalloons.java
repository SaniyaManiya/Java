public class BurstBalloons {
    public static void main(String[] args){
        int[] a={3,1,5,8};
        int n=a.length;
        int[] b=new int[n+2];
        b[0]=b[n+1]=1;
        for(int i=0;i<n;i++) b[i+1]=a[i];

        int[][] dp=new int[n+2][n+2];

        for(int len=1;len<=n;len++)
            for(int l=1;l+len-1<=n;l++){
                int r=l+len-1;
                for(int k=l;k<=r;k++)
                    dp[l][r]=Math.max(dp[l][r],
                            b[l-1]*b[k]*b[r+1]+dp[l][k-1]+dp[k+1][r]);
            }

        System.out.println(dp[1][n]);
    }
}
