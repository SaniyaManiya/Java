import java.util.*;

public class KruskalMST {

    static class Edge implements Comparable<Edge> {
        int u, v, w;

        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }

        public int compareTo(Edge e) {
            return this.w - e.w;
        }
    }

    static int find(int x, int[] parent) {
        if (parent[x] != x)
            parent[x] = find(parent[x], parent);
        return parent[x];
    }

    static void union(int a, int b, int[] parent) {
        parent[find(a, parent)] = find(b, parent);
    }

    public static void main(String[] args) {

        Edge[] edges = {
            new Edge(0,1,4),
            new Edge(0,2,3),
            new Edge(1,2,1),
            new Edge(1,3,2),
            new Edge(2,3,4)
        };

        Arrays.sort(edges);

        int[] parent = new int[4];
        for(int i=0;i<4;i++) parent[i]=i;

        int cost = 0;

        for(Edge e : edges) {
            if(find(e.u,parent) != find(e.v,parent)) {
                union(e.u,e.v,parent);
                cost += e.w;
                System.out.println(e.u+" - "+e.v);
            }
        }

        System.out.println("Total MST Cost: "+cost);
    }
}
