package HomeWork;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class HomeWorkSring {
    public static void main(String[] args) {
        Scanner changer = new Scanner(System.in);
        String letter = changer.next();
        letter = letter.replace('A', 'N');
        letter = letter.replace('B', 'A');
        letter = letter.replace('N', 'B');
        System.out.println(letter);

        }
}
