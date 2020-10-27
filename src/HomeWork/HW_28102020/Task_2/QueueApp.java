package HomeWork.HW_28102020.Task_2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Products milk = new Products("milk", 1);
        Products meat = new Products("meat", 2.2);
        Products carrot = new Products("carrot", 0.5);
        Products bread = new Products("bread", 0.2);
        ArrayList<Products> productsList1 = new ArrayList<>();
        productsList1.add(milk);
        productsList1.add(meat);
        ArrayList<Products> productsList2 = new ArrayList<>();
        productsList2.add(bread);
        productsList2.add(carrot);
        productsList2.add(meat);
        ArrayList<Products> productsList3 = new ArrayList<>();
        productsList3.add(milk);
        productsList3.add(meat);
        productsList3.add(carrot);
        productsList3.add(bread);
        Queue<Persons> myQueue = new ArrayDeque<>();
        myQueue.add(new Persons("Vasia", productsList1));
        myQueue.add(new Persons("Petia", productsList2));
        myQueue.add(new Persons("Masha", productsList3));
        while (myQueue.size() > 0) {
            Persons person = myQueue.poll();
            System.out.println("Идет " + person.getName());
            System.out.println("Список продуктов:");
            for (Products pr : person.getArrayList()) {
                System.out.println(pr.getName());
            }
            System.out.println("Цена за все:");
            System.out.println(priceCalculate(person.getArrayList()));
            if (myQueue.size() > 0) {
                System.out.println("Следующий");
            } else {
                System.out.println("Очередь закончилась");
            }
        }
    }

    public static double priceCalculate(ArrayList<Products> prod) {
        double rez = 0;
        for (Products pr : prod) {
            rez += pr.getPrice();
        }
        return rez;
    }
}
