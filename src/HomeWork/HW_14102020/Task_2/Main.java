package HomeWork.HW_14102020.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Ball ball = new Ball(1);
        Cylindr cylindr = new Cylindr(1, 2);
        Pyramid pyramid = new Pyramid(3, 1);
        Box box = new Box(20);
        double boxvolume = box.getVolume();
        int quantityball = 0, quantitycylindr = 0, quantitypyramid = 0, counter = 0;
        System.out.println("для добавления пирамиды введите 1\n" +
                "для добавления цилиндра введите 2\n" +
                "для добавления шара введите 3\n" +
                "для выхода введите 0");
        while (flag) {
            System.out.println("Свободный объем коробки: " + boxvolume);
            int nn = inputChoise();
            switch (nn) {
                case 1:
                    if (isVolume(boxvolume, pyramid.calculateVolume())) {
                        boxvolume = addVolume(boxvolume, pyramid.calculateVolume());
                        quantitypyramid++;
                        System.out.println("Пирамида добавлени, давай еще!");
                    } else {
                        counter++;
                        flag = message(counter, "Пирамида");
                    }
                    break;
                case 2:
                    if (isVolume(boxvolume, cylindr.calculateVolume())) {
                        boxvolume = addVolume(boxvolume, cylindr.calculateVolume());
                        quantitycylindr++;
                        System.out.println("Цилиндр добавлен, давай еще!");
                    } else {
                        counter++;
                        flag = message(counter, "Цилиндр");
                    }
                    break;
                case 3:
                    if (isVolume(boxvolume, ball.calculateVolume())) {
                        boxvolume = addVolume(boxvolume, ball.calculateVolume());
                        quantityball++;
                        System.out.println("Шар добавлен, давай еще!");
                    } else {
                        counter++;
                        flag = message(counter, "Шар");
                    }
                    break;
                default:
                    flag = false;
            }
        }
        System.out.println("Количество пирамид в коробке " + quantitypyramid +
                "\nКоличество цилиндров в коробке " + quantitycylindr +
                "\nКоличество шаров в коробке " + quantityball);
    }

    public static boolean isVolume(double maxvol, double advol) {
        return (maxvol > advol) ? true : false;
    }

    public static double addVolume(double maxvol, double advol) {
        return maxvol - advol;
    }

    public static int inputChoise() {
        Scanner scann = new Scanner(System.in);
        while (!scann.hasNextInt()) {
            System.out.print("Это не целое числло! Попробуй еще раз! ");
            scann.next();
        }
        return scann.nextInt();
    }

    public static boolean message(int count, String figure) {
        if (count > 3) {
            System.out.println("Все по ходу в коробку больше ничего не влезет!");
            return false;
        } else {
            System.out.println(figure + " уже не лезет в коробку, попробуй что нибудь другое!");
            return true;
        }
    }
}
