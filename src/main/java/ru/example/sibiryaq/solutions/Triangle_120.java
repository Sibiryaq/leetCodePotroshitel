package ru.example.sibiryaq.solutions;

import java.util.Arrays;
import java.util.List;

public class Triangle_120 {
    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
                List.of(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );

        System.out.println(minimumTotal(triangle)); // 11 = 2+3+5+1
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();

        int[][] dp = new int[size][size];  // Создаем массив dp с правильными размерами

        for (int j = 0; j < size; j++) { // Копируем последний уровень треугольника в dp
            dp[size - 1][j] = triangle.get(size - 1).get(j);
        }

        for (int i = size - 2; i >= 0; i--) { // Заполняем dp таблицу снизу вверх
            for (int j = 0; j <= i; j++) {
                dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }
        return dp[0][0];
    }
}
