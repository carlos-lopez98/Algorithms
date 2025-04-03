package org.example.leetcode;

import org.w3c.dom.Node;

import java.util.*;

public class CloneGraph {

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }


    //The intuition here is to create a clone of your starting node
    //Then add that clone in as a value in your hashmap with the key being your actual node
    //Then we iterate through each neighbor in the original node -


    Map<Node, Node> visited = new HashMap<>();
    public Node cloneGraph(Node node){
        //This is a recursive problem so we have base cases
        if(node == null){
            return null;
        }

        //This visited is used to store cloned copies of the original node
        if(visited.containsKey(node)){
            //Returns the copy of the node
            return visited.get(node);
        }

        //We can't just add the neighbors in as a list
        //That would create a reference copy
        Node clone = new Node(node.val, new ArrayList<>());
        //Ties the original to it's clone
        visited.put(node, clone);

        //Iterate through all the original neighbors
        for(Node neighbor: node.neighbors){

            //Add clones the the clone neighbors list
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }
}
