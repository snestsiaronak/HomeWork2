package HomeWork.HW_14102020.Task_3;

public class KelvinConverter implements Converter{
    @Override
    public void convert(double value) {
        System.out.println(value + " Kelvin is " + ((value * 1.8 + 32)-273.15) + " Fahrenheit");
        System.out.println(value + " Kelvin is " + (value - 273.15) + " Celsius");
    }
}
