package HomeWork.HW_21102020.Task_4;

public class Main {
    public static void main(String[] args) {
        Cars BMV = new Cars("BMV 320", 220, 15000);
        Cars Audi = new Cars("Audi A6", 260, 20000);

        BMV.start();
        Audi.start();
    }
}
