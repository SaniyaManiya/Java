import java.util.*;

public class LCA_BinaryLifting {

    static int LOG = 20;
    static int[][] up;
    static int[] depth;
    static List<Integer>[] tree;

    static void dfs(int v, int p){
        up[v][0] = p;

        for(int i = 1; i < LOG; i++)
            up[v][i] = up[ up[v][i-1] ][i-1];

        for(int to : tree[v]){
            if(to != p){
                depth[to] = depth[v] + 1;
                dfs(to, v);
            }
        }
    }

    static int lca(int a, int b){

        if(depth[a] < depth[b]){
            int temp = a;
            a = b;
            b = temp;
        }

        int k = depth[a] - depth[b];

        for(int i=0;i<LOG;i++)
            if((k & (1<<i)) != 0)
                a = up[a][i];

        if(a == b) return a;

        for(int i=LOG-1;i>=0;i--){
            if(up[a][i] != up[b][i]){
                a = up[a][i];
                b = up[b][i];
            }
        }

        return up[a][0];
    }

    public static void main(String[] args){

        int n = 5;
        tree = new ArrayList[n];

        for(int i=0;i<n;i++)
            tree[i] = new ArrayList<>();

        tree[0].add(1);
        tree[0].add(2);
        tree[1].add(3);
        tree[1].add(4);

        up = new int[n][LOG];
        depth = new int[n];

        dfs(0,0);

        System.out.println("LCA of 3 and 4: " + lca(3,4));
    }
}
