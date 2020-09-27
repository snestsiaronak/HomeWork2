package HomeWork;

public class HW_300920_Task_1 {
    public static void main(String[] args) {
//Задача про спортсмена и дистанцию пробега
        System.out.println("Задача о дистанции пробега спортсмена за 7 дней!");
        double distance = 10;
        double rezult = distance;
        for (int i = 2; i <= 7; i++) {
            distance *= 1.1;
            rezult += distance;
        }
        System.out.printf("За 7 длней спортсмен пробезал %f километров", rezult);
    }
}
