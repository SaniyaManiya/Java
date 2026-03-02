import java.util.*;

public class Johnson {

    static class Edge {
        int u, v, w;
        Edge(int u, int v, int w) {
            this.u = u; this.v = v; this.w = w;
        }
    }

    public static void main(String[] args) {
        int V = 4;
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0,1,1));
        edges.add(new Edge(1,2,-1));
        edges.add(new Edge(2,3,-1));
        edges.add(new Edge(3,0,-1));

        int[] dist = new int[V];
        Arrays.fill(dist, 100000);
        dist[0] = 0;

        for(int i=1;i<V;i++)
            for(Edge e : edges)
                if(dist[e.u] + e.w < dist[e.v])
                    dist[e.v] = dist[e.u] + e.w;

        for(Edge e : edges)
            if(dist[e.u] + e.w < dist[e.v]){
                System.out.println("Negative Cycle exists");
                return;
            }

        System.out.println("No negative cycle");
    }
}
