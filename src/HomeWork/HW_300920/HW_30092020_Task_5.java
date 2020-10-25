package HomeWork;

public class HW_30092020_Task_5 {
    public static void main(String[] args) {
        int number = 21;
        int result = simple(number, number - 1);
        if (result == 0) {
            System.out.printf("Is number %d simple - YES!", number);
        } else {
            System.out.printf("Is number %d simple - NO!", number);
        }
    }
    static int simple(int number, int num2) {
        int tmp = 0;
        if (num2 == 1) {
            return tmp;
        }
        if (number % num2 == 0) {
            tmp = 1 + simple(number, num2 - 1);
        } else {
            tmp = simple(number, num2 - 1);
        }
        return tmp;
    }
}
