package id_27344.q5;

import id_27344.utils.OutputHelper;

import java.util.Scanner;

public class InputHelper {

    public static int readInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            OutputHelper.printWithID(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (value >= 0) break;
                else  OutputHelper.printWithID("Number cannot be negative. Try again.");
            } else {
                OutputHelper.printWithID("Invalid input. Enter a valid integer.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static double readDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            OutputHelper.printWithID(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                if (value >= 0) break;
                else  OutputHelper.printWithID("Number cannot be negative. Try again.");
            } else {
                OutputHelper.printWithID("Invalid input. Enter a valid number.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static String readString(Scanner scanner, String prompt) {
        String input;
        while (true) {
            OutputHelper.printWithID(prompt);
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) break;
            OutputHelper.printWithID("Input cannot be empty. Try again.");
        }
        return input;
    }

    public static String readPhone(Scanner scanner, String prompt) {
        String input;
        while (true) {
            input = readString(scanner, prompt);
            if (input.matches("\\d{10}")) break;
            OutputHelper.printWithID("Phone number must be 10 digits. Try again.");
        }
        return input;
    }

    public static String readDate(Scanner scanner, String prompt) {
        String input;
        while (true) {
            input = readString(scanner, prompt);
            if (input.matches("\\d{4}-\\d{2}-\\d{2}")) break;
            OutputHelper.printWithID("Invalid date format. Use YYYY-MM-DD.");
        }
        return input;
    }

    public static String readCode(Scanner scanner, String prompt) {
        String input;
        while (true) {
            input = readString(scanner, prompt);
            if (input.length() >= 3) break;
            OutputHelper.printWithID("Code must be at least 3 characters.");
        }
        return input;
    }
}

