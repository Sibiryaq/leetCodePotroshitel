package ru.example.sibiryaq.solutions;

public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String reverse = new StringBuilder(number).reverse().toString();

        return number.equals(reverse);
    }
}
