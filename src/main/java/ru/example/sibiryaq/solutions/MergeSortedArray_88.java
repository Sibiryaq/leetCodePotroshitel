package ru.example.sibiryaq.solutions;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};


        int[] nums2 = {4, 5, 6};


        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Указатели для прохода по nums1 и nums2
        int p1 = m - 1;
        int p2 = n - 1;
        // Указатель для заполнения nums1 с конца
        int p = m + n - 1;

        // Пока есть элементы в обоих массивах
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Если остались элементы в nums2, копируем их в nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }

    }


}
