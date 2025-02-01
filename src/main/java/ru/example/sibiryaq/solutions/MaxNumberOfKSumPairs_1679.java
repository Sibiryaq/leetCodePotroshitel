package ru.example.sibiryaq.solutions;

import java.util.Arrays;

public class MaxNumberOfKSumPairs_1679 {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1, 2, 3, 4}, 5)); // [2,3] [] 2 operations
        System.out.println(maxOperations(new int[]{3, 1, 3, 4, 3}, 6)); // [1,4,3] 1 operation
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i] + nums[j];
            if (temp == k) {
                i++;
                j--;
                ans++;
            } else if (temp > k) {
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }
}
