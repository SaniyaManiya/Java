import java.util.*;

public class BellmanFord {
    static class Edge{
        int u,v,w;
        Edge(int u,int v,int w){this.u=u;this.v=v;this.w=w;}
    }

    public static void main(String[] args){
        int V=5;
        Edge[] e={
                new Edge(0,1,-1),
                new Edge(0,2,4),
                new Edge(1,2,3),
                new Edge(1,3,2),
                new Edge(1,4,2)
        };

        int[] d=new int[V];
        Arrays.fill(d,10000);
        d[0]=0;

        for(int i=1;i<V;i++)
            for(Edge ed:e)
                if(d[ed.u]+ed.w<d[ed.v])
                    d[ed.v]=d[ed.u]+ed.w;

        System.out.println(Arrays.toString(d));
    }
}
