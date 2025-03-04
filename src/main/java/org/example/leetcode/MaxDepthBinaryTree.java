package org.example.leetcode;

import org.example.trees.BinarySearchTreeNode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest
 * path from the root node down to the farthest leaf node.
 */
public class MaxDepthBinaryTree {

    public static int findDepth(BinarySearchTreeNode root){
        if(root == null){
            return 0;
        }

        Queue<BinarySearchTreeNode> depthQueue = new PriorityQueue<>();

        int height = 1;
        depthQueue.add(root);

        while(!depthQueue.isEmpty()){

            int currentLevelSize = depthQueue.size();

            for(int i = 0; i < currentLevelSize; i++){

                BinarySearchTreeNode current = depthQueue.remove();

                if(current.getLeftChild() != null){
                    depthQueue.add(current.getLeftChild());
                }

                if(current.getRightChild() != null){
                    depthQueue.add(current.getRightChild());
                }
            }

            height++;
        }

        return height;
    }
}
