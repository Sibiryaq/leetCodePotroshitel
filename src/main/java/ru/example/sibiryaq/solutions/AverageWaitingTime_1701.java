package ru.example.sibiryaq.solutions;

public class AverageWaitingTime_1701 {
    public static void main(String[] args) {
        System.out.println(averageWaitingTime(new int[][]{{1, 2}, {2, 5}, {4, 3}}));
    }

    public static double averageWaitingTime(int[][] customers) {
        int currentTime = 0;
        long totalwaitTime = 0;  // Use long to avoid overflow

        for (int[] customer : customers) {
            int arrival = customer[0];
            int preparationTime = customer[1];

            if (currentTime < arrival) {
                currentTime = arrival;
            }

            int waitTime = currentTime + preparationTime - arrival;
            totalwaitTime += waitTime;

            currentTime += preparationTime;
        }

        return (double) totalwaitTime / customers.length;
    }
}
