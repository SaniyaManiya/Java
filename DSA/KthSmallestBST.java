class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int v){
        val = v;
    }
}

public class KthSmallestBST {

    static int count = 0;
    static int result = -1;

    static void inorder(TreeNode root, int k){

        if(root == null) return;

        inorder(root.left, k);

        count++;

        if(count == k){
            result = root.val;
            return;
        }

        inorder(root.right, k);
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        int k = 3;

        inorder(root, k);

        System.out.println("Kth Smallest Element: " + result);
    }
}
