package hw4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        // Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
        // Определите какой элемент встречается в массиве чаще всего и выведите информацию об этом в консоль.
        // Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

        int a = 0;
        int b = 0;
        int c = 0;

        int[] inst3 = new int[11];
        for (int i = 0; i < inst3.length; i++) {
            inst3[i] = (int) (Math.random() * 3) - 1;
            System.out.println(inst3[i]);

                if (inst3[i] < 0) a++;
                if (inst3[i] == 0) b++;
                if (inst3[i] > 0) c++;

            if (i == inst3.length - 1) {
                if (a > b && a > c) System.out.println("Чаще встречается 0");
                if (b > a && b > c) System.out.println("Чаще встречается 1");
                if (c > a && c > b) System.out.println("Чаще встречается -1");
            }
        }
    }
}
