package HomeWork.HW_04112020.Task_3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DataValidation {
    public static void main(String[] args) {
        System.out.println("Введите дату и время в формате YYYY/MM/DD HH:MM:SS");
        String data=inputChoiseString();
        String[] datatime=data.split(" ");
        String regexd="^((19|20)\\d\\d)/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])$";
        String regext="([01]?[1-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
        int flag =0;
        if (!Pattern.matches(regexd, datatime[0])) {
            System.out.println(datatime[0] + " дата введена не верно!");
        }else{
            flag++;
        }
        if(!Pattern.matches(regext, datatime[1])){
            System.out.println(datatime[1] + " время введено не верно!");
        }else{
            flag++;
        }
        if(flag==2){
            System.out.println("Дата и время введены корркетно!");
        }
    }
    public static String inputChoiseString() {
        Scanner scann = new Scanner(System.in);
        return scann.nextLine();
    }
}
