public class HouseRobber {
    public static void main(String[] args){
        int[] a={2,7,9,3,1};

        int prev1=0,prev2=0;

        for(int x:a){
            int temp=prev1;
            prev1=Math.max(prev2+x,prev1);
            prev2=temp;
        }

        System.out.println(prev1);
    }
}
