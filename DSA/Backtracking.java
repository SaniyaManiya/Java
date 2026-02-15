import java.util.*;

public class Subsets {
    static void back(int[] a,int i,List<Integer> cur){
        if(i==a.length){
            System.out.println(cur);
            return;
        }

        back(a,i+1,cur);
        cur.add(a[i]);
        back(a,i+1,cur);
        cur.remove(cur.size()-1);
    }

    public static void main(String[] args){
        int[] a={1,2,3};
        back(a,0,new ArrayList<>());
    }
}
