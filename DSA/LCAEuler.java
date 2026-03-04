import java.util.*;

public class LCAEuler {

    static List<Integer>[] tree;
    static int[] euler, depth, first;
    static int idx = 0;

    static void dfs(int node, int parent, int d) {
        depth[node] = d;
        euler[idx] = node;
        first[node] = idx++;

        for (int child : tree[node]) {
            if (child != parent) {
                dfs(child, node, d + 1);
                euler[idx++] = node;
            }
        }
    }

    static int lca(int u, int v) {
        int l = first[u], r = first[v];
        if (l > r) {
            int temp = l;
            l = r;
            r = temp;
        }

        int res = euler[l];
        for (int i = l; i <= r; i++) {
            if (depth[euler[i]] < depth[res])
                res = euler[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        tree = new ArrayList[n];
        for (int i = 0; i < n; i++)
            tree[i] = new ArrayList<>();

        tree[0].add(1);
        tree[0].add(2);
        tree[1].add(3);
        tree[1].add(4);

        euler = new int[2 * n];
        depth = new int[n];
        first = new int[n];

        dfs(0, -1, 0);

        System.out.println("LCA of 3 and 4: " + lca(3, 4));
    }
}
