import java.util.*;

public class Itinerary {
    static Map<String,PriorityQueue<String>> g=new HashMap<>();
    static LinkedList<String> res=new LinkedList<>();

    static void dfs(String u){
        while(g.containsKey(u)&&!g.get(u).isEmpty())
            dfs(g.get(u).poll());
        res.addFirst(u);
    }

    public static void main(String[] args){
        String[][] t={{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"}};

        for(String[] e:t)
            g.computeIfAbsent(e[0],k->new PriorityQueue<>()).add(e[1]);

        dfs("JFK");
        System.out.println(res);
    }
}
