package basic;

import java.util.Scanner;

public class TextFromTerminal {
    public static void main(String[] args) {

         /*
            Dzięki obiektowi Scannera możemy szczytywać to co użytkownik wpisuje w terminalu.
         */

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Witaj " + text);
    }
}
