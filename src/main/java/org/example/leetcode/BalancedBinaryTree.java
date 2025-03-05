package org.example.leetcode;

import org.example.trees.BinarySearchTreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 */
public class BalancedBinaryTree {


    public static boolean isBalanced(BinarySearchTreeNode node) {

        //If calculate height == -1, this returns false
        //If it doesn't equal -1, it'll return true
        return calculateHeight(node) != -1;
    }

    public static int calculateHeight (BinarySearchTreeNode node){
        //Base case
        if (node == null) return 0;

        //Calculate height left
        int leftHeight = calculateHeight(node.getLeftChild());

        //Terminates the calculation early
        if(leftHeight == -1) return -1;

        //Calculate height right
        int rightHeight = calculateHeight(node.getRightChild());

        //Terminates the calculation early
        if(rightHeight == -1) return -1;

        //Calculate height difference if > 1 return -1 -> handle -1 in parent method by returning false

        if(Math.abs(leftHeight - rightHeight) > 1) return -1;

        //Returns longest height either left or right, then adds one for the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
