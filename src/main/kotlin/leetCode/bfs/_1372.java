package leetCode.bfs;

import leetCode.TreeNode;
import leetCode.dfs._104;

public class _1372 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(1);
//        root.right.left = new TreeNode(1);
//        root.right.right = new TreeNode(1);
//        root.right.right.left = new TreeNode(1);
//        root.right.right.right = new TreeNode(1);
//        root.right.right.left.right = new TreeNode(1);
//        root.right.right.left.right.right = new TreeNode(1);

        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(1);
        root.left.right.left.right = new TreeNode(1);

        int output = new _1372().longestZigZag(root);
        System.out.println(output);
    }

    int maxDepth = 0;

    public int longestZigZag(TreeNode root) {
        dfs(root.left, 1, true);   // 왼쪽으로 간 경우
        dfs(root.right, 1, false); // 오른쪽으로 간 경우
        return maxDepth;
    }

    public void dfs(TreeNode node, int depth, boolean isLeft) {
        if (node == null) return;

        maxDepth = Math.max(maxDepth, depth);

        if (isLeft) {
            dfs(node.right, depth + 1, false); // 왼 → 오른
            dfs(node.left, 1, true);          // 새 출발
        } else {
            dfs(node.left, depth + 1, true);  // 오 → 왼
            dfs(node.right, 1, false);        // 새 출발
        }
    }
}
