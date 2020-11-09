package HomeWork.HW_04112020.Task_3;

import java.util.regex.Pattern;

public class DomenValidation {
    public static void main(String[] args) {
        String[] domenName=new String[]{"http://www.example.com", "www.example.com", "https://example.com"};
        String regExDomen="^(http[s]?\\:\\/\\/)((\\w+)\\.)?(([\\w-]+)?)(\\.[\\w-]+){1,2}$";
        for(String domen : domenName){
            if(!Pattern.matches(regExDomen, domen)){
                System.out.println(domen + " введено не корректно!");
            }else{
                System.out.println(domen + " Ссылка указана корректно");
            }
        }

    }
}
