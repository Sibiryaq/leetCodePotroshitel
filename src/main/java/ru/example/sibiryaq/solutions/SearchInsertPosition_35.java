package ru.example.sibiryaq.solutions;

import java.util.LinkedHashMap;
import java.util.Map;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>(16, 0.75F, false);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        if (map.containsKey(target)) {
            return map.get(target);
        } else {
            for (Integer elem : map.keySet()) {
                if (target < elem) {
                    return map.get(elem);
                }
            }
            return map.size();
        }
    }
}
