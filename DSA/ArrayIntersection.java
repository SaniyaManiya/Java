import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={3,4,5};

        HashSet<Integer> set=new HashSet<>();
        for(int x:a) set.add(x);

        for(int x:b)
            if(set.contains(x))
                System.out.print(x+" ");
    }
}
