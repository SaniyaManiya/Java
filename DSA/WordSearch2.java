import java.util.*;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    String word;
}

public class WordSearch2 {

    static TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();

        for (String w : words) {
            TrieNode node = root;
            for (char c : w.toCharArray()) {
                int i = c - 'a';
                if (node.children[i] == null)
                    node.children[i] = new TrieNode();
                node = node.children[i];
            }
            node.word = w;
        }
        return root;
    }

    static void dfs(char[][] board, int i, int j,
                    TrieNode node, List<String> res) {

        char c = board[i][j];
        if (c == '#' || node.children[c - 'a'] == null)
            return;

        node = node.children[c - 'a'];

        if (node.word != null) {
            res.add(node.word);
            node.word = null;
        }

        board[i][j] = '#';

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        for (int[] d : dir) {
            int x = i + d[0], y = j + d[1];
            if (x>=0 && y>=0 && x<board.length && y<board[0].length)
                dfs(board, x, y, node, res);
        }

        board[i][j] = c;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'o','a','a','n'},
            {'e','t','a','e'},
            {'i','h','k','r'},
            {'i','f','l','v'}
        };

        String[] words = {"oath","pea","eat","rain"};

        TrieNode root = buildTrie(words);
        List<String> res = new ArrayList<>();

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                dfs(board, i, j, root, res);

        System.out.println(res);
    }
}
