import java.util.*;

public class WordBreak2 {
    static Map<String,List<String>> memo=new HashMap<>();

    static List<String> dfs(String s, Set<String> dict){
        if(memo.containsKey(s)) return memo.get(s);
        List<String> res=new ArrayList<>();
        if(s.isEmpty()){ res.add(""); return res; }

        for(String w:dict)
            if(s.startsWith(w))
                for(String sub:dfs(s.substring(w.length()),dict))
                    res.add(w+(sub.isEmpty()?"":" "+sub));

        memo.put(s,res);
        return res;
    }

    public static void main(String[] args){
        Set<String> d=new HashSet<>(Arrays.asList("cat","cats","and","sand","dog"));
        System.out.println(dfs("catsanddog",d));
    }
}
