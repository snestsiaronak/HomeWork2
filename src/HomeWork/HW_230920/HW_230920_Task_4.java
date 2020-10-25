package HomeWork;

import java.util.Arrays;

public class HW_230920_Task_4 {
    public static void main(String[] args) {
        //Задача про вектор
        System.out.println("Массивы!");
        System.out.println("Одномерные!");
        System.out.println("Задача про вектор");
        double[] vector = {21.1, 0.5, 1, -12, 4.8, -14, 18};
        double minv = 0, maxv = 0, summ = 0, multiply = 1;
        int min_i = 0, max_i = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0) {
                summ += vector[i];
            }
            if (vector[i] > maxv) {
                maxv = vector[i];
                max_i = i;
            }
            if (vector[i] < minv) {
                minv = vector[i];
                min_i = i;
            }
        }
        if (max_i > min_i) {
            for (int j = min_i + 1; j < max_i; j++) {
                multiply *= vector[j];
            }
        } else {
            for (int j = max_i + 1; j < min_i; j++) {
                multiply *= vector[j];
            }
        }
        System.out.println("Вектор!");
        System.out.println(Arrays.toString(vector));
        System.out.println("Сумма отрицательных значений = " + summ);
        System.out.println("Произведение значений между максимальным и минимальным = " + multiply);
    }
}
