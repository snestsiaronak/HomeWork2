package HomeWork.HW_21102020.Task_1;

public class Timer implements Callback {
    @Override
    public void writeTime(int timeInSek) {
        System.out.println("Со старта прошло " + (timeInSek / 60) +
                " минут " + (timeInSek % 60) + " секунд ");
    }
}
