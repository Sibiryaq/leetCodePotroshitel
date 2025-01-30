package ru.example.sibiryaq.solutions;

public class LongestPalindromicSubstring_5 {
    public static void main(String[] args) {

        String s1 = "babad";
        String s2 = "cbbd";
        System.out.println(longestPalindrome(s1)); // bab
        System.out.println(longestPalindrome(s2)); // bb
    }

    public static String longestPalindrome(String s) {
        // граничный случай, если строка из 1 элемента или из 0 - она палиндром
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0, 1);

        /*
        идем по всевозможным подстрокам
        внешний цикл - начальные индексы подстрок
        внутр - конечные идексы подстрок
         */
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                /*
                Если длина текущей подстроки больше maxLen
                и подстрока явл-ся палиндромом,
                то обновляются значения maxLen maxStr
                 */
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

    private static boolean isPalindrome(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }

}
