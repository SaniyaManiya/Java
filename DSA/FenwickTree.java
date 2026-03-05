public class FenwickTree {

    static int[] bit;
    static int n;

    static void update(int i, int val){
        while(i <= n){
            bit[i] += val;
            i += i & (-i);
        }
    }

    static int query(int i){

        int sum = 0;

        while(i > 0){
            sum += bit[i];
            i -= i & (-i);
        }

        return sum;
    }

    public static void main(String[] args){

        int[] arr = {0,2,1,3,4,5};
        n = arr.length-1;

        bit = new int[n+1];

        for(int i=1;i<=n;i++)
            update(i, arr[i]);

        System.out.println("Prefix Sum till 5: " + query(5));
    }
}
