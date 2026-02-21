public class GasStation {
    public static void main(String[] args){
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};

        int tank=0,total=0,start=0;

        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            tank+=diff; total+=diff;
            if(tank<0){ tank=0; start=i+1; }
        }

        System.out.println(total>=0?start:-1);
    }
}
