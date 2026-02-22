public class CartesianTree {
    static class Node{
        int val;Node l,r;
        Node(int v){val=v;}
    }

    public static void main(String[] args){
        int[] a={5,10,40,30,28};
        Node root=build(a,0,a.length-1);
        System.out.println(root.val);
    }

    static Node build(int[] a,int l,int r){
        if(l>r) return null;
        int idx=l;
        for(int i=l;i<=r;i++)
            if(a[i]>a[idx]) idx=i;

        Node n=new Node(a[idx]);
        n.l=build(a,l,idx-1);
        n.r=build(a,idx+1,r);
        return n;
    }
}
