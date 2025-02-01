package ru.example.sibiryaq.solutions;

public class MinimumDeletionstoMakeStringBalanced_1653 {
    public static void main(String[] args) {
        System.out.println(minimumDeletions("aababbab"));
    }

    public static int minimumDeletions(String s) {
        int ans = 0;
        int count = 0;
        for (char x : s.toCharArray()) {
            if (x == 'b') {
                count += 1;
            } else if (count > 0) {
                ans += 1;
                count -= 1;
            }
        }
        return ans;
    }
}
