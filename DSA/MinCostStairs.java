public class MinCostStairs {
    public static void main(String[] args){
        int[] c={10,15,20};
        int a=0,b=0;

        for(int i=2;i<=c.length;i++){
            int cur=Math.min(b+c[i-1],a+c[i-2]);
            a=b; b=cur;
        }
        System.out.println(b);
    }
}
