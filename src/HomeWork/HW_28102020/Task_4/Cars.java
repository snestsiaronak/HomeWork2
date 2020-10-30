package HomeWork.HW_28102020.Task_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Cars {
    private int bodyNumber;
    private String mark;
    private String model;
    private String color;
    private int price;

    public Cars(int bodyNumber, String mark, String model, String color, int price) {
        this.bodyNumber = bodyNumber;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public int getBodyNumber() {
        return bodyNumber;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setBodyNumber(int bodyNumber) {
        this.bodyNumber = bodyNumber;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return bodyNumber == cars.bodyNumber &&
                price == cars.price &&
                Objects.equals(mark, cars.mark) &&
                Objects.equals(model, cars.model) &&
                Objects.equals(color, cars.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyNumber, mark, model, color, price);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "bodyNumber=" + bodyNumber +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
