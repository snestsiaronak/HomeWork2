package HomeWork.HW_04112020.Task_1;

import java.io.FileInputStream;
import java.io.IOException;

public class ReversWordString {
    public static void main(String[] args) {
        String fileName = "note.txt";
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, fis.available());
            String textRead = new String(buffer);
            String[] textSplit = textRead.split(" ");
            for (int i = textSplit.length - 1; i >= 0; i--) {
                System.out.print(textSplit[i] + " ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
