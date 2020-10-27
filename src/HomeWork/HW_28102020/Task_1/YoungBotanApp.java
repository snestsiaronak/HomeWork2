package HomeWork.HW_28102020.Task_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class YoungBotanApp {
    public static void main(String[] args) {
        Map<String, String> botanMap = new HashMap<>();
        Plant plant1 = new Plant("berry", "watermelon");
        Plant plant2 = new Plant("berry", "strawberry");
        Plant plant3 = new Plant("berry", "blueberry");
        Plant plant4 = new Plant("vegetables", "carrot");

        botanMap.put(plant1.getPlantName(), plant1.getPlantType());
        botanMap.put(plant2.getPlantName(), plant2.getPlantType());
        botanMap.put(plant3.getPlantName(), plant3.getPlantType());
        botanMap.put(plant4.getPlantName(), plant4.getPlantType());

        typeAndExample(botanMap);
        System.out.println("---------------------");
        typeGet(botanMap, "strawberry");
    }

    public static void typeAndExample(Map<String, String> map) {
        Set<String> uniqueType = new HashSet<>(map.values());
        for (String type : uniqueType) {
            System.out.println(type + " is:");
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            for (Map.Entry<String, String> tmp : entrySet) {
                if (type.equals(tmp.getValue())) {
                    System.out.println(tmp.getKey());
                }
            }
        }
    }

    public static void typeGet(Map<String, String> map, String key) {
        System.out.println(key + " is " + map.get(key));
    }
}
