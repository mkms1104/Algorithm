package leetCode.dfs;

import java.util.ArrayList;
import java.util.List;

public class _872 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new _872.TreeNode(1);
        TreeNode root2 = new _872.TreeNode(1);
//        root.left = new _872.TreeNode(5);
//        root.left.left = new _872.TreeNode(6);
//        root.left.right = new _872.TreeNode(2);
//        root.left.right.left = new _872.TreeNode(7);
//        root.left.right.right = new _872.TreeNode(4);
//        root.right = new _872.TreeNode(1);
//        root.right.left = new _872.TreeNode(9);
//        root.right.right = new _872.TreeNode(8);

        boolean output = new _872().leafSimilar(root1, root2);
        System.out.println(output);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        dfs(root1, leaves1);
        dfs(root2, leaves2);

        return leaves1.equals(leaves2);
    }

    private void dfs(TreeNode node, List<Integer> leaves) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
        }
        dfs(node.left, leaves);
        dfs(node.right, leaves);
    }
}
