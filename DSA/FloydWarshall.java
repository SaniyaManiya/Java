public class FloydWarshall {
    static final int INF = 9999;

    public static void main(String[] args){
        int[][] g={
                {0,3,INF,5},
                {2,0,INF,4},
                {INF,1,0,INF},
                {INF,INF,2,0}
        };

        int V=g.length;

        for(int k=0;k<V;k++)
            for(int i=0;i<V;i++)
                for(int j=0;j<V;j++)
                    if(g[i][k]+g[k][j]<g[i][j])
                        g[i][j]=g[i][k]+g[k][j];

        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++)
                System.out.print(g[i][j]+" ");
            System.out.println();
        }
    }
}
