public class PeakElement {
    public static void main(String[] args){
        int[] a={1,2,3,1};
        int l=0,r=a.length-1;

        while(l<r){
            int m=(l+r)/2;
            if(a[m]>a[m+1]) r=m;
            else l=m+1;
        }
        System.out.println(l);
    }
}
