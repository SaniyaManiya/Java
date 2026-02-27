import java.util.*;

public class ShortestBinaryPath {
    public static void main(String[] args){
        int[][] g={{0,1},{1,0}};
        int n=g.length;
        if(g[0][0]==1) return;

        int[][] dir={{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0,1});
        g[0][0]=1;

        while(!q.isEmpty()){
            int[] cur=q.poll();
            if(cur[0]==n-1&&cur[1]==n-1){
                System.out.println(cur[2]);
                return;
            }
            for(int[] d:dir){
                int x=cur[0]+d[0], y=cur[1]+d[1];
                if(x>=0&&y>=0&&x<n&&y<n&&g[x][y]==0){
                    g[x][y]=1;
                    q.add(new int[]{x,y,cur[2]+1});
                }
            }
        }
    }
}
