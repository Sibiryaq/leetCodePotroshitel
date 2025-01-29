package ru.example.sibiryaq.solutions;

public class MaxConsecituveOnes_485 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};  // 3 -> 1, 1, 1

        System.out.println(findMaxConsecutiveOnes(nums));

        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(nums2));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int currentMax = 0;
        int maxRow = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentMax++;
                if (currentMax > maxRow) {
                    maxRow = currentMax;
                }
            } else {
                currentMax = 0;
            }
        }

        return maxRow;
    }
}
