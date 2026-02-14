import java.util.*;

public class SubarraySum {
    public static void main(String[] args){
        int[] a={1,2,3};
        int k=3;

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        int sum=0,count=0;

        for(int x:a){
            sum+=x;
            count+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        System.out.println(count);
    }
}
