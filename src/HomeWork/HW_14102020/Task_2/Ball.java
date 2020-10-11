package HomeWork.HW_14102020.Task_2;

import static java.lang.Math.PI;

public class Ball extends Round{
    public Ball( double radius) {
        super(radius);
    }

    @Override
    public double calculatevolume() {
        double tmp = getRadius();
        return 4*PI*tmp*tmp*tmp/3;
    }
}
