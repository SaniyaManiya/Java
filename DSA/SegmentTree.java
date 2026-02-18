public class SegmentTree {
    static int[] tree;

    static void build(int[] a,int i,int l,int r){
        if(l==r){ tree[i]=a[l]; return; }
        int m=(l+r)/2;
        build(a,2*i,l,m);
        build(a,2*i+1,m+1,r);
        tree[i]=tree[2*i]+tree[2*i+1];
    }

    static int query(int i,int l,int r,int ql,int qr){
        if(ql>r||qr<l) return 0;
        if(ql<=l&&r<=qr) return tree[i];
        int m=(l+r)/2;
        return query(2*i,l,m,ql,qr)+query(2*i+1,m+1,r,ql,qr);
    }

    public static void main(String[] args){
        int[] a={1,3,5,7,9};
        tree=new int[4*a.length];
        build(a,1,0,a.length-1);
        System.out.println(query(1,0,a.length-1,1,3));
    }
}
