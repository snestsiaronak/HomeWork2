package HomeWork.HW_14102020.Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double degree = input();
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        celsiusConverter.convert(degree);
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        fahrenheitConverter.convert(degree);
        KelvinConverter kelvinConverter = new KelvinConverter();
        kelvinConverter.convert(degree);
    }

    public static double input() {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите чмсло: ");
        while (!vvod.hasNextDouble()) {
            System.out.print("Это не числло! Попробуй еще раз! ");
            vvod.next();
        }
        return vvod.nextDouble();
    }
}
