import java.util.*;

public class LIS {
    public static void main(String[] args){
        int[] a={10,9,2,5,3,7,101,18};
        int[] dp=new int[a.length];
        Arrays.fill(dp,1);

        int max=1;

        for(int i=1;i<a.length;i++)
            for(int j=0;j<i;j++)
                if(a[i]>a[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    max=Math.max(max,dp[i]);
                }

        System.out.println(max);
    }
}
