package HomeWork.HW_28102020.Task_2;

import java.util.ArrayList;

public class Persons {
    String name;
    private ArrayList<Products> arrayList;

    public Persons(String name, ArrayList<Products> arrayList) {
        this.name = name;
        this.arrayList = arrayList;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Products> getArrayList() {
        return arrayList;
    }
}
