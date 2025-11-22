package id_27344.q9;
import id_27344.utils.OutputHelper;

import java.util.Scanner;



public class InputHelper {

    public static int readInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            OutputHelper.printWithID(prompt);  // prompt also concatenated
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value <= 0) {
                    OutputHelper.printWithID("Value must be greater than 0. Try again.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                OutputHelper.printWithID("Invalid integer. Try again.");
            }
        }
    }

    public static double readDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            OutputHelper.printWithID(prompt);
            try {
                value = Double.parseDouble(scanner.nextLine());
                if (value < 0) {
                    OutputHelper.printWithID("Value cannot be negative. Try again.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                OutputHelper.printWithID("Invalid number. Try again.");
            }
        }
    }

    public static String readString(Scanner scanner, String prompt) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine();
            if (value.trim().isEmpty()) {
                OutputHelper.printWithID("Input cannot be empty. Try again.");
            } else {
                return value;
            }
        }
    }

    public static String readEmail(Scanner scanner, String prompt) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine();
            if (!value.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
                OutputHelper.printWithID("Invalid email. Try again.");
            } else {
                return value;
            }
        }
    }
}

