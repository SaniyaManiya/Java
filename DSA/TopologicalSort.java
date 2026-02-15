import java.util.*;

public class TopoSort {
    static void dfs(int v,boolean[] vis,Stack<Integer> st,List<Integer>[] g){
        vis[v]=true;
        for(int x:g[v])
            if(!vis[x])
                dfs(x,vis,st,g);
        st.push(v);
    }

    public static void main(String[] args){
        int n=4;
        List<Integer>[] g=new ArrayList[n];
        for(int i=0;i<n;i++) g[i]=new ArrayList<>();

        g[0].add(1);
        g[1].add(2);
        g[0].add(3);

        boolean[] vis=new boolean[n];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++)
            if(!vis[i])
                dfs(i,vis,st,g);

        while(!st.isEmpty())
            System.out.print(st.pop()+" ");
    }
}
