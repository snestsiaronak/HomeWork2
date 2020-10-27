package HomeWork.HW_28102020.Task_3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> someMap = new HashMap<>();
        someMap.put(0, "диван");
        someMap.put(1, "чемодан");
        someMap.put(2, "саквояж");
        someMap.put(3, "корзина");
        someMap.put(4, "картина");
        someMap.put(5, "картонка");
        someMap.put(6, "маленькая собачонка");


        Set<Integer> allKeys=someMap.keySet();
        for(int tmp : allKeys){
            System.out.println(tmp);
        }
        Collection<String> allValues= someMap.values();
        for (String tmp : allValues){
            System.out.println(tmp);
        }
    }
}
