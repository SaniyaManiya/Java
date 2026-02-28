import java.util.*;

public class Articulation {
    static List<Integer>[] g;
    static int[] disc, low;
    static boolean[] vis, ap;
    static int time = 0;

    static void dfs(int u, int parent){
        vis[u] = true;
        disc[u] = low[u] = ++time;
        int child = 0;

        for(int v : g[u]){
            if(v == parent) continue;

            if(!vis[v]){
                child++;
                dfs(v, u);
                low[u] = Math.min(low[u], low[v]);

                if(parent != -1 && low[v] >= disc[u])
                    ap[u] = true;
            } else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }

        if(parent == -1 && child > 1)
            ap[u] = true;
    }

    public static void main(String[] args){
        int n = 5;
        g = new ArrayList[n];
        for(int i=0;i<n;i++) g[i] = new ArrayList<>();

        g[0].add(1); g[1].add(0);
        g[1].add(2); g[2].add(1);
        g[1].add(3); g[3].add(1);
        g[3].add(4); g[4].add(3);

        disc = new int[n];
        low = new int[n];
        vis = new boolean[n];
        ap = new boolean[n];

        dfs(0, -1);

        for(int i=0;i<n;i++)
            if(ap[i]) System.out.println(i);
    }
}
