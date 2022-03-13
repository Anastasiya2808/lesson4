package hw4;

public class Task2 {
    public static void main(String[] args) {
        // Создайте массив из чётных чисел [2;20]
        // выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)

        int[] ints2 = { 2, 4 , 6 , 8 , 10 , 12 , 14 , 16 , 18 , 20 };
        for (int i = ints2.length - 1; i >= 0 ; i--){
            System.out.println(ints2[i]);
        }
    }
}
