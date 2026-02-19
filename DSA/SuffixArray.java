import java.util.*;

public class SuffixArray {
    public static void main(String[] args){
        String s="banana";
        String[] suf=new String[s.length()];

        for(int i=0;i<s.length();i++)
            suf[i]=s.substring(i);

        Arrays.sort(suf);

        for(String x:suf)
            System.out.println(x);
    }
}
