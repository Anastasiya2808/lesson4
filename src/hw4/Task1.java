package hw4;

import java.lang.reflect.Array;

public class Task1 {
    public static void main(String[] args) {
        // Заполните массив на N элементов случайным целыми числами
        // выведете максимальное, минимальное и среднее значение

        int[] ints1 = {-2, -6, 8, 15};
        int minNum = 1;
        int maxNum = 1;
        int averageNum = 0;
        int sum;

        for (int elem:ints1) {
            if (minNum > elem) minNum = elem;
        }
        System.out.println(minNum);

        for (int elem1:ints1) {
            if (maxNum < elem1) maxNum = elem1;
        }
        System.out.println(maxNum);

        for (int elem: ints1) {
            if (averageNum < elem);
            averageNum += ints1[3]/ints1[3];
        }
        System.out.println(averageNum);
    }
}
