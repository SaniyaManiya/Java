import java.util.*;

public class DistinctSubstrings {
    public static void main(String[] args){
        String s="ababa";
        HashSet<String> set=new HashSet<>();

        for(int i=0;i<s.length();i++)
            for(int j=i+1;j<=s.length();j++)
                set.add(s.substring(i,j));

        System.out.println(set.size());
    }
}
