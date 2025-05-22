package org.example.graphs;

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

    //Visited needs to be instantiated outside of the recursion call stack
    //Since in every iteration we're accessing the map to check if an OG is already tied to a clone
    Map<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node){

        if(node == null){
            return null;
        }

        if(visited.containsKey(node)){

            return visited.get(node);
        }


        Node clone = new Node(node.val, new ArrayList<>());

        visited.put(node, clone);

        for(Node neighbor: node.neighbors){
            clone.neighbors.add(cloneGraph(neighbor));
        }

        //We got to remember to return the clone in every iteration - since it's returning a clone to add
        //To the originals clone neighbors
        return clone;
    }
}
