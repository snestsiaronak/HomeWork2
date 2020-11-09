package HomeWork.HW_04112020.Task_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MinByte {
    public static void main(String[] args) {
        String text = "You_need_to_run_fast-every-day!";
        //  создание файла
        System.out.println("Введите название файла:");
        String fileName = inputChoiseString();
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
            System.out.println("Файл успешно записан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //чтение из файла и поиск минимального байта
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int min = 127;
            int i;
            while ((i = fis.read()) != -1) {
                if (i < min) {
                    min = i;
                }
            }
            System.out.println("Минимальный байт: " + (char) min);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String inputChoiseString() {
        Scanner scann = new Scanner(System.in);
        return scann.nextLine();
    }
}
