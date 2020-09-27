package HomeWork;
import java.util.Random;

public class HW_230920_Task_2 {
    public static void main(String[] args) {
        //Задача о днях недели
        int min = 1;
        int max = 10;

        Random random = new Random();
        System.out.println("Задача о днях недели!");

        int day = random.nextInt(max - min) + min;
        System.out.println("Сгенерировано число " + day);
        switch (day) {
            case 1:
                System.out.println("Выбран понедельник!");
                break;
            case 2:
                System.out.println("Выбран вторник!");
                break;
            case 3:
                System.out.println("Выбрана среда!");
                break;
            case 4:
                System.out.println("Выбран четверг!");
                break;
            case 5:
                System.out.println("Выбрана пятница!");
                break;
            case 6:
                System.out.println("Выбрана суббота!");
                break;
            case 7:
                System.out.println("Выбрано воскресенье!");
                break;
            default:
                System.out.println("Нет такого дня!");
        }
    }
}
