package HomeWork;

public class HW_07102020_Task_4 {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel Core", 8, 1000);
        computer.printinfo(computer);
        boolean flag = true;
        int start = 0;
        while (flag) {
            switch (start) {
                case 0:
                    System.out.println("Комп выключен!");
                    start = computer.turnOnOf(start);
                    break;
                case 1:
                    System.out.println("Комп включен!");
                    start = computer.turnOnOf(start);
                    break;
                case -1:
                    System.out.println("Комп сгорел!");
                    start = computer.turnOnOf(start);
                    start--;
                    break;
                default:
                    System.out.println("Комп сгорел, неси в ремонт!");
                    flag = false;
                    break;
            }
        }
    }
}
