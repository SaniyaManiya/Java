import java.util.*;

public class WordBreak {
    public static void main(String[] args){
        String s="leetcode";
        Set<String> dict=Set.of("leet","code");

        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;

        for(int i=1;i<=s.length();i++)
            for(int j=0;j<i;j++)
                if(dp[j]&&dict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }

        System.out.println(dp[s.length()]);
    }
}
