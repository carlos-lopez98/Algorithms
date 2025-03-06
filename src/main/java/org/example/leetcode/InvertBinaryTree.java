package org.example.leetcode;

import org.example.trees.BinarySearchTreeNode;

/**
 * Given the root of a binary tree, invert the tree, and return its root.
 *
 * Example 1:
 * Input = [4,2,7,1,3,6,9]
 * Output = [4,7,2,9,6,3,1]
 */
public class InvertBinaryTree {


    public static BinarySearchTreeNode invertTree(BinarySearchTreeNode root){

        //Base Case
        if(root == null){
            return null;
        }

        //Creates temp new flipped pointers
        BinarySearchTreeNode left = root.getLeftChild();
        BinarySearchTreeNode right = root.getRightChild();

        root.setLeftChild(right);
        root.setRightChild(left);

        invertTree(root.getLeftChild());
        invertTree(root.getRightChild());

        return root;
    }
}
