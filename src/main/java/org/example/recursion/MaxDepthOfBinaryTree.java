package org.example.recursion;

public class MaxDepthOfBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {


        return Math.max(helper(root.left, 1), helper(root.right, 1));
    }

    int helper(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }

        depth += 1;

        return Math.max(helper(root.left, depth), helper(root.right, depth));
    }
}
