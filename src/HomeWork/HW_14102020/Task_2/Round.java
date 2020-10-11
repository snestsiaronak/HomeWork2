package HomeWork.HW_14102020.Task_2;

public class Round extends Shape{
    private double radius;

    public Round(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public Round(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculatevolume() {
        return 0;
    }
}
