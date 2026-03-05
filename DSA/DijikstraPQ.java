import java.util.*;

public class DijkstraPQ {

    static class Edge{
        int to, weight;

        Edge(int t, int w){
            to = t;
            weight = w;
        }
    }

    public static void main(String[] args){

        int V = 5;
        List<Edge>[] graph = new ArrayList[V];

        for(int i=0;i<V;i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(1,4));
        graph[0].add(new Edge(2,1));
        graph[2].add(new Edge(1,2));
        graph[1].add(new Edge(3,1));
        graph[2].add(new Edge(3,5));
        graph[3].add(new Edge(4,3));

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a,b)->a[1]-b[1]);

        dist[0] = 0;
        pq.add(new int[]{0,0});

        while(!pq.isEmpty()){

            int[] cur = pq.poll();
            int node = cur[0];

            for(Edge e : graph[node]){

                if(dist[node] + e.weight < dist[e.to]){
                    dist[e.to] = dist[node] + e.weight;
                    pq.add(new int[]{e.to, dist[e.to]});
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}
