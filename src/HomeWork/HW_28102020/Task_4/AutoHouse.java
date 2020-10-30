package HomeWork.HW_28102020.Task_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AutoHouse {
    public static Cars addCars() {
        System.out.println("Введите номер кузова:");
        int num = inputChoiseInt();
        System.out.println("Введите марку авто:");
        String mark = inputChoiseString();
        System.out.println("Введите модель авто:");
        String model = inputChoiseString();
        System.out.println("Введите цвет авто:");
        String color = inputChoiseString();
        System.out.println("Введите цену авто:");
        int price = inputChoiseInt();
        return new Cars(num, mark, model, color, price);
    }

    public static int inputChoiseInt() {
        Scanner scann = new Scanner(System.in);
        while (!scann.hasNextInt()) {
            System.out.print("Это не целое числло! Попробуй еще раз! ");
            scann.next();
        }
        return scann.nextInt();
    }

    public static String inputChoiseString() {
        Scanner scann = new Scanner(System.in);
        return scann.next();
    }
    public static boolean soledCars(ArrayList<Cars> arr, int num) {
        boolean rez=false;
        Iterator<Cars> car=arr.iterator();
        while (car.hasNext()) {
            Cars s = car.next();
            if (s.getBodyNumber() == num){
                car.remove();
                rez=true;
            }
        }
       /* for (Cars car : arr) {
            if (car.getBodyNumber() == num) {
                arr.remove(car);
                rez=true;
            }
        }*/
        return rez;
    }
    public static int findAuto(ArrayList<Cars> arr, String mark, String color, int price){
        int rez=0;
        for(Cars car : arr){
            if(mark.equals("0")){
                if(color.equals("0")){
                    if(price==0){
                        System.out.println(car.toString());
                        rez++;
                    }else{
                        if(car.getPrice()<=price){
                            System.out.println(car.toString());
                            rez++;
                        }
                    }
                }else{
                    if(price>0){
                        if(car.getColor().equals(color) && car.getPrice()<=price){
                            System.out.println(car.toString());
                            rez++;
                        }
                    }else{
                        if(car.getColor().equals(color)){
                            System.out.println(car.toString());
                            rez++;
                        }
                    }
                }
            }else{
                if(car.getColor().equals(color)){
                    if(price>0){
                        if(car.getMark().equals(mark) && car.getColor().equals(color) && car.getPrice()<=price){
                            System.out.println(car.toString());
                            rez++;
                        }
                    }else{
                        if(car.getMark().equals(mark) && car.getColor().equals(color)){
                            System.out.println(car.toString());
                            rez++;
                        }
                    }
                }else{
                    if(price>0){
                        if(car.getMark().equals(mark) && car.getPrice()<=price){
                            System.out.println(car.toString());
                            rez++;
                        }
                    }else{
                        if(car.getMark().equals(mark)){
                            System.out.println(car.toString());
                            rez++;
                        }
                    }
                }
            }
        }
        return rez;
    }
}
