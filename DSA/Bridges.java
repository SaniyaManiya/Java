import java.util.*;

public class Bridges {
    static List<Integer>[] g;
    static int[] disc, low;
    static boolean[] vis;
    static int time = 0;

    static void dfs(int u, int parent){
        vis[u] = true;
        disc[u] = low[u] = ++time;

        for(int v : g[u]){
            if(v == parent) continue;

            if(!vis[v]){
                dfs(v, u);
                low[u] = Math.min(low[u], low[v]);

                if(low[v] > disc[u])
                    System.out.println(u + " - " + v);
            } else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }

    public static void main(String[] args){
        int n = 5;
        g = new ArrayList[n];
        for(int i=0;i<n;i++) g[i] = new ArrayList<>();

        g[0].add(1); g[1].add(0);
        g[1].add(2); g[2].add(1);
        g[2].add(0); g[0].add(2);
        g[1].add(3); g[3].add(1);
        g[3].add(4); g[4].add(3);

        disc = new int[n];
        low = new int[n];
        vis = new boolean[n];

        dfs(0, -1);
    }
}
