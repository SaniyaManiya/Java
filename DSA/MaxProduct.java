public class MaxProduct {
    public static void main(String[] args){
        int[] a={2,3,-2,4};

        int max=a[0],min=a[0],res=a[0];

        for(int i=1;i<a.length;i++){
            int t=max;
            max=Math.max(a[i],Math.max(max*a[i],min*a[i]));
            min=Math.min(a[i],Math.min(t*a[i],min*a[i]));
            res=Math.max(res,max);
        }

        System.out.println(res);
    }
}
