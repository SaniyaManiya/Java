import java.util.*;

public class MinWindow {
    public static void main(String[] args){
        String s="ADOBECODEBANC", t="ABC";
        int[] map=new int[128];
        for(char c:t.toCharArray()) map[c]++;

        int l=0,count=t.length(),min=Integer.MAX_VALUE,start=0;

        for(int r=0;r<s.length();r++){
            if(map[s.charAt(r)]-- >0) count--;
            while(count==0){
                if(r-l+1<min){ min=r-l+1; start=l; }
                if(map[s.charAt(l++)]++==0) count++;
            }
        }

        System.out.println(s.substring(start,start+min));
    }
}
