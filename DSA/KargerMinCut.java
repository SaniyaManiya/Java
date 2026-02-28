import java.util.*;

public class KargerMinCut {
    static class Edge{
        int u,v;
        Edge(int u,int v){this.u=u;this.v=v;}
    }

    public static void main(String[] args){
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0,1));
        edges.add(new Edge(1,2));
        edges.add(new Edge(2,0));

        System.out.println("Randomized Min-Cut Example");
    }
}
