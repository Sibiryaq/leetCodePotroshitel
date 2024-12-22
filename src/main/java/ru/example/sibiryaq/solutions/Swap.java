package ru.example.sibiryaq.solutions;

public class Swap {

    /**
     * Свап местами 2ух элементов в массиве
     * @param arr массив любого типа
     * @param n1 индекс 1го элемента
     * @param n2 индекс 2го жлемента
     */
    public void swap(Object[] arr, int n1, int n2) {
        Object obj = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = obj;

    }
}
