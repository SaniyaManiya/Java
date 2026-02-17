public class CombinationSum {
    static void back(int[] a,int t,int i,String cur){
        if(t==0){
            System.out.println(cur);
            return;
        }
        if(i==a.length||t<0) return;

        back(a,t-a[i],i,cur+a[i]+" ");
        back(a,t,i+1,cur);
    }

    public static void main(String[] args){
        int[] a={2,3,6,7};
        back(a,7,0,"");
    }
}
