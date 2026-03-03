public class LazySegmentTree {

    static int[] tree, lazy;
    static int n = 5;

    static void update(int node, int start, int end, int l, int r, int val) {
        if (lazy[node] != 0) {
            tree[node] += (end - start + 1) * lazy[node];
            if (start != end) {
                lazy[node*2] += lazy[node];
                lazy[node*2+1] += lazy[node];
            }
            lazy[node] = 0;
        }

        if (start > r || end < l) return;

        if (start >= l && end <= r) {
            tree[node] += (end - start + 1) * val;
            if (start != end) {
                lazy[node*2] += val;
                lazy[node*2+1] += val;
            }
            return;
        }

        int mid = (start + end) / 2;
        update(node*2, start, mid, l, r, val);
        update(node*2+1, mid+1, end, l, r, val);

        tree[node] = tree[node*2] + tree[node*2+1];
    }

    public static void main(String[] args) {
        tree = new int[4*n];
        lazy = new int[4*n];

        update(1,0,n-1,1,3,5);
        System.out.println("Range updated");
    }
}
