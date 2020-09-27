package HomeWork;
import java.util.Random;

public class HW_230920_Task_7 {
    public static void main(String[] args) {
        //Задача о произвольном зубчатом массиве
        int min = 1;
        int max = 10;
        int m1 = 100, m2 = 0;
        Random random = new Random();
        System.out.println("Массивы!");
        System.out.println("Двумерные!");
        System.out.print("Зубчатый массив произвольный");
        System.out.println();
        int rang = random.nextInt(max - min) + min;
        int[][] arrzub = new int[rang][];
        for (int i = 0; i < arrzub.length; i++) {
            arrzub[i] = new int[random.nextInt(m1 - m2) + m2];
            for (int j = 0; j < arrzub[i].length; j++) {
                arrzub[i][j] = random.nextInt(m1 - m2) + m2;

                System.out.print(arrzub[i][j] + " ");
            }
            System.out.println();
        }
    }
}
