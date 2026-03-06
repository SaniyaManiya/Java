import java.util.*;

public class KosarajuSCC {

    static void dfs1(int v, boolean[] visited, Stack<Integer> stack, List<Integer>[] graph){
        visited[v] = true;

        for(int to : graph[v])
            if(!visited[to])
                dfs1(to, visited, stack, graph);

        stack.push(v);
    }

    static void dfs2(int v, boolean[] visited, List<Integer>[] rev){
        visited[v] = true;
        System.out.print(v + " ");

        for(int to : rev[v])
            if(!visited[to])
                dfs2(to, visited, rev);
    }

    public static void main(String[] args){

        int V = 5;

        List<Integer>[] graph = new ArrayList[V];
        List<Integer>[] rev = new ArrayList[V];

        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
            rev[i] = new ArrayList<>();
        }

        graph[0].add(1);
        graph[1].add(2);
        graph[2].add(0);
        graph[1].add(3);
        graph[3].add(4);

        for(int i=0;i<V;i++)
            for(int j : graph[i])
                rev[j].add(i);

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<V;i++)
            if(!visited[i])
                dfs1(i, visited, stack, graph);

        Arrays.fill(visited, false);

        while(!stack.isEmpty()){
            int v = stack.pop();

            if(!visited[v]){
                dfs2(v, visited, rev);
                System.out.println();
            }
        }
    }
}
