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
    public Node cloneGraph(Node node){

        //First base case if we get an input of a null node
        if(node == null){
            return null;
        }

        //Second base case - if we already have a clone ready
        if(visited.containsKey(node)){
            return visited.get(node);
        }

       //Create the clone - here we create a clone - without any cloned children yet
        //This will be done within our for loop
        Node clone = new Node(node.val, new ArrayList<>());

        //We add our clone in as a value - while the original is added in as a key
        visited.put(node, clone);

        //Here we iterate through our neighbors
        //Then we add neighbors to our clone
        //By calling this cloneGraph DFS essentially
        for(Node neighbor: node.neighbors){

            //What will happen here is that a clone get's returned for every original neighbor
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }
}
