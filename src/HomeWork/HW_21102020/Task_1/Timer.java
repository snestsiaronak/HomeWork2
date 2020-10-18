package HomeWork.HW_21102020.Task_1;

public class Timer implements Callback {
    @Override
    public void writeTime(String time) {
        System.out.println(time);
    }

    public String convertTime(int timeinsek) {
        return "Со старта прошло " + (timeinsek / 60) +
                " минут " + (timeinsek % 60) + " секунд ";
    }
}
