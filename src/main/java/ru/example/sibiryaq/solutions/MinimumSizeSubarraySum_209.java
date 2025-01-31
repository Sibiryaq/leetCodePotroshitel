package ru.example.sibiryaq.solutions;

public class MinimumSizeSubarraySum_209 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3})); //2  (4+3)
        System.out.println(minSubArrayLen(4, new int[]{1, 4, 4})); // 1 (4)
        System.out.println(minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1})); //0
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int count = 0;
        int max = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count < target) {
                count += nums[i];
            }
            if (count >= target) {
                while (count >= target && j < nums.length) {
                    count -= nums[j];
                    j++;
                }
                max = Math.min(max, i + 2 - j);
            }
        }
        return max == Integer.MAX_VALUE ? 0 : max;
    }
}
