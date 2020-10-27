package HomeWork.HW_28102020.Task_4;

import java.util.ArrayList;

public class AutoApp {
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<Cars> autoSaloon = new ArrayList<>();
        autoSaloon.add(new Cars(111, "Audi", "A4", "red", 30000));
        autoSaloon.add(new Cars(112, "VW", "polo", "brown", 10000));
        System.out.println("Приветствуем Вас в нашем автосалоне!");
        System.out.println("Если вы хотите добавить автомобиль - введите 1");
        System.out.println("Если вы хотите продать автомобиль - введите 2");
        System.out.println("Если вы хотите получить список имеющихся автомобилей - введите 3");
        System.out.println("Если вы хотите найти авто по параметрам - введите 4");
        System.out.println("Если вы хотите завешить работу - введите 0");
        while (flag) {
            int nn = Cars.inputChoiseInt();
            switch (nn) {
                case 1:
                    autoSaloon.add(Cars.addCars());
                    System.out.println("Авто успешно добавлено.");
                    System.out.println("Сделайте выбор:");
                    break;
                case 2:
                    if(autoSaloon.size()==0){
                        new AutoException().isEmpty();
                    }else{
                        for (Cars ca : autoSaloon) {
                            System.out.println(ca.toString());
                        }
                        System.out.println("Введите номер кузова авто для продажи:");
                        int numCars = Cars.inputChoiseInt();
                        if (Cars.soledCars(autoSaloon, numCars)) {
                            System.out.println("Автомобиль успешно продан");
                        } else {
                            new AutoException().isAvailable();
                        }
                    }
                    System.out.println("Сделайте выбор:");
                    break;
                case 3:
                    if(autoSaloon.size()==0){
                        new AutoException().isEmpty();
                    }else{
                        for (Cars ca : autoSaloon) {
                            System.out.println(ca.toString());
                        }
                    }
                    System.out.println("Сделайте выбор:");
                    break;
                case 4:
                    System.out.println("Укажите параметры поиска, если парамерт не важен введите 0");
                    System.out.println("Марка автомобиля:");
                    String markAuto=Cars.inputChoiseString();
                    System.out.println("Цвет автомобиля:");
                    String colorAuto=Cars.inputChoiseString();
                    System.out.println("Максимальная стоимость автомобиля:");
                    int priceAuto=Cars.inputChoiseInt();
                    int quantityAuto=Cars.findAuto(autoSaloon, markAuto, colorAuto, priceAuto);
                    if(quantityAuto==0){
                        new AutoException().isAvailable();
                    }else{
                        System.out.printf("Всего найдено %d автомобилей \n", quantityAuto);
                    }
                    System.out.println("Сделайте выбор:");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
