import java.util.*;

public class BFS {
    public static void main(String[] args){
        int n=4;
        List<Integer>[] g=new ArrayList[n];
        for(int i=0;i<n;i++) g[i]=new ArrayList<>();

        g[0].add(1);
        g[0].add(2);
        g[1].add(3);

        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[n];

        q.add(0);
        vis[0]=true;

        while(!q.isEmpty()){
            int v=q.poll();
            System.out.print(v+" ");

            for(int x:g[v])
                if(!vis[x]){
                    vis[x]=true;
                    q.add(x);
                }
        }
    }
}
