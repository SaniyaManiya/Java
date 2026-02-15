import java.util.*;

public class Dijkstra {
    static class Pair{
        int v,w;
        Pair(int v,int w){this.v=v;this.w=w;}
    }

    public static void main(String[] args){
        int V=5;
        List<Pair>[] g=new ArrayList[V];
        for(int i=0;i<V;i++) g[i]=new ArrayList<>();

        g[0].add(new Pair(1,2));
        g[0].add(new Pair(2,4));
        g[1].add(new Pair(2,1));
        g[1].add(new Pair(3,7));
        g[2].add(new Pair(4,3));

        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;

        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.w-b.w);
        pq.add(new Pair(0,0));

        while(!pq.isEmpty()){
            Pair cur=pq.poll();
            for(Pair nb:g[cur.v]){
                if(dist[cur.v]+nb.w<dist[nb.v]){
                    dist[nb.v]=dist[cur.v]+nb.w;
                    pq.add(new Pair(nb.v,dist[nb.v]));
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}
