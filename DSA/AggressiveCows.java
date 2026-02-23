import java.util.*;

public class AggressiveCows {
    static boolean ok(int[] a,int c,int d){
        int cnt=1,last=a[0];
        for(int i=1;i<a.length;i++)
            if(a[i]-last>=d){
                cnt++; last=a[i];
            }
        return cnt>=c;
    }

    public static void main(String[] args){
        int[] a={1,2,4,8,9};
        Arrays.sort(a);
        int c=3,l=0,r=10,ans=0;

        while(l<=r){
            int m=(l+r)/2;
            if(ok(a,c,m)){ ans=m; l=m+1; }
            else r=m-1;
        }

        System.out.println(ans);
    }
}
