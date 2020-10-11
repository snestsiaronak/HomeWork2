package HomeWork.HW_14102020.Task_3;

public class FahrenheitConverter implements Converter{
    @Override
    public void convert(double value) {
        System.out.println(value + " Fahrenheit is " + (value - 32)/1.8 + " Celsius");
        System.out.println(value + " Fahrenheit is " + ((value - 32)/1.8 + 273.15) + " Kelvin");
    }
}
