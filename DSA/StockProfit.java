public class StockProfit {
    public static void main(String[] args){
        int[] p={7,1,5,3,6,4};
        int min=p[0],profit=0;

        for(int x:p){
            min=Math.min(min,x);
            profit=Math.max(profit,x-min);
        }

        System.out.println(profit);
    }
}
