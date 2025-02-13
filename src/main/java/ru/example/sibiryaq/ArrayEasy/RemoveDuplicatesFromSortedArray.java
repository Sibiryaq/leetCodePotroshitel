package ru.example.sibiryaq.ArrayEasy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;
        for (int i = 1; i < nums.length;i++){
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k += 1;
            }
        }

        return k;
    }

}

