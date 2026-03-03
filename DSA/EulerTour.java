import java.util.*;

public class EulerTour {

    static List<Integer>[] tree;
    static int[] in, out, flat;
    static int timer = 0;

    static void dfs(int u, int parent) {
        in[u] = timer;
        flat[timer++] = u;

        for (int v : tree[u])
            if (v != parent)
                dfs(v, u);

        out[u] = timer - 1;
    }

    public static void main(String[] args) {
        int n = 5;
        tree = new ArrayList[n];
        for(int i=0;i<n;i++) tree[i] = new ArrayList<>();

        tree[0].add(1);
        tree[0].add(2);
        tree[1].add(3);
        tree[1].add(4);

        in = new int[n];
        out = new int[n];
        flat = new int[n];

        dfs(0, -1);

        System.out.println("Subtree range of node 1: " + in[1] + " to " + out[1]);
    }
}
