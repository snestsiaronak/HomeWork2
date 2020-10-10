package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    int sizeRAM;
    int sizeHDD;

    public Computer(String processor, int sizeRAM, int sizeHDD) {
        this.processor = processor;
        this.sizeRAM = sizeRAM;
        this.sizeHDD = sizeHDD;
    }

    public void printinfo(Computer comp) {
        System.out.println("Характеристики компьютера:");
        System.out.println("Процессор: " + comp.processor);
        System.out.printf("Объем оперативной памяти %d GB \n", comp.sizeRAM);
        System.out.printf("Объем жесткого диска %d GB \n", comp.sizeHDD);
    }

    public int turnOnOf(int status) {
        int n = 1, m = 0, rez = 10;
        Random random = new Random();
        int ident = -1;
        ident = readnum();
        boolean tmp = random.nextBoolean();
        int rdmnumber;
        rdmnumber = tmp ? 1 : 0;
        switch (status) {
            case 0:
                if (ident == rdmnumber) {
                    rez = 1;
                } else {
                    rez = -1;
                }
                break;
            case 1:
                if (ident == rdmnumber) {
                    rez = 0;
                } else {
                    rez = -1;
                }
                break;
            case -1:
                rez = -1;
                break;
            default:
                rez = status;
                break;
        }
        return rez;
    }

    private int readnum() {
        int rez = -1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1 либо 0 ");
        while (!scan.hasNextInt()) {
            System.out.print("Это не числло! Попробуй еще раз! ");
            scan.next();
        }
        rez = scan.nextInt();
        if (rez == 1 || rez == 0) {
            return rez;
        } else {
            System.out.print("Число не 0 и не 1. Попробуй еще раз! ");
            return readnum();
        }
    }
}
