package id_27344.q10;

import id_27344.utils.OutputHelper;

import java.util.Scanner;


public class InputHelper {

    public static int readInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            OutputHelper.printWithID(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine();
                if (value > 0) break;
                OutputHelper.printWithID("Invalid input! Number must be greater than 0.");
            } else {
                OutputHelper.printWithID("Invalid input! Please enter a whole number.");
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
                scanner.nextLine();
                if (value > 0) break;
                OutputHelper.printWithID("Invalid input! Value must be greater than 0.");
            } else {
                OutputHelper.printWithID("Invalid input! Please enter a valid number.");
                scanner.nextLine();
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
            OutputHelper.printWithID("Input cannot be empty. Try again.");
        }
        return value;
    }

    public static String readEmail(Scanner scanner, String prompt) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine().trim();
            if (value.contains("@") && value.contains(".")) break;
            OutputHelper.printWithID("Invalid email format. Try again.");
        }
        return value;
    }

    public static String readCode(Scanner scanner, String prompt, int minLength) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine().trim();
            if (value.length() >= minLength) break;
            OutputHelper.printWithID("Value must be at least " + minLength + " characters.");
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

    public static String readName(Scanner scanner, String prompt) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine().trim();
            if (value.matches("[A-Za-z ]+")) break;
            OutputHelper.printWithID("Invalid input! Only letters and spaces are allowed.");
        }
        return value;
    }

    public static String readDate(Scanner scanner, String prompt) {
        String value;
        while (true) {
            OutputHelper.printWithID(prompt);
            value = scanner.nextLine().trim();
            if (value.matches("\\d{4}-\\d{2}-\\d{2}")) break;
            OutputHelper.printWithID("Invalid date format! Please use YYYY-MM-DD.");
        }
        return value;
    }
}

