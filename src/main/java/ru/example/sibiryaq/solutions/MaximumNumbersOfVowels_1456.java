package ru.example.sibiryaq.solutions;

public class MaximumNumbersOfVowels_1456 {
    public boolean isVowel(char s) {
        return (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u');
    }
    public int maxVowels(String s, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) max++;
        }
        int ans = max, len = s.length();
        for (int i = k; i < len; i++) {
            if (isVowel(s.charAt(i))) max++;
            if (isVowel(s.charAt(i - k))) max--;
            if (ans < max) ans = max;
        }
        return ans;
    }
}
