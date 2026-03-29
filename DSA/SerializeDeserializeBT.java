import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class SerializeDeserializeBT {

    // Serialize
    public static String serialize(TreeNode root) {
        if (root == null) return "null";

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        StringBuilder sb = new StringBuilder();

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node == null) {
                sb.append("null,");
                continue;
            }

            sb.append(node.val).append(",");
            q.add(node.left);
            q.add(node.right);
        }

        return sb.toString();
    }

    // Deserialize
    public static TreeNode deserialize(String data) {

        String[] arr = data.split(",");
        if (arr[0].equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (!arr[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(node.left);
            }
            i++;

            if (!arr[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(node.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        String data = serialize(root);
        System.out.println("Serialized: " + data);

        TreeNode newRoot = deserialize(data);
        System.out.println("Deserialized Root: " + newRoot.val);
    }
}
