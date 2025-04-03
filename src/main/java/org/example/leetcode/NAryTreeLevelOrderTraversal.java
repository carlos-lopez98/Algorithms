package org.example.leetcode;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class NAryTreeLevelOrderTraversal {

    class Node{
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root){
        if(root == null){
            return null;
        }

        Queue<Node> queue = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i < levelSize; i++){
                Node curr = queue.remove();
                currentLevel.add(curr.val);


                queue.addAll(curr.children);
            }

            result.add(new ArrayList<>(currentLevel));
        }

        return result;
    }
}
