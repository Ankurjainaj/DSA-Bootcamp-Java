package com.Ankur.LeetCode.DailyProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumTimeToCollectApples {
    //https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree
    public static void main(String[] args) {
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}};
        List<Boolean> hasApple = List.of(false, false, true, false, true, true, false);
        System.out.println(minTime(7, edges, hasApple));
    }

    public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {

        Map<Integer, List<Integer>> graph = createGraph(edges); // to store the graph
        Map<Integer, Boolean> visited = new HashMap<>();

        return dfs(graph, 0, hasApple, 0, visited); // cost of reaching the root is 0. For all others, its 2.

    }

    private static int dfs(Map<Integer, List<Integer>> graph, int node, List<Boolean> hasApple, int myCost, Map<Integer, Boolean> visited) {
        Boolean v = visited.getOrDefault(node, false);
        if (v)
            return 0;
        visited.put(node, true);

        int childrenCost = 0; // cost of traversing all children.

        for (int n : graph.getOrDefault(node, new ArrayList<>())) {
            childrenCost += dfs(graph, n, hasApple, 2, visited); // check recursively for all apples in subtrees.
        }

        if (childrenCost == 0 && hasApple.get(node) == false) {
            // If no child has apples, then we won't traverse the subtree, so cost will be zero.
            // similarly, if current node also does not have the apple, we won't traverse this branch at all, so cost will be zero.
            return 0;
        }

        return childrenCost + myCost;
    }

    private static Map<Integer, List<Integer>> createGraph(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] edge : edges) {
            List<Integer> list = graph.getOrDefault(edge[0], new ArrayList<>()); // Adjecency list representation.
            list.add(edge[1]);
            graph.put(edge[0], list);

            list = graph.getOrDefault(edge[1], new ArrayList<>()); // Adjecency list representation.
            list.add(edge[0]);
            graph.put(edge[1], list);
        }

        return graph;
    }
}
