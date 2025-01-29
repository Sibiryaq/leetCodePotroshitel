package ru.example.sibiryaq.solutions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntersectionOfTwoArrays_349 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection2(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        for (int num : nums1) {
            if (!list1.contains(num)) {
                list1.add(num);
            }
        }

        for (int num : nums2) {
            if (!list2.contains(num)) {
                list2.add(num);
            }
        }

        for (int num : list1) {
            if (list2.contains(num)) {
                result.add(num);
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> intersection = new HashSet<>();

        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;


    }

    public static int[] intersection3(int[] nums1, int[] nums2) {
        return IntStream.of(nums2)
                .distinct()
                .filter(IntStream.of(nums1).boxed().collect(Collectors.toSet())::contains)
                .toArray();
    }
}
