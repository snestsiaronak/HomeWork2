package HomeWork.HW_14102020.Task_1;

public class Dog extends Animal implements Shout {
    public Dog(String name, int agressionlevel) {
        super(name, agressionlevel);
    }

    public void shout() {
        System.out.println(getName() + " shout WOOF!!!");
    }
}
