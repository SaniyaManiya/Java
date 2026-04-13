import java.util.*;

class Job {
    int id, deadline, profit;

    Job(int id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSchedulingDSU {

    static int find(int x, int[] parent){
        if(parent[x] == x)
            return x;
        return parent[x] = find(parent[x], parent);
    }

    static void union(int u, int v, int[] parent){
        parent[v] = u;
    }

    public static void main(String[] args){

        Job[] jobs = {
            new Job(1,2,100),
            new Job(2,1,19),
            new Job(3,2,27),
            new Job(4,1,25),
            new Job(5,3,15)
        };

        Arrays.sort(jobs, (a,b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for(Job j : jobs)
            maxDeadline = Math.max(maxDeadline, j.deadline);

        int[] parent = new int[maxDeadline + 1];
        for(int i = 0; i <= maxDeadline; i++)
            parent[i] = i;

        int totalProfit = 0;

        for(Job job : jobs){

            int available = find(job.deadline, parent);

            if(available > 0){
                totalProfit += job.profit;
                union(find(available - 1, parent), available, parent);
            }
        }

        System.out.println("Max Profit: " + totalProfit);
    }
}
