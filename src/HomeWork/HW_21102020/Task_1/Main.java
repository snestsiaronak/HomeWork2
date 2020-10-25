package HomeWork.HW_21102020.Task_1;

public class Main {
    public static void main(String[] args) {
        int sec = 0;
        boolean flag = true;
        Timer timer = new Timer();
        while (flag) {
            timer.writeTime(sec);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            sec += 10;
        }
    }
}
