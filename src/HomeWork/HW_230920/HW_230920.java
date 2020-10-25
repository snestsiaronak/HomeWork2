package HomeWork;
import java.util.Scanner;

public class HW_230920 {
    public static void main(String[] args) {
        //Задача про прямоугольник и круг
        Scanner vvod = new Scanner(System.in);

        double a, b, r;
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
        if (r * 2 >= diagonal) {
            System.out.println("Закрыть можно!");
        } else {
            System.out.println("Закрыть Нельзя!");
        }
    }
}
