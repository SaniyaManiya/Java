import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args){
        int[] a={100,4,200,1,3,2};
        HashSet<Integer> set=new HashSet<>();
        for(int x:a) set.add(x);

        int best=0;

        for(int x:set)
            if(!set.contains(x-1)){
                int cur=x,len=1;
                while(set.contains(cur+1)){
                    cur++;
                    len++;
                }
                best=Math.max(best,len);
            }

        System.out.println(best);
    }
}
