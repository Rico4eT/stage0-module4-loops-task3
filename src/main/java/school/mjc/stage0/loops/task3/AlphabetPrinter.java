package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char letter;
        for (int position = 97; position <= 122; position++) {
            letter = (char) position;
            System.out.println(letter);
        }
    }
}
