public class BookPartition {
    public static void main(String[] args){
        int[] a={10,20,30,40};
        int k=2;

        int l=40,r=100,ans=0;

        while(l<=r){
            int mid=(l+r)/2,sum=0,c=1;
            for(int x:a){
                if(sum+x>mid){ c++; sum=x; }
                else sum+=x;
            }

            if(c<=k){ ans=mid; r=mid-1; }
            else l=mid+1;
        }

        System.out.println(ans);
    }
}
