import java.util.*;

public class LRUCache {
    public static void main(String[] args){
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>3;
            }
        };

        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);

        System.out.println(map);
    }
}
