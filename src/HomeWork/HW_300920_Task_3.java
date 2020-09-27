package HomeWork;

public class HW_300920_Task_3 {
    public static void main(String[] args) {
//Задача о сумме нечетных чисел
        System.out.println("Задача о сумме нечетных чисел!");
        int summa = 0;
        for (int i = 1; i < 100; i += 2) {
            summa += i;
        }
        System.out.println("Сумма нечетных чисел от 1 до 99 = " + summa);
    }
}
