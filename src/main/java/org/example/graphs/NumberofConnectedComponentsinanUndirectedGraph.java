package org.example.graphs;

import java.util.*;

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


            //Since we have our nodes n when we start - we must iterate through n to make sure we reach each component
            for(int i = 0; i < n; i++){
                if(!seen[i]){
                    components++;

                    //Scans all nodes in the current component - adds them to seen
                    BFS(adjacencyList, seen, i);
                }
            }

            return components;
        }

        //Each component is iterated over using DFS
        public void dfs(Map<Integer, List<Integer>> adjList, boolean[] seen, int startNode){
            //Set current node as seen
            seen[startNode] = true;

            for(int i = 0 ; i < adjList.get(startNode).size(); i++){
                int curr = adjList.get(startNode).get(i);

                //If current isn't in the visited list - run dfs on the curr node
                if (!seen[curr]){
                    dfs(adjList,seen, curr);
                }
            }
        }


        //Only difference in this approach is that each component is iterated over using BFS
        public void BFS(Map<Integer, List<Integer>> adjList, boolean[] seen, int startNode){

            Queue<Integer> queue = new LinkedList<>();
            queue.add(startNode);

            while(!queue.isEmpty()){
                int curr = queue.poll();

                //This won't be able to add unconnected components
                for(int neighbor: adjList.get(curr)){
                    if(!seen[neighbor]){
                        seen[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
        }
}
