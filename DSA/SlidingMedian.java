import java.util.*;

public class SlidingMedian {
    public static void main(String[] args){
        int[] a={1,3,-1,-3,5,3,6,7};
        int k=3;

        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<k;i++) set.add(a[i]);

        for(int i=k;i<=a.length;i++){
            System.out.println(set.toArray()[k/2]);
            if(i==a.length) break;
            set.remove(a[i-k]);
            set.add(a[i]);
        }
    }
}
