package HomeWork;

import java.util.ArrayList;

public class HW_07102020_Task_1 {
    public static void main(String[] args) {
        ArrayList<Student> listofstudent = new ArrayList<Student>();
        Student student1 = new Student("Ivan", "Ivanov", "1999-01-11", 3);
        student1.setDateOfBirth(student1.getDateOfBirth());
        student1.setCourse(student1.getCourse());
        listofstudent.add(student1);
        Student student2 = new Student("Anna", "Petrova", "2000-05-28", 2);
        student2.setDateOfBirth(student2.getDateOfBirth());
        student2.setCourse(student2.getCourse());
        listofstudent.add(student2);
        Student student3 = new Student("Vasia", "Moroz", "1999-03-06", 3);
        student3.setDateOfBirth(student3.getDateOfBirth());
        student3.setCourse(student3.getCourse());
        listofstudent.add(student3);
        Student student4 = new Student("Maria", "Sidorova", "2000-03-31", 2);
        student4.setDateOfBirth(student4.getDateOfBirth());
        student4.setCourse(student4.getCourse());
        listofstudent.add(student4);

        printStudent(listofstudent, 2);
    }
    public static void printStudent(ArrayList<Student> liststud, int curs) {
        System.out.printf("Студенты %d курса:\n", curs);
        for (Student i : liststud) {
            if (i.getCourse() == curs) {
                System.out.println(i.getName() + " " + i.getSurname() + " " + i.getDateOfBirth());
            }
        }
    }
}
