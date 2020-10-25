package HomeWork.HW_21102020.Task_3;

public class Main {
    public static void main(String[] args) {
        MassivElement<Integer> massivElement = new MassivElement<>(new Integer[]{1, 3, 5, 7, 9, 2});
        MassivElement<Double> massivElementd = new MassivElement<>(new Double[]{2.3, 4.2, 7.1});
        int index = 2, indexd = 1;
        int rez = massivElement.elementOfIndex(2);
        double rez1 = massivElementd.elementOfIndex(1);
        System.out.println("В целочисленном массиве на позиции " + index + " " +
                "стоит " + massivElement.elementOfIndex(index));
        System.out.println("В double массиве на позиции " + indexd + " " +
                "стоит " + massivElementd.elementOfIndex(indexd));
    }
}
