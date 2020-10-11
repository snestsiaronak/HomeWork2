package HomeWork.HW_14102020.Task_1;

public class Animal implements Run, Eat, Shout {
    protected String name;
    protected int agressionlevel;

    public Animal(String name, int agressionlevel) {
        this.name = name;
        this.agressionlevel = agressionlevel;
    }

    public int getAgressionlevel() {
        return agressionlevel;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat(Animal animal1, Animal animal2) {
        System.out.println(animal1.getName() + " ate " + animal2.getName());
    }

    @Override
    public void beeaten(Animal animal1, Animal animal2) {
        System.out.println(animal1.getName() + " eaten " + animal2.getName());
    }

    @Override
    public void runaway(Animal animal1, Animal animal2) {
        System.out.println(animal1.getName() + " ran away from " + animal2.getName());
    }

    @Override
    public void catchingup(Animal animal1, Animal animal2) {
        System.out.println(animal1.getName() + " caught up with " + animal2.getName());
    }

    @Override
    public void shout() {

    }
}
