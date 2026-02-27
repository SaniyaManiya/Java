import java.util.*;

public class PrimPQ {
    static class Edge{
        int v,w;
        Edge(int v,int w){this.v=v;this.w=w;}
    }

    public static void main(String[] args){
        int V=3;
        List<Edge>[] g=new ArrayList[V];
        for(int i=0;i<V;i++) g[i]=new ArrayList<>();

        g[0].add(new Edge(1,1));
        g[1].add(new Edge(0,1));
        g[1].add(new Edge(2,2));
        g[2].add(new Edge(1,2));

        boolean[] vis=new boolean[V];
        PriorityQueue<Edge> pq=new PriorityQueue<>((a,b)->a.w-b.w);
        pq.add(new Edge(0,0));
        int cost=0;

        while(!pq.isEmpty()){
            Edge e=pq.poll();
            if(vis[e.v]) continue;
            vis[e.v]=true;
            cost+=e.w;
            for(Edge nb:g[e.v])
                if(!vis[nb.v]) pq.add(nb);
        }
        System.out.println(cost);
    }
}
