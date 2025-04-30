package ru.example.sibiryaq.solutions;

public class RemoveElement_27 {
    public static void main(String[] args) {
        int[] nums = {1, 6, 3, 6, 5, 6};
        int val = 6;
        for (int e : nums) {
            System.out.print(nums[e - 1] + " "); // 1,6,3,6,5,6
        }
        System.out.println();
        System.out.println("Current size = " + removeElement(nums, val));


    }

    public static int removeElement(int[] nums, int val) {
        int k = 0; // count elements != val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k]= nums[i];
                k++;
            }
        }
        return k;

    }
}
