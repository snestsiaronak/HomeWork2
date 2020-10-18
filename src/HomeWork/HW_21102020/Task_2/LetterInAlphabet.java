package HomeWork.HW_21102020.Task_2;

public class LetterInAlphabet {
    public void getLetterPosition(String letter) {
        try {
            Alphabet alf = Alphabet.valueOf(letter);
            System.out.println("Position of letter " + letter + " is " + (alf.ordinal() + 1));
        } catch (Exception ex) {
            ex.getMessage();
            System.out.println("There is no such letter in alphabet!");
        }
    }
}
enum Alphabet {
    a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
}