package HomeWork.HW_28102020.Task_4;

public class AutoException extends Exception{
    public void isAvailable(){
        System.out.println("Такого автомобиля нет в автосалоне! ");
    }
    public void isEmpty(){System.out.println("Автомобилей в салоне нет!");}
}
