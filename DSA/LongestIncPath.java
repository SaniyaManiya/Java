public class LongestIncPath {
    static int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    static int[][] dp;

    static int dfs(int[][] m,int i,int j){
        if(dp[i][j]!=0) return dp[i][j];
        int max=1;
        for(int[] d:dir){
            int x=i+d[0],y=j+d[1];
            if(x>=0&&y>=0&&x<m.length&&y<m[0].length
               &&m[x][y]>m[i][j])
                max=Math.max(max,1+dfs(m,x,y));
        }
        return dp[i][j]=max;
    }

    public static void main(String[] args){
        int[][] m={{9,9,4},{6,6,8},{2,1,1}};
        dp=new int[m.length][m[0].length];
        int ans=0;
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m[0].length;j++)
                ans=Math.max(ans,dfs(m,i,j));
        System.out.println(ans);
    }
}
