package id_27344.q3;

import id_27344.utils.OutputHelper;

import java.util.Scanner;

public class InputHelper {

    public static int readInt(Scanner scanner, String prompt, int minValue) {
        int value;
        while (true) {
            OutputHelper.printWithID(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (value >= minValue) break;
                OutputHelper.printWithID("Value must be at least " + minValue + ".");
            } else {
                OutputHelper.printWithID("Invalid input! Please enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }
        return value;
    }

    public static double readDouble(Scanner scanner, String prompt, double minValue) {
        double value;
        while (true) {
            OutputHelper.printWithID(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                if (value >= minValue) break;
                OutputHelper.printWithID("Value must be at least " + minValue + ".");
            } else {
                OutputHelper.printWithID("Invalid input! Please enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }
        return value;
    }

    public static String readString(Scanner scanner, String prompt) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine().trim();
            if (!value.isEmpty()) break;
            OutputHelper.printWithID("Input cannot be empty!");
        }
        return value;
    }

    public static String readName(Scanner scanner, String prompt) {
        String value;
        while (true) {
            value = readString(scanner, prompt);
            if (value.matches("[A-Za-z ]+")) break;
            OutputHelper.printWithID("Invalid input! Only letters and spaces are allowed.");
        }
        return value;
    }

    public static String readEmail(Scanner scanner, String prompt) {
        String value;
        while (true) {
            value = readString(scanner, prompt);
            if (value.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) break;
            OutputHelper.printWithID("Invalid email format!");
        }
        return value;
    }

    public static String readPhone(Scanner scanner, String prompt) {
        String value;
        while (true) {
            value = readString(scanner, prompt);
            if (value.matches("\\d{10}")) break;
            OutputHelper.printWithID("Phone must be 10 digits!");
        }
        return value;
    }

}



