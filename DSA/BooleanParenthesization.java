import java.util.*;

public class BooleanParenthesization {

    static Map<String, Integer> memo = new HashMap<>();

    static int solve(String s, int i, int j, boolean isTrue){

        if(i > j) return 0;

        if(i == j){
            if(isTrue)
                return s.charAt(i) == 'T' ? 1 : 0;
            else
                return s.charAt(i) == 'F' ? 1 : 0;
        }

        String key = i + " " + j + " " + isTrue;
        if(memo.containsKey(key))
            return memo.get(key);

        int ways = 0;

        for(int k = i + 1; k <= j - 1; k += 2){

            int lt = solve(s, i, k - 1, true);
            int lf = solve(s, i, k - 1, false);
            int rt = solve(s, k + 1, j, true);
            int rf = solve(s, k + 1, j, false);

            char op = s.charAt(k);

            if(op == '&'){
                if(isTrue)
                    ways += lt * rt;
                else
                    ways += lt * rf + lf * rt + lf * rf;
            }

            else if(op == '|'){
                if(isTrue)
                    ways += lt * rt + lt * rf + lf * rt;
                else
                    ways += lf * rf;
            }

            else if(op == '^'){
                if(isTrue)
                    ways += lt * rf + lf * rt;
                else
                    ways += lt * rt + lf * rf;
            }
        }

        memo.put(key, ways);
        return ways;
    }

    public static void main(String[] args){

        String s = "T|F&T^F";

        int result = solve(s, 0, s.length() - 1, true);

        System.out.println("Ways to evaluate True: " + result);
    }
}
