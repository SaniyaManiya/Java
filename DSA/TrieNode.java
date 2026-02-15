class TrieNode{
    TrieNode[] child=new TrieNode[26];
    boolean end;
}

public class TrieDemo {
    static TrieNode root=new TrieNode();

    static void insert(String s){
        TrieNode cur=root;
        for(char c:s.toCharArray()){
            if(cur.child[c-'a']==null)
                cur.child[c-'a']=new TrieNode();
            cur=cur.child[c-'a'];
        }
        cur.end=true;
    }

    static boolean search(String s){
        TrieNode cur=root;
        for(char c:s.toCharArray()){
            if(cur.child[c-'a']==null) return false;
            cur=cur.child[c-'a'];
        }
        return cur.end;
    }

    public static void main(String[] args){
        insert("cat");
        insert("car");
        System.out.println(search("cat"));
    }
}
