import java.util.*;

public class GraphCycle {
    static boolean dfs(int v,boolean[] vis,boolean[] rec,List<Integer>[] g){
        vis[v]=true;
        rec[v]=true;

        for(int x:g[v]){
            if(!vis[x]&&dfs(x,vis,rec,g)) return true;
            else if(rec[x]) return true;
        }

        rec[v]=false;
        return false;
    }

    public static void main(String[] args){
        int n=3;
        List<Integer>[] g=new ArrayList[n];
        for(int i=0;i<n;i++) g[i]=new ArrayList<>();

        g[0].add(1);
        g[1].add(2);
        g[2].add(0);

        System.out.println(dfs(0,new boolean[n],new boolean[n],g));
    }
}
