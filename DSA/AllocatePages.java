public class AllocatePages {
    static boolean possible(int[] a,int m,int mid){
        int stu=1,sum=0;
        for(int x:a){
            if(sum+x>mid){
                stu++; sum=x;
                if(stu>m) return false;
            } else sum+=x;
        }
        return true;
    }

    public static void main(String[] args){
        int[] a={12,34,67,90};
        int m=2,l=0,r=200,ans=0;

        while(l<=r){
            int mid=(l+r)/2;
            if(possible(a,m,mid)){
                ans=mid; r=mid-1;
            } else l=mid+1;
        }
        System.out.println(ans);
    }
}
