package id_27344.q8;

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
                if (value > 0) { // check if greater than 0
                    break;
                } else {
                    OutputHelper.printWithID("Invalid input! Number must be greater than 0.");
                }
            } else {
                OutputHelper.printWithID("Invalid input! Please enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }
        return value;
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

    public static String readText(Scanner scanner, String prompt) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine().trim();
            // Allow letters, numbers, space, . , ; : -
            if (value.matches("[A-Za-z0-9 .,;:-]+")) break;
            OutputHelper.printWithID("Invalid input! Only letters, numbers and . , ; : - are allowed.");
        }
        return value;
    }

    public static String readPhone(Scanner scanner, String prompt) {
        String input;
        while (true) {
            OutputHelper.printWithID(prompt);
            input = scanner.nextLine().trim();
            if (input.matches("\\d{10}")) return input;
            OutputHelper.printWithID("Phone number must be exactly 10 digits. Try again.");
        }
    }

    public static String readDate(Scanner scanner, String prompt) {
        String input;
        while (true) {
            OutputHelper.printWithID(prompt);
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) return input;
            OutputHelper.printWithID("Date cannot be empty. Try again.");
        }
    }

    public static String readISBN(Scanner scanner, String prompt) {
        String input;
        while (true) {
            OutputHelper.printWithID(prompt);
            input = scanner.nextLine().trim();
            if (input.length() >= 10) return input;
            OutputHelper.printWithID("ISBN must be at least 10 characters. Try again.");
        }
    }

    public static String readSectionCode(Scanner scanner, String prompt) {
        String input;
        while (true) {
            OutputHelper.printWithID(prompt);
            input = scanner.nextLine().trim();
            if (input.length() >= 3) return input;
            OutputHelper.printWithID("Section code must be at least 3 characters. Try again.");
        }
    }
}

