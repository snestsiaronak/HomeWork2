package HomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_300920_Task_4 {
    public static void main(String[] args) {
//Задача о массиве случайных чисел
        Random random = new Random();
        System.out.println("Задача о массиве случайных чисел!");
        int n = readnum(), m = 0;
        int[] first_array = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            first_array[i] = random.nextInt(n - m) + m;
            if (first_array[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Сгенерированный массив:");
        System.out.println(Arrays.toString(first_array));
        int[] second_array = new int[counter];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (first_array[i] % 2 == 0) {
                second_array[j] = first_array[i];
                j++;
            }
        }
        System.out.println("Преобразованный массив:");
        System.out.println(Arrays.toString(second_array));
    }
    static int readnum() {
        int rez = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число больше 3 ");
        while (!scan.hasNextInt()) {
            System.out.print("Это не числло! Попробуй еще раз! ");
            scan.next();
        }
        rez = scan.nextInt();
        if (rez <= 3) {
            System.out.print("Число меньше 3! Попробуй еще раз! ");
            return readnum();
        } else {
            return rez;
        }
    }
}
