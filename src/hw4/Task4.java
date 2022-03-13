package hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        // Задан одномерный массив целых чисел.
        // Образуйте из него два отсортированных по возрастанию массива, содержащих четные и нечетные числа.


        int[] inst3 = new int[10];
        int [] inst4 = new int[10];
        int [] inst5 = new int[10];
        for (int i = 0; i < inst3.length; i++){
            inst3[i] = (int) (-5 + (Math.random() * 9));
            if (inst3[i] % 2 != 0){inst4[i] = inst3[i];}
            if (inst3[i] % 2 == 0 && inst3[i] != 0) {inst5[i] = inst3[i];}
        }
        System.out.println("Основной массив " + Arrays.toString(inst3));
        System.out.println("Нечетные числа массива " + Arrays.toString(inst4));
        System.out.println("Четные числа массива " + Arrays.toString(inst5));
    }
}
