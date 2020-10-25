package HomeWork;
import java.util.Random;
import java.util.Scanner;

public class HW_230920_Task_6 {
    public static void main(String[] args) {
        //Задача о конверсии двумерного массива
        Scanner vvod = new Scanner(System.in);
        int m1 = 100, m2 = 0;
        Random random = new Random();
        System.out.println("Массивы!");
        System.out.println("Двумерные!");
        System.out.println("Задача о конверсии двумерного массива");
        System.out.print("Введите размерность массива: ");
        while (!vvod.hasNextInt()) {
            System.out.print("Это не целое числло! Попробуй еще раз! ");
            vvod.next();
        }
        int n = vvod.nextInt();
        int[][] arr2 = new int[n][n];
        System.out.println("Исходный массив");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = random.nextInt(m1 - m2) + m2;
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Измененный массив");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr2[i][j] % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}
