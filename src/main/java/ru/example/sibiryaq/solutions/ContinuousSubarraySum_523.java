package ru.example.sibiryaq.solutions;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum_523 {
    public static void main(String[] args) {
        checkSubarraySum(new int[] {23,2,4,6,7},6); //true [2, 4] is a continuous subarray of size 2 whose elements sum up to 6
        checkSubarraySum(new int[] {23,2,6,4,7},6); // true [23, 2, 6, 4, 7] is an continuous subarray of size 5
        // whose elements sum up to 42. 42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer
        checkSubarraySum(new int[] {23,2,4,6,7},13); // false
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        // Хеш-таблица для хранения остатков и их индексов
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); // Начальное значение для случая, когда сумма делится на k

        int runningSum = 0;

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];

            // Если k равно 0, то любая сумма будет делиться на k
            if (k == 0) {
                return nums.length > 1;
            }

            int remainder = runningSum % k;

            // Если остаток уже встречался ранее
            if (remainderMap.containsKey(remainder)) {
                // Проверяем, что длина подмассива не меньше двух
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                // Сохраняем остаток и его индекс
                remainderMap.put(remainder, i);
            }
        }

        return false;
    }
}
