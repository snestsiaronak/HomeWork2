package HomeWork;

public class HW_30092020_Task_2 {
    public static void main(String[] args) {
        //Задача о делении амеб
        System.out.println("Задача о делении амеб!");
        int ameba = 1;
        for (int i = 3; i <= 24; i += 3) {
            ameba *= 2;
            System.out.printf("Через %d часов будет %d амеб \n", i, ameba);
        }
    }
}
