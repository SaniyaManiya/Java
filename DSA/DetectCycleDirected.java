import java.util.*;

public class DetectCycleDirected {

    static boolean dfs(int node, List<Integer>[] graph,
                       boolean[] visited, boolean[] recStack){

        visited[node] = true;
        recStack[node] = true;

        for(int neighbor : graph[node]){

            if(!visited[neighbor]){
                if(dfs(neighbor, graph, visited, recStack))
                    return true;
            }

            else if(recStack[neighbor])
                return true;
        }

        recStack[node] = false;
        return false;
    }

    public static void main(String[] args){

        int V = 4;

        List<Integer>[] graph = new ArrayList[V];

        for(int i=0;i<V;i++)
            graph[i] = new ArrayList<>();

        graph[0].add(1);
        graph[1].add(2);
        graph[2].add(3);
        graph[3].add(1);   // cycle here

        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i, graph, visited, recStack)){
                    System.out.println("Cycle detected");
                    return;
                }
            }
        }

        System.out.println("No cycle");
    }
}
