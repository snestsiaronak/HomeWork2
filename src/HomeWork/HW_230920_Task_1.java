package HomeWork;

import java.util.Scanner;

public class HW_230920_Task_1 {
    public static void main(String[] args) {
        //Задача про прямоугольник и круг

        double a, b, r;
        System.out.println("Задача о вписанном прямоугольнике!");
        System.out.print("Введите сторону а: ");
        a = checkNumber();
        System.out.print("Введите сторону b: ");
        b = checkNumber();
        System.out.print("Введите радиус r: ");
        r = checkNumber();
        double diagonal = Math.sqrt(a * a + b * b);
        if (r * 2 >= diagonal) {
            System.out.println("Закрыть можно!");
        } else {
            System.out.println("Закрыть Нельзя!");
        }
    }
    static double checkNumber(){
        Scanner vvod = new Scanner(System.in);
        while (!vvod.hasNextDouble()) {
            System.out.print("Это не числло! Попробуй еще раз! ");
            vvod.next();
        }
        return vvod.nextDouble();
    }
}
