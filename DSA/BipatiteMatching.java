public class BipartiteMatching {
    static boolean bpm(int u, boolean[] seen, int[] matchR, boolean[][] graph){
        for(int v=0; v<graph[0].length; v++){
            if(graph[u][v] && !seen[v]){
                seen[v] = true;
                if(matchR[v] < 0 || bpm(matchR[v], seen, matchR, graph)){
                    matchR[v] = u;
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        boolean[][] graph = {
            {true,false,true},
            {false,true,false},
            {true,false,false}
        };

        int[] matchR = {-1,-1,-1};
        int result = 0;

        for(int u=0; u<graph.length; u++){
            boolean[] seen = new boolean[graph[0].length];
            if(bpm(u, seen, matchR, graph))
                result++;
        }

        System.out.println(result);
    }
}
