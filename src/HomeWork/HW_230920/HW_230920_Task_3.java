package HomeWork;

public class HW_230920_Task_3 {
    public static void main(String[] args) {
        //Задача о выводе звездочек в консоль
        System.out.println("Задача о выводе звездочек в консоль!");
        /*В принципе создание массива здесь не требуется,
        он создан для использования при усложнении задачи
         Достаточно сделать вот так:
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        char[][] array = new char[4][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = '*';
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
