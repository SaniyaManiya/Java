import java.util.*;

public class AlienDictionary {

    public static void main(String[] args) {

        String[] words = {"wrt","wrf","er","ett","rftt"};

        Map<Character, Set<Character>> graph = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();

        // initialize
        for(String word : words){
            for(char c : word.toCharArray()){
                graph.putIfAbsent(c, new HashSet<>());
                indegree.putIfAbsent(c, 0);
            }
        }

        // build graph
        for(int i = 0; i < words.length - 1; i++){

            String w1 = words[i];
            String w2 = words[i+1];

            int len = Math.min(w1.length(), w2.length());

            for(int j = 0; j < len; j++){
                if(w1.charAt(j) != w2.charAt(j)){

                    if(!graph.get(w1.charAt(j)).contains(w2.charAt(j))){
                        graph.get(w1.charAt(j)).add(w2.charAt(j));
                        indegree.put(w2.charAt(j),
                                indegree.get(w2.charAt(j)) + 1);
                    }
                    break;
                }
            }
        }

        // topological sort
        Queue<Character> q = new LinkedList<>();

        for(char c : indegree.keySet())
            if(indegree.get(c) == 0)
                q.add(c);

        StringBuilder result = new StringBuilder();

        while(!q.isEmpty()){
            char c = q.poll();
            result.append(c);

            for(char neigh : graph.get(c)){
                indegree.put(neigh, indegree.get(neigh) - 1);
                if(indegree.get(neigh) == 0)
                    q.add(neigh);
            }
        }

        System.out.println("Order: " + result.toString());
    }
}
