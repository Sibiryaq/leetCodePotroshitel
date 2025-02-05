package ru.example.sibiryaq.solutions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(input)); // 3 -> abc

        String input2 = "bbbbbbb";
        System.out.println(lengthOfLongestSubstring(input2)); //1 -> b

        String input3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(input3)); //3 -> wke
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> hm = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            while (hm.contains(s.charAt(i))) {
                hm.remove(s.charAt(left));
                left++;
            }
            hm.add(s.charAt(i));
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
