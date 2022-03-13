package hw4;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        //Задать массив.
        // Отрицательные элементы массива перенести в новый массив.
        // Размер массива должен быть равен количеству отрицательных элементов.

        int[] inst6 = new int[8];
        for (int i = 0; i < inst6.length; i++) {
            inst6[i] = (int) (-2 + (Math.random() * 5));
        }
        System.out.println("Основной массив " + Arrays.toString(inst6));
    }
}