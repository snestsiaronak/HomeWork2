package HomeWork.HW_04112020.Task_3;

import java.util.regex.Pattern;

public class IPValidation {
    public static void main(String[] args) {
        String[] ip = new String[]{"127.0.2.3", "127.255.218.3", "1245.124.0.1", "asd.qw1.1.0"};
        for(String ipn : ip){
            if (!Pattern.matches("[0-9]{1,3}+\\.+[0-9]{1,3}+\\.+[0-9]{1,3}+\\.+[0-9]{1,3}", ipn)) {
                System.out.println(ipn + " Введен не верно!");
            }else{
                System.out.println(ipn + " Введен корректно!");
            }
        }
    }
}
