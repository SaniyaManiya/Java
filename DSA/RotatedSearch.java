public class RotatedSearch {
    public static void main(String[] args){
        int[] a={4,5,6,7,0,1,2};
        int t=0,l=0,r=a.length-1;

        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==t){System.out.println(m);return;}
            if(a[l]<=a[m]){
                if(t>=a[l]&&t<a[m]) r=m-1;
                else l=m+1;
            }else{
                if(t>a[m]&&t<=a[r]) l=m+1;
                else r=m-1;
            }
        }
        System.out.println(-1);
    }
}
