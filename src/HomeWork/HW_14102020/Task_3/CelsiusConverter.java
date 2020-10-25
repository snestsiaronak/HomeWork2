package HomeWork.HW_14102020.Task_3;

public class CelsiusConverter implements Converter {
    @Override
    public void convert(double value) {
        System.out.println(value + " Celsius is " + (value * 1.8 + 32) + " Fahrenheit");
        System.out.println(value + " Celsius is " + (value + 273.15) + " Kelvin");
    }
}
