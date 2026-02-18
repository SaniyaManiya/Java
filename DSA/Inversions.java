public class Inversions {
    static int merge(int[] a,int l,int m,int r){
        int[] t=new int[r-l+1];
        int i=l,j=m+1,k=0,inv=0;

        while(i<=m&&j<=r){
            if(a[i]<=a[j]) t[k++]=a[i++];
            else{
                t[k++]=a[j++];
                inv+=m-i+1;
            }
        }

        while(i<=m) t[k++]=a[i++];
        while(j<=r) t[k++]=a[j++];

        for(i=l;i<=r;i++) a[i]=t[i-l];
        return inv;
    }

    static int sort(int[] a,int l,int r){
        if(l>=r) return 0;
        int m=(l+r)/2;
        return sort(a,l,m)+sort(a,m+1,r)+merge(a,l,m,r);
    }

    public static void main(String[] args){
        int[] a={2,4,1,3,5};
        System.out.println(sort(a,0,a.length-1));
    }
}
