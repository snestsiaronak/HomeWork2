package HomeWork.HW_21102020.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LetterInAlphabet letterInAlphabet = new LetterInAlphabet();
        System.out.println("Input letter:");
        String letter = inputletter();
        letterInAlphabet.getLetterPosition(letter);
    }

    public static String inputletter() {
        Scanner scann = new Scanner(System.in);
        return scann.next();
    }
}
