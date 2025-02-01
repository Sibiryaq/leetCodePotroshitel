package ru.example.sibiryaq.solutions;

public class ShiftingLetter_848 {
    public static void main(String[] args) {
        System.out.println(shiftingLetters("abc", new int[]{3, 5, 9}));
        System.out.println(shiftingLetters("aaa", new int[]{1, 2, 3}));
    }

    public static String shiftingLetters(String s, int[] shifts) {
        long maxi = 0;
        char[] chars = s.toCharArray();
        for (int i = shifts.length - 1; i >= 0; i--) {
            maxi += shifts[i];
            chars[i] = (char) ('a' + (chars[i] - 'a' + maxi) % 26);
        }
        return new String(chars);
    }
}
