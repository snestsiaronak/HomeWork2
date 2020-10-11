package HomeWork.HW_14102020.Task_2;

import static java.lang.Math.PI;

public class Cylindr extends Round{
    private double height;

    public Cylindr(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double calculatevolume() {
        double tmp = getRadius();
        return PI*tmp*tmp*height;
    }
}
