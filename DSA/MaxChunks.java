public class MaxChunks {
    public static void main(String[] args){
        int[] a={1,0,2,3,4};
        int max=0,res=0;

        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i]);
            if(max==i) res++;
        }

        System.out.println(res);
    }
}
