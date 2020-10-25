package HomeWork;
import java.util.Arrays;
import java.util.Random;

public class HW_230920_Task_5 {
    public static void main(String[] args) {
        int m1 = 100, m2 = 0;
        Random random = new Random();
        //Задача о случайном массиве и его сортировке
        System.out.println("Массивы!");
        System.out.println("Одномерные!");
        System.out.println("Случайный массив и сортировка пузырьком!");
        int[] arrp = new int[20];
        for (int i = 0; i < arrp.length; i++) {
            arrp[i] = random.nextInt(m1 - m2) + m2;
        }
        System.out.println("Не отсортированный массив");
        System.out.println(Arrays.toString(arrp));
        System.out.println("Отсортированный массив");
        for (int i = 0; i < arrp.length - 1; i++) {
            for (int j = arrp.length - 1; j > i; j--) {
                if (arrp[j] < arrp[j - 1]) {
                    int tmp = arrp[j];
                    arrp[j] = arrp[j - 1];
                    arrp[j - 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arrp));
    }
}
