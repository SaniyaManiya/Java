import java.util.*;

public class TarjanSCC {

    static List<Integer>[] graph;
    static int[] disc, low;
    static boolean[] inStack;
    static Stack<Integer> stack;

    static int time = 0;

    static void dfs(int u){

        disc[u] = low[u] = ++time;
        stack.push(u);
        inStack[u] = true;

        for(int v : graph[u]){

            if(disc[v] == -1){
                dfs(v);
                low[u] = Math.min(low[u], low[v]);
            }

            else if(inStack[v])
                low[u] = Math.min(low[u], disc[v]);
        }

        if(low[u] == disc[u]){

            System.out.print("SCC: ");

            while(true){
                int v = stack.pop();
                inStack[v] = false;
                System.out.print(v + " ");

                if(v == u) break;
            }

            System.out.println();
        }
    }

    public static void main(String[] args){

        int V = 5;

        graph = new ArrayList[V];

        for(int i=0;i<V;i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[1].add(2);
        graph[2].add(0);
        graph[1].add(3);
        graph[3].add(4);

        disc = new int[V];
        low = new int[V];
        inStack = new boolean[V];
        stack = new Stack<>();

        Arrays.fill(disc, -1);

        for(int i=0;i<V;i++)
            if(disc[i] == -1)
                dfs(i);
    }
}
