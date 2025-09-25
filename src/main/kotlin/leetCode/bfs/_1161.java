package leetCode.bfs;

import leetCode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _1161 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-100);
        root.left = new TreeNode(-200);
        root.right = new TreeNode(-300);
        root.left.left = new TreeNode(-20);
        root.left.right = new TreeNode(-5);
        root.right.left = new TreeNode(-10);

        int output = new _1161().maxLevelSum(root);
        System.out.println(output);
    }

    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int currentLevel = 1;
        int maxLevelOfSum = 1;
        int currentMaxSum = root.val;

        while(!queue.isEmpty()) {
            int sum = 0;
            int length = queue.size();

            for(int i=0; i<length; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

            if(sum > currentMaxSum) {
                currentMaxSum = sum;
                maxLevelOfSum = currentLevel;
            }
            currentLevel++;
        }
        return maxLevelOfSum;
    }
}
