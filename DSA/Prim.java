import java.util.*;

public class Prim {
    public static void main(String[] args){
        int[][] g={
                {0,2,0,6,0},
                {2,0,3,8,5},
                {0,3,0,0,7},
                {6,8,0,0,9},
                {0,5,7,9,0}
        };

        int V=5;
        boolean[] mst=new boolean[V];
        int[] key=new int[V];
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0]=0;

        for(int c=0;c<V;c++){
            int u=-1,min=Integer.MAX_VALUE;
            for(int i=0;i<V;i++)
                if(!mst[i]&&key[i]<min){
                    min=key[i];u=i;
                }

            mst[u]=true;

            for(int v=0;v<V;v++)
                if(g[u][v]!=0&&!mst[v]&&g[u][v]<key[v])
                    key[v]=g[u][v];
        }

        System.out.println(Arrays.toString(key));
    }
}
