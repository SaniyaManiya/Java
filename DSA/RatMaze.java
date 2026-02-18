public class RatMaze {
    static boolean solve(int[][] m,int i,int j){
        if(i==m.length-1&&j==m.length-1) return true;
        if(i<m.length&&j<m.length&&m[i][j]==1){
            m[i][j]=2;
            return solve(m,i+1,j)||solve(m,i,j+1);
        }
        return false;
    }

    public static void main(String[] args){
        int[][] m={{1,0,0},{1,1,0},{0,1,1}};
        System.out.println(solve(m,0,0));
    }
}
