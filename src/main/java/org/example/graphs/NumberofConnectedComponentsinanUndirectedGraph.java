package org.example.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberofConnectedComponentsinanUndirectedGraph {

        public int countComponents(int n, int[][] edges){
            Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
            boolean[] seen = new boolean[n];
            int components = 0;

            //Since some of our nodes have the potential to not have any neighbors
            //We should initialize these potential nodes without any neighbors
            for(int i = 0; i< n; i++){
                adjacencyList.put(i, new ArrayList<>());
            }

            for(int[] edge: edges){
                int x = edge[0];
                int i = edge[1];

                adjacencyList.get(x).add(i);
                adjacencyList.get(i).add(x);
            }


            for(int i = 0; i < n; i++){
                if(!seen[i]){
                    components++;

                    //Scans all nodes in the current component - adds them to seen
                    dfs(adjacencyList, seen, i);
                }
            }

            return components;
        }

        public void dfs(Map<Integer, List<Integer>> adjList, boolean[] seen, int startNode){
            //Set current node as seen
            seen[startNode] = true;

            for(int i = 0; i < adjList.get(startNode).size(); i++) {
                if(!seen[adjList.get(startNode).get(i)]){
                    dfs(adjList, seen, adjList.get(startNode).get(i));
                }
            }
        }
}
