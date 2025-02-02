package ru.example.sibiryaq.selfcheck;

public class ReverseWordsInAString_151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue")); //blue is sky the
        System.out.println(reverseWords("  hello world  ")); //world hello
        System.out.println(reverseWords("a good   example"));//  example good a

    }

    public static String reverseWords(String s) {
        s = s.trim(); // обрезали пробелы по краям
        String[] words = s.split("\\s+"); // засплитили слова по пробелам

        StringBuilder reversed = new StringBuilder(); // создали билдер для хранения

        for (int i = words.length - 1; i >= 0; i--) { // в обратном порядке прошлись по массиву и добавили слова
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // и если это не последнее слово, добавили пробел перед ним
            }
        }

        return reversed.toString(); // вернули билдер
    }

}
