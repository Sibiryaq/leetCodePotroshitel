package ru.example.sibiryaq.solutions;

import java.util.Arrays;

public class IncrementBigNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(increment(new int[]{1, 2, 3, 9})));
    }

    /**
     * @param source - массив с целыми числами от 0 до 9,
     *
     * @return - массив предоставляющий число на 1 больше исходного
     * например для [1, 2, 3, 4] ->   [1, 2, 3, 5]
     */
    public static  int[] increment(int[] source) {
       if (source[source.length - 1] < 9) { // если 8 или меньше нам не нужно будет увеличивать размер массива
           source[source.length - 1] += 1;
       } else {
           int[] sourcePlusOne = new int[source.length + 1]; // если больше то нам понадобится на 1 больше чем исходный

           System.arraycopy(source, 0, sourcePlusOne, 0, source.length); // копируем элементы старого массива в новый
           sourcePlusOne[sourcePlusOne.length - 2] = 1;
           // предпоследний элемент присваиваем значений 1 , т.к. 9 + 1 = 10
           // а последний элемент трогать не нужно т.к. он проинициализирован 0

           return sourcePlusOne; // возвращаем новый массив если число больше 9
       }

        return source; // возвращаем старый массив, но с увеличинным на 1 числом
    }
}
