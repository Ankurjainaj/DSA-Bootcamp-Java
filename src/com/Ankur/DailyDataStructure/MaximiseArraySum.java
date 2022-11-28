package com.Ankur.DailyDataStructure;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaximiseArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(maximiseArray(arr, k));
    }

    public static int maximiseArray(int[] arr, int k) {
        PriorityQueue<Integer> pq = Arrays.stream(arr).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        while (k-- > 0) {
            int a = pq.poll();
            a *= -1;
            pq.add(a);
        }
        int sum = 0;
        for (Integer i : pq)
            sum += i;
        return sum;
    }
}
