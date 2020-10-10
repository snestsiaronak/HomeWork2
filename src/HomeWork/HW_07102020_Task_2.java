package HomeWork;

import java.util.Scanner;

public class HW_07102020_Task_2 {
    private static Scanner vvod;
    private static double x;
    private static double y;
    public static void main(String[] args) {
        vvod = new Scanner(System.in);
        System.out.print("Введите число x: ");
        x = inputnumber();
        System.out.print("Введите число y: ");
        y = inputnumber();
        Calculator.summ(x, y);
        Calculator.subtract(x, y);
        Calculator.multiply(x, y);
        Calculator.divide(x, y);
        Calculator.power(x, y);

    }
    public static double inputnumber() {
        while (!vvod.hasNextDouble()) {
            System.out.print("Это не  числло! Попробуй еще раз! ");
            vvod.next();
        }
        return vvod.nextDouble();
    }
}
