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
            animal1.catchingUp(animal1, animal2);
            animal2.runAway(animal2, animal1);
            animal2.shout();
            animal1.eat(animal1, animal2);
            animal2.beeAten(animal2, animal1);
        } else {
            animal2.catchingUp(animal2, animal1);
            animal1.runAway(animal1, animal2);
            animal1.shout();
            animal2.eat(animal2, animal1);
            animal1.beeAten(animal1, animal2);
        }
    }
}
