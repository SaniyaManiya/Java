public class SlidingWindow {
    public static void main(String[] args){
        int[] a={2,1,5,1,3,2};
        int k=3;

        int sum=0,max=0;

        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(i>=k) sum-=a[i-k];
            max=Math.max(max,sum);
        }

        System.out.println(max);
    }
}
