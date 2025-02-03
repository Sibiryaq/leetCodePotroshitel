package ru.example.sibiryaq.selfcheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalListIntersections_986 {
    public static void main(String[] args) {
        int[][] firstList = {
                {0, 2},
                {5, 10},
                {13, 23},
                {24, 25}
        };

        int[][] secondList = {
                {1, 5},
                {8, 12},
                {15, 24},
                {25, 26}
        };

        int[][] result = intervalIntersection(firstList, secondList);

        System.out.println("Intersection:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> intersections = new ArrayList<>();
        int i = 0, j = 0;

        while (i < firstList.length && j < secondList.length) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);

            if (start <= end) {
                intersections.add(new int[]{start, end});
            }

            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return intersections.toArray(new int[0][]);
    }
}
