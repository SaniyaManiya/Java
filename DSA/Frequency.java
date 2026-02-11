import java.util.*;

public class Frequency {
    public static void main(String[] args){
        int[] arr={1,2,2,3,3,3};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int x:arr)
            map.put(x,map.getOrDefault(x,0)+1);

        System.out.println(map);
    }
}
