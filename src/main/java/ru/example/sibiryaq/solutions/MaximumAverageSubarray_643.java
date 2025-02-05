package ru.example.sibiryaq.solutions;

public class MaximumAverageSubarray_643 {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};

        findMaxAverage(nums, 4);
    }

    public static double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        } // посчитали сумму первых 4ех элементов

        maxSum = currentSum; // обновили максимум

        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i]; // берем попарно следующие k элементов
            // вычитаем предыдущее значение и прибавляем следующее
            if (currentSum > maxSum) {
                maxSum = currentSum; // если мы получили большее число, обновляем максимум
            }
        }

        return (double)maxSum/k; // кастим до double чтобы не потерять часть после запятой
    }
}
