package HomeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirth;
    private int course;

    public Student(String name, String surname, String dateOfBirth, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(String dateOfBirth) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = ft.parse(dateOfBirth);
            Date datemin = ft.parse("1930-01-01");
            Date datemax = new Date();
            if (date.compareTo(datemin) > 0 && date.compareTo(datemax) < 0) {
                this.dateOfBirth = dateOfBirth;
            } else {
                System.out.println("Incredible date!");
            }
        } catch (ParseException e) {
            System.out.println("Date incorrect!");
        }
    }

    public void setCourse(int course) {
        if (course > 0 && course < 7) {
            this.course = course;
        } else {
            System.out.println("Не корректно введен курс!");
        }
    }
}
