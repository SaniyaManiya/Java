public class DSU {
    static int find(int x,int[] p){
        if(p[x]!=x) p[x]=find(p[x],p);
        return p[x];
    }

    static void union(int a,int b,int[] p){
        p[find(a,p)]=find(b,p);
    }

    public static void main(String[] args){
        int[] p={0,1,2,3};
        union(0,1,p);
        union(2,3,p);
        System.out.println(find(0,p)==find(1,p));
    }
}
