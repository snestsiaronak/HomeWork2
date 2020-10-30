package HomeWork.HW_04112020.Task_2;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileZipApp {
    public static void main(String[] args) {
        new File("D:/newDirectory").mkdir();
        createFile("D:/newDirectory/note1.txt", "string for first file");
        createFile("D:/newDirectory/note2.txt", "string for second file");
        createFile("D:/newDirectory/note3.txt", "string for third file");
        System.out.println("Убедитесь в создании файлов в каталоге и нажмите Enter");
        inputChoiseString();
        //Архивирование файлов
        List<String> files = Arrays.asList("D:/newDirectory/note1.txt", "D:/newDirectory/note2.txt", "D:/newDirectory/note3.txt");
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("D:/newDirectory/note.zip"))) {
            for(String file : files){
                File fileToZip=new File(file);
                FileInputStream fis=new FileInputStream(fileToZip);
                ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
                zout.putNextEntry(zipEntry);
                byte[] buffer=new byte[fis.available()];
                fis.read(buffer);
                fis.close();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Убедитесь в создании архива в каталоге и нажмите Enter");
        inputChoiseString();
        //переименование каталога
        File name=new File("D:/newDirectory");
        File newName=new File("D:/newDirectoryNew");
        if(name.isDirectory()){
            name.renameTo(newName);
        }
        System.out.println("Убедитесь в переименовании каталога и нажмите Enter");
        inputChoiseString();
        File[] listFiles=newName.listFiles();
        System.out.println("В каталоге находится:");
        for(File file : listFiles){
            System.out.println(file.getAbsoluteFile());
        }
        System.out.println("Для удаления этого каталога нажмите Enter");
        inputChoiseString();
        for(File file : listFiles){
            file.getAbsoluteFile().delete();
        }
        newName.delete();
    }
    public static String inputChoiseString() {
        Scanner scann = new Scanner(System.in);
        return scann.nextLine();
    }

    public static void createFile(String path, String fileText) {
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(fileText);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
