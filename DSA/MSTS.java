public class MSIS {
    public static void main(String[] args){
        int[] a={1,101,2,3,100,4,5};
        int[] dp=a.clone();
        int ans=0;

        for(int i=1;i<a.length;i++)
            for(int j=0;j<i;j++)
                if(a[i]>a[j])
                    dp[i]=Math.max(dp[i],dp[j]+a[i]);

        for(int x:dp) ans=Math.max(ans,x);
        System.out.println(ans);
    }
}
