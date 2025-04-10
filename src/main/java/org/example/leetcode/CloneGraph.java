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
    //The intuition here is to create a clone of every node - then use the original node as the key
    //If a clone has already been created - we return the cloned node - the input will always be a reference to an
    //original node
    Map<Node, Node> visited = new HashMap<>();

    //This is more like a cloneNode method
    public Node cloneGraph(Node node){

        if(node == null){
            return null;
        }

        if(visited.containsKey(node)){

            //If our node has already been cloned, then return its clone
            return visited.get(node);
        }

        //If not we make a clone
        Node clone = new Node(node.val, new ArrayList<>());

        //Add it to our clone list with the original as a key
        visited.put(node, clone);

        //Iterate through the original's children
        //Adding clones to our cloned copy
        for(Node neighbor: node.neighbors){
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }
}
