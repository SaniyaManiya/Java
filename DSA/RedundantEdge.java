public class RedundantEdge {
    static int find(int x,int[] p){
        if(p[x]!=x) p[x]=find(p[x],p);
        return p[x];
    }

    public static void main(String[] args){
        int[][] e={{1,2},{1,3},{2,3}};
        int[] p=new int[4];
        for(int i=1;i<=3;i++) p[i]=i;

        for(int[] ed:e){
            int a=find(ed[0],p),b=find(ed[1],p);
            if(a==b){
                System.out.println(ed[0]+" "+ed[1]);
                return;
            }
            p[a]=b;
        }
    }
}
