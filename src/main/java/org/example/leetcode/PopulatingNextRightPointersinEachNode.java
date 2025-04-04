package org.example.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {


    class Node{
        int val;
        Node left;
        Node right;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            this.val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }



    public Node connect(Node root){
        if(root == null){
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        //BFS using two loops
        //Outer while loop
        //Inner for loop iterating through the children at the current level
        while(!queue.isEmpty()){
            int nodesInLevel = queue.size();

            for(int i = 0; i < nodesInLevel; i++){
                Node curr = queue.poll();

                if(i == nodesInLevel - 1){
                    curr.next = null;
                }else{
                    curr.next = queue.peek();
                }

                //Make sure we add left and then right children into our queue
                //As that's the appropriate order
                if(curr.left != null){
                    queue.add(curr.left);
                }

                if(curr.right !=null){
                    queue.add(curr.right);
                }
            }
        }

        return root;
    }
}
