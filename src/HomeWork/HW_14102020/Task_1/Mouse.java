package HomeWork.HW_14102020.Task_1;

public class Mouse extends Animal implements Shout {
    public Mouse(String name, int agressionlevel) {
        super(name, agressionlevel);
    }

    @Override
    public void shout() {
        System.out.println(getName() + " shout PI-PI-PI!!!");
    }
}
