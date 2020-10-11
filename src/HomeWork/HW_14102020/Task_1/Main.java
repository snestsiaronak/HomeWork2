package HomeWork.HW_14102020.Task_1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Mouse mouse = new Mouse("Pik", 0);
        Dog dog = new Dog("Jack", 10);
        relationship(mouse, dog);
        relationship(dog, cat);
    }

    public static void relationship(Animal animal1, Animal animal2) {
        if (animal1.getAgressionlevel() > animal2.getAgressionlevel()) {
            animal1.catchingup(animal1, animal2);
            animal2.runaway(animal2, animal1);
            animal2.shout();
            animal1.eat(animal1, animal2);
            animal2.beeaten(animal2, animal1);
        } else {
            animal2.catchingup(animal2, animal1);
            animal1.runaway(animal1, animal2);
            animal1.shout();
            animal2.eat(animal2, animal1);
            animal1.beeaten(animal1, animal2);
        }
    }
}
