package HomeWork.HW_14102020.Task_2;

public class Box extends Shape{
    public Box(double volume) {
        super(volume);
    }
    @Override
    public double calculatevolume() {
        return getVolume();
    }
}
