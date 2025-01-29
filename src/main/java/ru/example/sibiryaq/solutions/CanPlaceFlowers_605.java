package ru.example.sibiryaq.solutions;

public class CanPlaceFlowers_605 {
    public static void main(String[] args) {
        int[] massive1 = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(massive1, 1)); // true
        System.out.println(canPlaceFlowers(massive1, 2)); // false
    }


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) {
            return true;
        }
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                // flowerbed[i] == 0: Текущий участок пустой.
                // (i == 0 || flowerbed[i-1] == 0): Либо это первый участок, либо предыдущий участок пустой.
                // (i == flowerbed.length-1 || flowerbed[i+1] == 0): Либо это последний участок, либо следующий участок пустой.
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
