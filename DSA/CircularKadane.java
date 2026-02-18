public class CircularKadane {
    static int kadane(int[] a){
        int max=a[0],cur=a[0];
        for(int i=1;i<a.length;i++){
            cur=Math.max(a[i],cur+a[i]);
            max=Math.max(max,cur);
        }
        return max;
    }

    public static void main(String[] args){
        int[] a={5,-3,5};
        int normal=kadane(a);
        int sum=0;
        for(int i=0;i<a.length;i++){ sum+=a[i]; a[i]=-a[i]; }
        System.out.println(Math.max(normal,sum+kadane(a)));
    }
}
