package HomeWork.HW_21102020.Task_3;

public class MassivElement<T> {
    T[] massiv;

    public MassivElement(T[] massiv) {
        this.massiv = massiv;
    }

    public T elementOfIndex(int index){
        return massiv[index];
    }
}
