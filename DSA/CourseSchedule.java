import java.util.*;

public class CourseSchedule {
    public static void main(String[] args){
        int n=2;
        int[][] pre={{1,0}};
        List<Integer>[] g=new ArrayList[n];
        for(int i=0;i<n;i++) g[i]=new ArrayList<>();

        int[] indeg=new int[n];
        for(int[] p:pre){ g[p[1]].add(p[0]); indeg[p[0]]++; }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++) if(indeg[i]==0) q.add(i);

        int cnt=0;
        while(!q.isEmpty()){
            int v=q.poll(); cnt++;
            for(int x:g[v]) if(--indeg[x]==0) q.add(x);
        }

        System.out.println(cnt==n);
    }
}
