package HomeWork.HW_21102020.Task_4;

import java.util.Random;

public class Cars {
    private String mark;
    private double speed;
    private double price;

    public Cars(String mark, double speed, double price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }

    public Cars() {
        this.mark = "Unknown";
        this.speed = 0;
        this.price = 0;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() {
        int max = 20, min = 0, count = 0;
        Random random = new Random();
        boolean flag = true;
        while (flag) {
            int rdmdigit = random.nextInt(max - min) + min;
            if (rdmdigit % 2 == 1) {
                System.out.println(mark + " успешно завелась!");
                flag = false;
            } else {
                new CarException().exception();
                count++;
                if (count > 2) {
                    System.out.println("Бесполезно, " + mark + " не завелась!");
                    flag = false;
                } else {
                    System.out.println("Пробуем снова!");
                }
            }
        }

    }
}
