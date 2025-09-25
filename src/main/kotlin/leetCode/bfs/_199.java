package leetCode.bfs;

import leetCode.TreeNode;
import leetCode.dfs._872;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _199 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);

//        root.left.right = new TreeNode(5);
//        root.right.right = new TreeNode(4);

        List<Integer> output = new _199().rightSideView(root);
        System.out.println(output);
    }

    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<Integer> output = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode node = null;
            int size = queue.size();

            for(int i=0; i<size; i++) {
                node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            output.add(node.val); // 각 라인의 마지막 노드
        }
        return output;
    }
}
