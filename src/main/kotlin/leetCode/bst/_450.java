package leetCode.bst;

import leetCode.TreeNode;

public class _450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // root.val == key → 삭제 대상 노드 찾음

            // 1. 자식이 없는 경우 (leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // 2. 자식이 하나만 있는 경우
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // 3. 자식이 둘 다 있는 경우
            // successor(오른쪽 서브트리에서 가장 작은 값) 찾기
            TreeNode successor = findMin(root.right);
            root.val = successor.val;  // 값 교체
            root.right = deleteNode(root.right, successor.val); // 중복 제거
        }
        return root;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
