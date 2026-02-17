import java.util.*;

public class Kruskal {
    static class Edge{
        int u,v,w;
        Edge(int u,int v,int w){this.u=u;this.v=v;this.w=w;}
    }

    static int find(int x,int[] p){
        if(p[x]==x) return x;
        return p[x]=find(p[x],p);
    }

    public static void main(String[] args){
        Edge[] e={
                new Edge(0,1,10),
                new Edge(0,2,6),
                new Edge(0,3,5),
                new Edge(1,3,15),
                new Edge(2,3,4)
        };

        Arrays.sort(e,(a,b)->a.w-b.w);

        int[] parent=new int[4];
        for(int i=0;i<4;i++) parent[i]=i;

        for(Edge ed:e){
            int x=find(ed.u,parent);
            int y=find(ed.v,parent);

            if(x!=y){
                System.out.println(ed.u+"-"+ed.v);
                parent[x]=y;
            }
        }
    }
}
