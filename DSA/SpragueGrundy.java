import java.util.*;

public class SpragueGrundy {

    static int mex(Set<Integer> set){
        int m = 0;
        while(set.contains(m)) m++;
        return m;
    }

    public static void main(String[] args){
        int n = 10;                  // total stones
        int[] moves = {1,3,4};       // allowed moves
        int[] grundy = new int[n+1];

        for(int i=1;i<=n;i++){
            Set<Integer> set = new HashSet<>();
            for(int m : moves){
                if(i-m >= 0)
                    set.add(grundy[i-m]);
            }
            grundy[i] = mex(set);
        }

        if(grundy[n] != 0)
            System.out.println("First player wins");
        else
            System.out.println("Second player wins");
    }
}
