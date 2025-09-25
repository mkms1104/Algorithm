package leetCode.dfs;

import leetCode.TreeNode;

public class _1448 {

    private int count = 0;
    private int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        int output = new _1448().goodNodes(root);
        System.out.println(output);
    }

    public int goodNodes(TreeNode root) {

        dfs(root);
        return count;
    }

    // DFS 탐색 시작
    // max = Integer.MIN_VALUE로 초기화
    // max 값과 현재 노드 값을 비교해서 현재 노드 값이 크면 count + 1
    // 다음 노드가 null이 아닌 경우 max 값을 현재 노드 값으로 교체
    public void dfs(TreeNode node) {
        if(node == null) return;

        // 현재 max 값 백업
        int prevMax = max;

        if(node.val >= max) {
            count++;
            max = node.val;
        }

        dfs(node.left);
        dfs(node.right);

        max = prevMax;
    }
}
