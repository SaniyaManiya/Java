import java.util.*;

public class AlienDict {
    public static void main(String[] args){
        String[] w={"baa","abcd","abca","cab","cad"};
        Map<Character,Set<Character>> g=new HashMap<>();

        for(int i=0;i<w.length-1;i++){
            String a=w[i],b=w[i+1];
            for(int j=0;j<Math.min(a.length(),b.length());j++)
                if(a.charAt(j)!=b.charAt(j)){
                    g.computeIfAbsent(a.charAt(j),k->new HashSet<>()).add(b.charAt(j));
                    break;
                }
        }

        System.out.println(g);
    }
}
