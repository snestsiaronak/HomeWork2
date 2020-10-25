package HomeWork;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class HW_23_09_2020 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        boolean flag = true;
        //Создаем обратную связь для общения с пользователем

        System.out.println("Если вы хотите проверить решение задачи:");
        System.out.println("Про прямоугольник и круг - введите 1");
        System.out.println("Про дни недели - введите 2");
        System.out.println("Про вывод звездочек - введите 3");
        System.out.println("Про вектор - введите 4");
        System.out.println("Про случайный массив и его сортировку - введите 5");
        System.out.println("Про двумерный массив и его конверсию - введите 6");
        System.out.println("Про произвольный зубчатый двумерный массив - введите 7");
        System.out.println("Покинуть программу - введите 0 или любое другое");
        System.out.println();
        while (flag) {

            System.out.print("Введите число: ");
            while (!vvod.hasNextInt()) {
                System.out.print("Это не целое числло! Попробуй еще раз! ");
                vvod.next();
            }
            int ident = vvod.nextInt();
            double a, b, r;
            int min = 1;
            int max = 10;
            int m1 = 100, m2 = 0;
            Random random = new Random();
            switch (ident) {
                case 1:
                    //Задача про прямоугольник и круг
                    System.out.println("Задача о вписанном прямоугольнике!");
                    System.out.print("Введите сторону а: ");
                    while (!vvod.hasNextDouble()) {
                        System.out.print("Это не числло! Попробуй еще раз! ");
                        vvod.next();
                    }
                    a = vvod.nextDouble();
                    System.out.print("Введите сторону b: ");
                    while (!vvod.hasNextDouble()) {
                        System.out.print("Это не числло! Попробуй еще раз! ");
                        vvod.next();
                    }
                    b = vvod.nextDouble();
                    System.out.print("Введите радиус r: ");
                    while (!vvod.hasNextDouble()) {
                        System.out.print("Это не числло! Попробуй еще раз! ");
                        vvod.next();
                    }
                    r = vvod.nextDouble();
                    double diagonal = Math.sqrt(a * a + b * b);
                    if (r >= diagonal) {
                        System.out.println("Закрыть можно!");
                    } else {
                        System.out.println("Закрыть Нельзя!");
                    }
                    break;
                case 2:
                    //Задача о днях недели
                    System.out.println("Задача о днях недели!");

                    int day = random.nextInt(max - min) + min;
                    switch (day) {
                        case 1:
                            System.out.println("Выбран понедельник!");
                            break;
                        case 2:
                            System.out.println("Выбран вторник!");
                            break;
                        case 3:
                            System.out.println("Выбрана среда!");
                            break;
                        case 4:
                            System.out.println("Выбран четверг!");
                            break;
                        case 5:
                            System.out.println("Выбрана пятница!");
                            break;
                        case 6:
                            System.out.println("Выбрана суббота!");
                            break;
                        case 7:
                            System.out.println("Выбрано воскресенье!");
                            break;
                        default:
                            System.out.println("Нет такого дня!");
                    }

                    break;
                case 3:
                    //Задача о выводе звездочек в консоль
                    System.out.println("Задача о выводе звездочек в консоль!");
                    char[][] array = new char[4][5];
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            array[i][j] = '*';
                            System.out.print(array[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    //Задача про вектор
                    System.out.println("Массивы!");
                    System.out.println("Одномерные!");
                    System.out.println("Задача про вектор");
                    double[] vector = {21.1, 0.5, 1, -12, 4.8, -14, 18};
                    double minv = 0, maxv = 0, summ = 0, proiz = 1;
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
                            proiz *= vector[j];
                        }
                    } else {
                        for (int j = max_i + 1; j < min_i; j++) {
                            proiz *= vector[j];
                        }
                    }
                    System.out.println("Вектор!");
                    System.out.println(Arrays.toString(vector));
                    System.out.println("Сумма отрицательных значений = " + summ);
                    System.out.println("Произведение значений между максимальным и минимальным = " + proiz);
                    break;
                case 5:
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

                    break;
                case 6:
                    //Задача о конверсии двумерного массива
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
                    break;
                case 7:
                    //Задача о произвольном зубчатом массиве
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
                    break;
                default:
                    flag = false;
            }
            System.out.println();
        }

    }
}
