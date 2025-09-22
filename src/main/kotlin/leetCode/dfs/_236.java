package leetCode.dfs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _236 {
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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode output = new _236().lowestCommonAncestor(root, new TreeNode(5), new TreeNode(4));
        System.out.println(output.val);
    }

    Map<Integer, Nd> map = new HashMap<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 루트는 depth=0
        dfs(null, root, 0);

        Nd nd1 = map.get(p.val);
        Nd nd2 = map.get(q.val);

        // 깊이 맞추기
        while (nd1.depth > nd2.depth) {
            nd1 = map.get(nd1.parent.val);
        }
        while (nd2.depth > nd1.depth) {
            nd2 = map.get(nd2.parent.val);
        }

        // 공통 조상 찾기
        while (nd1.current != nd2.current) {
            nd1 = map.get(nd1.parent.val);
            nd2 = map.get(nd2.parent.val);
        }

        return nd1.current; // nd1.current == nd2.current
    }

    public void dfs(TreeNode parent, TreeNode current, int depth) {
        if(current == null) return;
        map.put(current.val, new Nd(parent, current, depth));
        dfs(current, current.left, depth+1);
        dfs(current, current.right, depth+1);
    }

    class Nd {
        TreeNode parent;
        TreeNode current;
        int depth;
        Nd(TreeNode parent, TreeNode current, int depth) {
            this.parent = parent;
            this.current = current;
            this.depth = depth;
        }
    }
}
