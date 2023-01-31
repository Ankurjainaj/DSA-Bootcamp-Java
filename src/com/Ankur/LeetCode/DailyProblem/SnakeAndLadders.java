package com.Ankur.LeetCode.DailyProblem;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeAndLadders {
    //https://leetcode.com/problems/snakes-and-ladders/

    public static void main(String[] args) {
        int[][] arr = new int[][]{{-1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1}, {-1, 35, -1, -1, 13, -1}, {-1, -1, -1, -1, -1, -1}, {-1, 15, -1, -1, -1, -1}};
        System.out.println(snakesAndLadders(arr));
    }

    // Simple BFS where from any square we only visit:
    // snakes or ladder (<= 6 squares away)
    // the furthest square without a snake or ladder ( <= 6 squares away)
    // there is nothing to be gained from visited unoccupied squares closer than the furthest unoccupied square.
    // even when just visiting the furthest square,
    // we are able to visit all available snakes and ladders on the board
    public static int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] a = new int[n * n];
        int i = n - 1, j = 0, index = 0, inc = 1;
        while (index < n * n) {
            a[index++] = board[i][j];
            if (inc == 1 && j == n - 1) {
                inc = -1;
                i--;
            } else if (inc == -1 && j == 0) {
                inc = 1;
                i--;
            } else {
                j += inc;
            }
        }
        boolean[] visited = new boolean[n * n];
        Queue<Integer> q = new LinkedList<>();
        int start = a[0] > -1 ? a[0] - 1 : 0;
        q.offer(start);
        visited[start] = true;
        int step = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int cur = q.poll();
                if (cur == n * n - 1) {
                    return step;
                }
                for (int next = cur + 1; next <= Math.min(cur + 6, n * n - 1); next++) {
                    int dest = a[next] > -1 ? a[next] - 1 : next;
                    if (!visited[dest]) {
                        visited[dest] = true;
                        q.offer(dest);
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
