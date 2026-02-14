import java.util.*;

public class DFS {
    static void dfs(int v, boolean[] vis, List<Integer>[] g){
        vis[v]=true;
        System.out.print(v+" ");

        for(int x:g[v])
            if(!vis[x])
                dfs(x,vis,g);
    }

    public static void main(String[] args){
        int n=4;
        List<Integer>[] g=new ArrayList[n];
        for(int i=0;i<n;i++) g[i]=new ArrayList<>();

        g[0].add(1);
        g[0].add(2);
        g[1].add(3);

        dfs(0,new boolean[n],g);
    }
}
