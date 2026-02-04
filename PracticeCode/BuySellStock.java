public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int min = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }

        System.out.println("Max Profit: " + profit);
    }
}
