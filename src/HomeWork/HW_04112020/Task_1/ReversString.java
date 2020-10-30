package HomeWork.HW_04112020.Task_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        System.out.println("Введите строку для переворота:");
        String text2 = inputChoiseString();
        byte[] tmpBufer = text2.getBytes();
        byte[] bufrevers = new byte[text2.length()];
        for (int i = text2.length() - 1; i >= 0; i--) {
            bufrevers[text2.length() - 1 - i] = tmpBufer[i];
        }
        String fileName2 = "notes.txt";
        try (FileOutputStream fos = new FileOutputStream(fileName2)) {
            fos.write(bufrevers, 0, bufrevers.length);
            System.out.println("Файл успешно записан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String inputChoiseString() {
        Scanner scann = new Scanner(System.in);
        return scann.nextLine();
    }
}
