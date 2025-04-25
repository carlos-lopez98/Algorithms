package org.example.graphs;

import java.util.*;

public class NumberofConnectedComponentsinanUndirectedGraph {

        public int countComponents(int n, int[][] edges){
            Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
            boolean[] seen = new boolean[n];
            int components = 0;

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

                //Everytime we hit a new node that hasn't been visited
                //We basically got ourselves a new component
                if(!seen[i]){
                    components++;
                    BFS(adjacencyList, seen, i);
                }
            }

            return components;
        }

        //OUR DFS and BFS algorithms are marking all the nodes within the same component as visited

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
