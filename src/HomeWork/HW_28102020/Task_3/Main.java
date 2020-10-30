package HomeWork.HW_28102020.Task_3;

import java.util.*;

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


        ArrayList<Integer> allKeys = new ArrayList<>(someMap.keySet());
        for (int tmp : allKeys) {
            System.out.println(tmp);
        }
        ArrayList<String> allValues = new ArrayList<>(someMap.values());
        for (String tmp : allValues) {
            System.out.println(tmp);
        }
    }
}
