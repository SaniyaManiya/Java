class XORTrieNode {
    XORTrieNode[] child = new XORTrieNode[2];
}

public class MaxXOR {
    static XORTrieNode root = new XORTrieNode();

    static void insert(int num){
        XORTrieNode node = root;
        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            if(node.child[bit]==null)
                node.child[bit]=new XORTrieNode();
            node=node.child[bit];
        }
    }

    static int maxXor(int num){
        XORTrieNode node=root;
        int res=0;
        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            if(node.child[1-bit]!=null){
                res|=(1<<i);
                node=node.child[1-bit];
            } else node=node.child[bit];
        }
        return res;
    }

    public static void main(String[] args){
        int[] a={3,10,5,25,2,8};
        for(int x:a) insert(x);

        int max=0;
        for(int x:a) max=Math.max(max,maxXor(x));
        System.out.println(max);
    }
}
