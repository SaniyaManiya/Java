public class MinPathSum {
    public static void main(String[] args){
        int[][] g={{1,3,1},{1,5,1},{4,2,1}};

        for(int i=1;i<g.length;i++) g[i][0]+=g[i-1][0];
        for(int j=1;j<g[0].length;j++) g[0][j]+=g[0][j-1];

        for(int i=1;i<g.length;i++)
            for(int j=1;j<g[0].length;j++)
                g[i][j]+=Math.min(g[i-1][j],g[i][j-1]);

        System.out.println(g[g.length-1][g[0].length-1]);
    }
}
