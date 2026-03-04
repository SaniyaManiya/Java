import java.util.*;

public class TopologicalSortBFS {

    public static void main(String[] args) {

        int V = 6;
        List<Integer>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();

        graph[5].add(2);
        graph[5].add(0);
        graph[4].add(0);
        graph[4].add(1);
        graph[2].add(3);
        graph[3].add(1);

        int[] indegree = new int[V];

        for (int i = 0; i < V; i++)
            for (int v : graph[i])
                indegree[v]++;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++)
            if (indegree[i] == 0)
                q.add(i);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");

            for (int v : graph[u]) {
                if (--indegree[v] == 0)
                    q.add(v);
            }
        }
    }
}
