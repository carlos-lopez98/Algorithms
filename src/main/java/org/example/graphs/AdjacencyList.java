package org.example.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyList {

    //#1 Undirected Graph AdjacencyList
    public Map<Integer, List<Integer>> createAdjacencyList(int[][] edges){
        HashMap<Integer, List<Integer>> adjacencyList = new HashMap<>();

        for(int[] edge: edges){
            int x = edge[0];
            int j = edge[1];

            adjacencyList.computeIfAbsent(x, value -> new ArrayList<>()).add(j);
            adjacencyList.computeIfAbsent(j, value -> new ArrayList<>()).add(x);
        }
        return adjacencyList;
    }

    //#2 Directed AdjacencyList
    public Map<Integer, List<Integer>> createDirectAdjacencyList(int[][] edges){
        HashMap<Integer, List<Integer>> adjacencyList = new HashMap<>();

        for(int[] edge: edges){
            int x = edge[0];
            int j = edge[1];

            adjacencyList.computeIfAbsent(x, value -> new ArrayList<>()).add(j);
        }
        return adjacencyList;
    }

    //#3 Undirected graph with five nodes, but 5th node is isolated
    public Map<Integer, List<Integer>> createIsolatedNodeAdjacencyList(int[][] edges, int n){
        HashMap<Integer, List<Integer>> adjacencyList = new HashMap<>();

        //When you need to account for isolated nodes - just initialize all the node first before
        //Adding in the list of neighbors
        for(int i = 0; i < n; i++){
            adjacencyList.put(i, new ArrayList<>());
        }


        for(int[] edge : edges){
            int x = edge[0];
            int j = edge[1];

            adjacencyList.computeIfAbsent(x, value -> new ArrayList<>()).add(j);
            adjacencyList.computeIfAbsent(j, value -> new ArrayList<>()).add(x);
        }

        return adjacencyList;
    }

    //#4 create an adjacency list for a weighted edges
    class Edge{
        int neighbor;
        int weight;

        public Edge(int neighbor, int weight){
            this.neighbor = neighbor;
            this.weight = weight;
        }
    }

    public Map<Integer, List<Edge>> createWeightedAdjacencyList(int[][] edges){
        HashMap<Integer, List<Edge>> adjacencyList = new HashMap<>();


        for(int[] edge : edges){
            int x = edge[0];
            Edge curr = new Edge(edge[0], edge[1]);

            adjacencyList.computeIfAbsent(x, value -> new ArrayList<>()).add(curr);
        }

        return adjacencyList;
    }

    //#5 When the edges are represented by strings - directed graph
    public Map<String, List<String>> createStringAdjacencyList(String[][] edges){
     Map<String, List<String>> adjacencyList = new HashMap<>();

     for(String[] edge: edges){
         String x = edge[0];
         String s = edge[1];

         adjacencyList.computeIfAbsent(x, value -> new ArrayList<>()).add(s);
         adjacencyList.computeIfAbsent(s, value -> new ArrayList<>()).add(x);
     }

        return adjacencyList;
    }
}
