package ru.example.sibiryaq.solutions;

public class StringToInteger_8 {
    public static void main(String[] args) {

        System.out.println(myAtoi("42")); // 42
        System.out.println(myAtoi(" - 042")); //-42
        System.out.println(myAtoi("1337c0d3")); //1337
        System.out.println(myAtoi("0-1")); //0
        System.out.println(myAtoi("words and 987")); //0


    }



    public static int myAtoi(String s) {
        s = s.trim();

        if (s.isEmpty()) { //обработка граничного случая
            return 0;
        }

        int i = 0; // индекс с которого начинаем считывать число
        boolean negative = false;

        if (s.charAt(0) == '-') {
            negative = true;
            i++; // тогда считываем с 1 индекса, пропуская знак
        } else if (s.charAt(0) == '+') {
            i++; // тогда считываем с 1 индекса, пропуская знак
        }

        int result = 0;
        int maxDiv10 = Integer.MAX_VALUE / 10;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > maxDiv10 || (result == maxDiv10 && digit > 7)) {
                return (negative) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }

        return (negative) ? -result : result;

    }
}
