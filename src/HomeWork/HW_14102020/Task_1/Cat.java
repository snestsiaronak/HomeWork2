package HomeWork.HW_14102020.Task_1;

public class Cat extends Animal implements Shout {
    public Cat(String name, int agressionlevel) {
        super(name, agressionlevel);
    }

    @Override
    public void shout() {
        System.out.println(getName() + " shout MEOW!!!");
    }
}
