public class MinJumps {
    public static void main(String[] args){
        int[] a={2,3,1,1,4};
        int jumps=0,curEnd=0,far=0;

        for(int i=0;i<a.length-1;i++){
            far=Math.max(far,i+a[i]);
            if(i==curEnd){
                jumps++;
                curEnd=far;
            }
        }
        System.out.println(jumps);
    }
}
