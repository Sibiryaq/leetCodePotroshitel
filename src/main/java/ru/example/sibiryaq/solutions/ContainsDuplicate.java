package ru.example.sibiryaq.solutions;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueInt = new HashSet<>();
        for (int num : nums) {
            if (!uniqueInt.add(num)) {
                // add вернёт false, если элемент уже есть
                return true;
            }
        }
        return false;
    }

}
