package HomeWork;

import static java.lang.Math.pow;

public class Calculator {
    double x;
    double y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void summ(double a, double b) {
        System.out.println("Сумма чисел равна: " + (a + b));

    }

    public static void subtract(double a, double b) {
        System.out.println("Разность чисел равна: " + (a - b));

    }

    public static void multiply(double a, double b) {
        System.out.println("Произведение чисел равно: " + (a * b));

    }

    public static void divide(double a, double b) {
        if (b != 0) {
            System.out.println("Частное чисел равно: " + (a / b));
        } else {
            System.out.println("Incorrect divider!");
        }
    }

    public static void power(double a, double b) {
        System.out.println(a + " в степени " + b + " равно: " + pow(a, b));

    }
}
