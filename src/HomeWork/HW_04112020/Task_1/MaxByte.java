package HomeWork.HW_04112020.Task_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MaxByte {
    public static void main(String[] args) {
        String text = "You need to run fast every day!";
        System.out.println("Введите название файла:");
        String fileName = inputChoiseString();
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
            System.out.println("Файл успешно записан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int max = -128;
            int i;
            while ((i = fis.read()) != -1) {
                if (i > max) {
                    max = i;
                }
            }
            System.out.println("Максимальный байт: " + (char) max);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static String inputChoiseString() {
        Scanner scann = new Scanner(System.in);
        return scann.nextLine();
    }
}
