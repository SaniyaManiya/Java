import java.util.*;

public class RemoveInvalidParen {
    static boolean valid(String s){
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') c++;
            if(ch==')'&&--c<0) return false;
        }
        return c==0;
    }

    public static void main(String[] args){
        String s="()())()";
        Set<String> vis=new HashSet<>();
        Queue<String> q=new LinkedList<>();
        q.add(s); vis.add(s);

        while(!q.isEmpty()){
            String cur=q.poll();
            if(valid(cur)){
                System.out.println(cur);
                return;
            }
            for(int i=0;i<cur.length();i++)
                if(cur.charAt(i)=='('||cur.charAt(i)==')'){
                    String nxt=cur.substring(0,i)+cur.substring(i+1);
                    if(vis.add(nxt)) q.add(nxt);
                }
        }
    }
}
