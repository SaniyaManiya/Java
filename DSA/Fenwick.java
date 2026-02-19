public class Fenwick {
    static int[] bit;

    static void update(int i,int v){
        while(i<bit.length){
            bit[i]+=v;
            i+=i&-i;
        }
    }

    static int query(int i){
        int sum=0;
        while(i>0){
            sum+=bit[i];
            i-=i&-i;
        }
        return sum;
    }

    public static void main(String[] args){
        int[] a={0,1,2,3,4,5};
        bit=new int[a.length];

        for(int i=1;i<a.length;i++)
            update(i,a[i]);

        System.out.println(query(4));
    }
}
