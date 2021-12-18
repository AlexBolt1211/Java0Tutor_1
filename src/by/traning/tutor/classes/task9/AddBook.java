package by.traning.tutor.classes.task9;

import java.util.Scanner;

public class AddBook {
    Scanner scanner = new Scanner(System.in);
    public static String readNotEmptyString(Scanner scanner) {
        String string = "";
        while (string.length() == 0) {
            string = scanner.nextLine();
        }
        return string;
    }
}
