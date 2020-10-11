package HomeWork.HW_14102020.Task_2;

public class Pyramid extends Shape{
    private double squarebase;
    private double height;

    public Pyramid(double squarebase, double height) {
        this.squarebase = squarebase;
        this.height = height;
    }

    @Override
    public double calculatevolume() {
        return squarebase*height/3;
    }
}
