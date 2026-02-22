import java.util.*;

public class MeetMiddle {
    static void gen(int[] a,int i,int sum,List<Integer> res){
        if(i==a.length){ res.add(sum); return; }
        gen(a,i+1,sum,res);
        gen(a,i+1,sum+a[i],res);
    }

    public static void main(String[] args){
        int[] a={1,2,3,4};
        List<Integer> l1=new ArrayList<>(),l2=new ArrayList<>();

        gen(Arrays.copyOfRange(a,0,2),0,0,l1);
        gen(Arrays.copyOfRange(a,2,4),0,0,l2);

        System.out.println(l1);
        System.out.println(l2);
    }
}
