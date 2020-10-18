package HomeWork.HW_14102020.Task_2;

public abstract class Shape {
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public Shape() {
    }

    public double getVolume() {
        return volume;
    }

    public abstract double calculateVolume();
}

