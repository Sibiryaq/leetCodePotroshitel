package ru.example.sibiryaq.selfcheck;

public class StringCompression_443 {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println(compress(new char[]{'a'}));
        System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }


    public static int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < chars.length; ) {
            char c = chars[i];
            int cnt = 1;
            while (i + 1 < chars.length && c == chars[i + 1]) {
                i++;
                cnt++;
            }
            str.append(c);
            if (cnt > 1) {
                str.append(cnt);
            }
            i++;
        }
        char[] comp = str.toString().toCharArray();
        for(int i=0;i<comp.length;i++){
            chars[i]=comp[i];
        }
        return comp.length;
    }

}
