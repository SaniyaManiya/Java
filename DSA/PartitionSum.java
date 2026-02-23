public class PartitionSum {
    public static void main(String[] args){
        int[] a={1,5,11,5};
        int sum=0;
        for(int x:a) sum+=x;
        if(sum%2!=0){ System.out.println(false); return; }

        boolean[] dp=new boolean[sum/2+1];
        dp[0]=true;

        for(int x:a)
            for(int j=sum/2;j>=x;j--)
                dp[j]|=dp[j-x];

        System.out.println(dp[sum/2]);
    }
}
