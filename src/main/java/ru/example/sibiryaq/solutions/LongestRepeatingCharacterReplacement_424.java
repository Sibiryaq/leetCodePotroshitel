package ru.example.sibiryaq.solutions;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement_424 {




    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freqs = new HashMap<>();

        int result = 0; // максималньая длина подстроки, которую можно получить после выполнения операций
        int i = 0; // левый указатель окна
        int maxFreq = 0; // будет хранить максимальную частоту символа в текущем окне

        for (int j = 0; j< s.length(); j++) {
            char currentChar = s.charAt(j);
            freqs.put(currentChar, freqs.getOrDefault(currentChar, 0) + 1);
            maxFreq = Math.max(maxFreq, freqs.get(currentChar));

            while ((j - i + 1) - maxFreq > k) {
                char left = s.charAt(i);
                freqs.put(left, freqs.get(left) - 1);
                i++;
            }

            result = Math.max(result, j - i + 1);
        }

        return result;
    }
}
