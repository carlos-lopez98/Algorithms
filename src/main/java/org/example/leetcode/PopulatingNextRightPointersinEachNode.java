package org.example.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {


//Node implentation will be provided - make sure to change this as variable names may be different
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

        //Need our queue like usual in BFS
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        //Iteration - while queue is not empty
        while(!queue.isEmpty()){

            //Get's the size for our current level or breadth
            int nodesInLevel = queue.size();

            //Iterates through our level
            for(int i = 0; i < nodesInLevel; i++){
                Node curr = queue.poll();

                //At the last element in our level
                //We set next equal to null
                if(i == nodesInLevel - 1){
                    curr.next = null;
                }else{
                    //if not we set next equal to the next element in our queue
                    //ensure we don't pop() as that will break our algorithm
                    curr.next = queue.peek();
                }

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
