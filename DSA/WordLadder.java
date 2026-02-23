import java.util.*;

public class WordLadder {
    public static void main(String[] args){
        String begin="hit",end="cog";
        Set<String> dict=new HashSet<>(Arrays.asList("hot","dot","dog","lot","log","cog"));
        Queue<String> q=new LinkedList<>();
        q.add(begin);
        int level=1;

        while(!q.isEmpty()){
            for(int s=q.size();s>0;s--){
                String w=q.poll();
                if(w.equals(end)){ System.out.println(level); return; }

                char[] arr=w.toCharArray();
                for(int i=0;i<arr.length;i++){
                    char old=arr[i];
                    for(char c='a';c<='z';c++){
                        arr[i]=c;
                        String nw=new String(arr);
                        if(dict.remove(nw)) q.add(nw);
                    }
                    arr[i]=old;
                }
            }
            level++;
        }
    }
}
