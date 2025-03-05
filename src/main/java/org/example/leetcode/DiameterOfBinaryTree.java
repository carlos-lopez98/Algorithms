package org.example.leetcode;

import jdk.incubator.vector.VectorOperators;
import org.example.trees.BinarySearchTreeNode;

/**
 * Given the root of a binary tree, return the length of the diameter of the tree.
 *
 * The diameter of a binary tree is the length of the longest path
 * between any two nodes in a tree. This path may or may not pass through the root.
 *
 * The length of a path between two nodes is represented by the number of edges between them.
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [1, 104].
 * -100 <= Node.val <= 100
 */

public class DiameterOfBinaryTree {
    public static int diameter = 0;

    public static int diameterOfBinaryTree (BinarySearchTreeNode root){
        recursiveCall(root);

        return diameter;
    }

    public static int recursiveCall(BinarySearchTreeNode node){
        if(node == null){
            return 0;
        }

        //Recursively reaches down left subtree
        int leftDepth = recursiveCall(node.getLeftChild());

        //Recursively reaches down right subtree
        int rightDepth = recursiveCall(node.getRightChild());

        //This is the diameter at the current node = left + right
        int currentDiameter = leftDepth + rightDepth;

        diameter = Math.max(diameter, currentDiameter);

        //Returns 1 for the left most node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
