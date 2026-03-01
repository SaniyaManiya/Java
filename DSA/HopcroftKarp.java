import java.util.*;

public class HopcroftKarp {

    static final int NIL = 0;
    static final int INF = Integer.MAX_VALUE;

    static boolean bfs(List<Integer>[] adj, int[] pairU, int[] pairV, int[] dist, int m){
        Queue<Integer> q = new LinkedList<>();

        for(int u=1; u<=m; u++){
            if(pairU[u] == NIL){
                dist[u] = 0;
                q.add(u);
            } else dist[u] = INF;
        }

        dist[NIL] = INF;

        while(!q.isEmpty()){
            int u = q.poll();
            if(dist[u] < dist[NIL]){
                for(int v : adj[u]){
                    if(dist[pairV[v]] == INF){
                        dist[pairV[v]] = dist[u] + 1;
                        q.add(pairV[v]);
                    }
                }
            }
        }
        return dist[NIL] != INF;
    }

    static boolean dfs(int u, List<Integer>[] adj,
                       int[] pairU, int[] pairV, int[] dist){
        if(u != NIL){
            for(int v : adj[u]){
                if(dist[pairV[v]] == dist[u] + 1 &&
                        dfs(pairV[v], adj, pairU, pairV, dist)){
                    pairV[v] = u;
                    pairU[u] = v;
                    return true;
                }
            }
            dist[u] = INF;
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        int m = 3, n = 3; // left and right sizes

        List<Integer>[] adj = new ArrayList[m+1];
        for(int i=0;i<=m;i++) adj[i] = new ArrayList<>();

        adj[1].add(1);
        adj[1].add(2);
        adj[2].add(2);
        adj[3].add(3);

        int[] pairU = new int[m+1];
        int[] pairV = new int[n+1];
        int[] dist = new int[m+1];

        int result = 0;

        while(bfs(adj, pairU, pairV, dist, m))
            for(int u=1; u<=m; u++)
                if(pairU[u] == NIL && dfs(u, adj, pairU, pairV, dist))
                    result++;

        System.out.println("Maximum Matching: " + result);
    }
}
