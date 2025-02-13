package ru.example.sibiryaq.selfcheck;

import java.util.HashMap;
import java.util.Map;

public class Foo {
    private int i;

    public Foo(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Map<Foo, Object> map = new HashMap<>();
        map.put(new Foo(1), null);
        map.put(new Foo(2), null);
        map.put(new Foo(1), null);
        System.out.println(map.size()); // 3  т.к. 
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return -1;
    }
}
